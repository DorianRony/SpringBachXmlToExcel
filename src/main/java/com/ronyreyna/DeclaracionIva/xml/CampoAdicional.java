package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "campoAdicional")
public class CampoAdicional implements Serializable {

    @XmlAttribute
    private String nombre;
    @XmlValue
    private String valor;
}