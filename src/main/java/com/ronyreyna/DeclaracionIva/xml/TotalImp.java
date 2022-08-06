package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "detalleImpuesto")
public class TotalImp implements Serializable {

    private String codigo;
    private String codigoPorcentaje;
    private BigDecimal descuentoAdicional;
    private BigDecimal baseImponible;
    private BigDecimal tarifa;
    private BigDecimal valor;

    public TotalImp() {
    }

    public TotalImp(String codigo, String codigoPorcentaje, BigDecimal descuentoAdicional, BigDecimal baseImponible, BigDecimal tarifa, BigDecimal valor) {
        this.codigo = codigo;
        this.codigoPorcentaje = codigoPorcentaje;
        this.descuentoAdicional = descuentoAdicional;
        this.baseImponible = baseImponible;
        this.tarifa = tarifa;
        this.valor = valor;
    }
}
