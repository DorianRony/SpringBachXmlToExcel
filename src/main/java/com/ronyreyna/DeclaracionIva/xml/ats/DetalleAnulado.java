package com.ronyreyna.DeclaracionIva.xml.ats;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "detalleAnulados")
@NoArgsConstructor
public class DetalleAnulado implements Serializable {
    private String tipoComprobante;
    private String establecimiento;
    private String puntoEmision;
    private String secuencialInicio;
    private String secuencialFin;
    private String autorizacion;

    public DetalleAnulado(String tipoComprobante, String establecimiento, String puntoEmision, String secuencialInicio, String secuencialFin, String autorizacion) {
        this.tipoComprobante = tipoComprobante;
        this.establecimiento = establecimiento;
        this.puntoEmision = puntoEmision;
        this.secuencialInicio = secuencialInicio;
        this.secuencialFin = secuencialFin;
        this.autorizacion = autorizacion;
    }
}
