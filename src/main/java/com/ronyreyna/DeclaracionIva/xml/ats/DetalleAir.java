package com.ronyreyna.DeclaracionIva.xml.ats;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "detalleAir")
public class DetalleAir implements Serializable {
    private String codRetAir;
    private BigDecimal baseImpAir;
    private BigDecimal porcentajeAir;
    private BigDecimal valRetAir;
}
