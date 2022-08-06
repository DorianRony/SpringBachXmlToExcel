package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "guiaRemision")
public class GuiaRemision implements Serializable {

    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name = "version")
    private String version;

    @XmlElement(name = "infoTributaria")
    private InfoTributaria infoTributaria;

    @XmlElement(name = "infoGuiaRemision")
    private InfoGuiaRemision infoGuiaRemision;

    @XmlElementWrapper(name="destinatarios")
    @XmlElement(name="destinatario")
    private List<Destinatario> destinatarios;

    @XmlElementWrapper(name="infoAdicional")
    @XmlElement(name="campoAdicional")
    private List<CampoAdicional> campoAdicional;

}
