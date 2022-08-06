package com.ronyreyna.DeclaracionIva.configuration;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import com.ronyreyna.DeclaracionIva.DTO.ReporteDTO;
import com.ronyreyna.DeclaracionIva.processData.ProcessData;
import com.ronyreyna.DeclaracionIva.xml.Factura;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.stereotype.Component;

@Component
public class JobListener implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution jobExecution) {

    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus().equals(BatchStatus.COMPLETED)) {
            ExecutionContext executionContext = jobExecution.getExecutionContext();
            ProcessData data = (ProcessData) executionContext.get("processData");
            if(Objects.nonNull(data)){
                generateExcel(data);
            }
        }
    }

    private void generateExcel(ProcessData processData) {
        String filename =
            "C:\\Users\\kruger\\Proyectos\\DeclaracionIva\\FACTURAS IVA\\FACTURAS\\REPORTE\\reporteIva.xlsx";

        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Persons");

        Row header = sheet.createRow(0);

        int contTittles = 0;

        Cell razonSocialt = header.createCell(contTittles++);
        razonSocialt.setCellValue("RAZON SOCIAL");

        Cell ruct = header.createCell(contTittles++);
        ruct.setCellValue("RUC");

        Cell numeroFacturat = header.createCell(contTittles++);
        numeroFacturat.setCellValue("NUMERO DE FACTURA");

        Cell fechaEmisiont = header.createCell(contTittles++);
        fechaEmisiont.setCellValue("FECHA DE EMISION");

        Cell ivat = header.createCell(contTittles);
        ivat.setCellValue("IVA");
        List<ReporteDTO> reporteDTOS = processData.getReporteDTOS();

        reporteDTOS.forEach(f -> {
            Row detalles = sheet.createRow(reporteDTOS.indexOf(f) + 1);
            int cont = 0;

            Cell razonSocial = detalles.createCell(cont++);
            razonSocial.setCellValue(f.getRazonSocial());

            Cell ruc = detalles.createCell(cont++);
            ruc.setCellValue(f.getRuc());

            Cell numeroFactura = detalles.createCell(cont++);
            numeroFactura.setCellValue(f.getNumeroFactura());

            Cell fechaEmision = detalles.createCell(cont++);
            fechaEmision.setCellValue(f.getFechaEmision());

            Cell iva = detalles.createCell(cont);
            iva.setCellValue(f.getIva().doubleValue());
        });
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Excel file has been generated successfully.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
