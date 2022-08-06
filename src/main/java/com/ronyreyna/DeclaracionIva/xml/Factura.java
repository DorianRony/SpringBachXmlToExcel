package com.ronyreyna.DeclaracionIva.xml;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "factura")
public class Factura implements Serializable {

    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name = "version")
    private String version;

    @XmlElement(name = "infoTributaria")
    private InfoTributaria infoTributaria;

    @XmlElement(name = "infoFactura")
    private InfoFactura infoFactura;

    @XmlElementWrapper(name="detalles")
    @XmlElement(name="detalle")
    private List<DetalleFactura> detalle;

    @XmlElementWrapper(name="infoAdicional")
    @XmlElement(name="campoAdicional")
    private List<CampoAdicional> campoAdicional;

}