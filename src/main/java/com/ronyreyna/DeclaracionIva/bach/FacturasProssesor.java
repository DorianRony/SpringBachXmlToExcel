package com.ronyreyna.DeclaracionIva.bach;

import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import com.ronyreyna.DeclaracionIva.xml.Factura;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

@Component
public class FacturasProssesor implements ItemProcessor<String, Factura> {

    @Override
    public Factura process(String item) throws Exception {
        return convertirXmlToClass(item);
    }

    private Factura convertirXmlToClass(String xml) {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource src = new InputSource();
            src.setCharacterStream(new StringReader(xml));
            Document doc = builder.parse(src);
            String xmlComprobante = doc.getElementsByTagName("comprobante").item(0)
                .getTextContent();

            String xmlFactura = xmlComprobante.substring(0, xmlComprobante.indexOf("<ds:Signature"))
                .concat("</factura>");

            StringReader stringReaderFactura = new StringReader(xmlFactura);
            JAXBContext jaxbContext = JAXBContext.newInstance(Factura.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (Factura) unmarshaller.unmarshal(stringReaderFactura);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
