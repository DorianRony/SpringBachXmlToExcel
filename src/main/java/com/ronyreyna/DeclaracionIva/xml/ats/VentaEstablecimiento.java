package com.ronyreyna.DeclaracionIva.xml.ats;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ventaEst")
@NoArgsConstructor
public class VentaEstablecimiento implements Serializable {
    private String codEstab;
    private BigDecimal ventasEstab;
    private BigDecimal ivaComp;

    public VentaEstablecimiento(String codEstab, BigDecimal ventasEstab, BigDecimal ivaComp) {
        this.codEstab = codEstab;
        this.ventasEstab = ventasEstab;
        this.ivaComp = ivaComp;
    }
}
