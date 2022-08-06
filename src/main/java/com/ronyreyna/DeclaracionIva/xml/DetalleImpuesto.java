package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "infoTributaria")
public class DetalleImpuesto implements Serializable {

    private String codigo;
    private String codigoPorcentaje;
    private String tarifa;
    private BigDecimal baseImponibleReembolso;
    private BigDecimal impuestoReembolso;

    public DetalleImpuesto() {
    }

    public DetalleImpuesto(String codigo, String codigoPorcentaje, String tarifa, BigDecimal baseImponibleReembolso, BigDecimal impuestoReembolso) {
        this.codigo = codigo;
        this.codigoPorcentaje = codigoPorcentaje;
        this.tarifa = tarifa;
        this.baseImponibleReembolso = baseImponibleReembolso;
        this.impuestoReembolso = impuestoReembolso;
    }

}
