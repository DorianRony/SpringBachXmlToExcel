package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "comprobanteRetencion")
public class Retencion implements Serializable {

    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name = "version")
    private String version;

    @XmlElement(name = "infoTributaria")
    private InfoTributaria infoTributaria;

    @XmlElement(name = "infoCompRetencion")
    private InfoCompRetencion infoCompRetencion;

    @XmlElementWrapper(name="impuestos")
    @XmlElement(name="impuesto")
    private List<ImpuestosRetencion> impuestos;

    @XmlElementWrapper(name="infoAdicional")
    @XmlElement(name="campoAdicional")
    private List<CampoAdicional> campoAdicional;

}
