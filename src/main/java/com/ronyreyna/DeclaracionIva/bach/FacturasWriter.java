package com.ronyreyna.DeclaracionIva.bach;

import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import com.ronyreyna.DeclaracionIva.DTO.ReporteDTO;
import com.ronyreyna.DeclaracionIva.DTO.ReporteDTO.ReporteDTOBuilder;
import com.ronyreyna.DeclaracionIva.processData.ProcessData;
import com.ronyreyna.DeclaracionIva.xml.Factura;
import com.ronyreyna.DeclaracionIva.xml.InfoTributaria;
import com.ronyreyna.DeclaracionIva.xml.TotalImpuesto;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.MapJobRepositoryFactoryBean;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.support.transaction.ResourcelessTransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FacturasWriter implements ItemWriter<Factura> {

    private StepExecution stepExecution;

    private List<ReporteDTO> reporteDTOS = new LinkedList<>();

    /**
     * Pass data to {@link com.ronyreyna.DeclaracionIva.configuration.JobListener}.
     *
     * @param stepExecution The step execution.
     */
    @BeforeStep
    public void saveStepExecution(StepExecution stepExecution) {
        this.stepExecution = stepExecution;
    }

    @Override
    public void write(List<? extends Factura> items) throws Exception {
        items.forEach(f -> {
            InfoTributaria infoTributaria = f.getInfoTributaria();
            String numeroFactura = infoTributaria.getEstab().concat("-").concat(infoTributaria.getPtoEmi())
                .concat("-").concat(infoTributaria.getSecuencial());
            ReporteDTO reporteDTO = ReporteDTO.builder()
                .razonSocial(infoTributaria.getRazonSocial())
                .ruc(infoTributaria.getRuc())
                .numeroFactura(numeroFactura)
                .fechaEmision(f.getInfoFactura().getFechaEmision())
                .iva(f.getInfoFactura().getTotalConImpuesto()
                    .stream()
                    .map(TotalImpuesto::getValor)
                    .reduce(BigDecimal.ZERO, BigDecimal::add)).build();
            reporteDTOS.add(reporteDTO);
            System.out.println(reporteDTO.toString());
        });
        ProcessData processData = ProcessData.builder().reporteDTOS(reporteDTOS).build();
        stepExecution.getJobExecution().getExecutionContext().put("processData", processData);
    }
}
