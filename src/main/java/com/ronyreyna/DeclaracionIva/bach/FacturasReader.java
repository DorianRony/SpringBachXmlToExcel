package com.ronyreyna.DeclaracionIva.bach;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import com.ronyreyna.DeclaracionIva.xml.Factura;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.support.IteratorItemReader;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

@Component
public class FacturasReader implements ItemReader<String> {

    private IteratorItemReader<String> facturaIteratorItemReader;

    @Override
    public String read()
        throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return this.facturaIteratorItemReader.read();
    }

    @BeforeStep
    private void beforeStep(StepExecution stepExecution) {
        File folder = new File("C:\\Users\\kruger\\Proyectos\\DeclaracionIva\\FACTURAS IVA\\FACTURAS\\MARIA HERRERA");
        List<String> allFilesInFolder = findAllFilesInFolder(folder);
        this.facturaIteratorItemReader = new IteratorItemReader<>(allFilesInFolder);
    }

    private List<String> findAllFilesInFolder(File folder) {
        File[] files = folder.listFiles();
        if (Objects.nonNull(files) && files.length > 0) {
            return Arrays.stream(files).map(file -> method(file.getAbsolutePath()))
                .collect(Collectors.toList());
        }
        return new LinkedList<>();
    }

    private static String method(String filePath) {
        Path path = Paths.get(filePath);
        StringBuilder builder = new StringBuilder();
        try (BufferedReader buffer = Files.newBufferedReader(path)) {
            String str;
            while ((str = buffer.readLine()) != null) {
                builder.append(str).append("\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }



}
