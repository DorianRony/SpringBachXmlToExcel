package com.ronyreyna.DeclaracionIva.xml;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "maquinaFiscal")
public class MaquinaFiscal implements Serializable {

    private String marca;
    private String modelo;
    private String serie;

}
