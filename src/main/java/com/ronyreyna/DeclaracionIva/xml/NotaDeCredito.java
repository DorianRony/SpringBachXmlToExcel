package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "notaCredito")
public class NotaDeCredito implements Serializable {

    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name = "version")
    private String version;

    @XmlElement(name = "infoTributaria")
    private InfoTributaria infoTributaria;

    @XmlElement(name = "infoNotaCredito")
    private InfoNotaCredito infoNotaCredito;

    @XmlElementWrapper(name="detalles")
    @XmlElement(name="detalle")
    private List<Detalle> detalle;

    @XmlElementWrapper(name="infoAdicional")
    @XmlElement(name="campoAdicional")
    private List<CampoAdicional> campoAdicional;

}