package com.ronyreyna.DeclaracionIva.xml.ats;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "detalleExportaciones")
@NoArgsConstructor
public class Exportaciones implements Serializable {

    private String tpIdClienteEx;
    private String idClienteEx;
    private String parteRelExp;
    private String tipoRegi;
    private String paisEfecPagoParFis;
    private String paisEfecExp;
    private String exportacionDe;
    private String tipIngExt;
    private String ingExtGravOtroPais;
    private String tipoComprobante;
    private Date fechaEmbarque;
    private BigDecimal valorFOB;
    private BigDecimal valorFOBComprobante;
    private String establecimiento;
    private String puntoEmision;
    private String secuencial;
    private String autorizacion;
    private Date fechaEmision;

    public Exportaciones(String tpIdClienteEx, String idClienteEx, String parteRelExp, String tipoRegi,
                         String paisEfecPagoParFis, String paisEfecExp, String exportacionDe, String tipIngExt,
                         String ingExtGravOtroPais, String tipoComprobante, Date fechaEmbarque, BigDecimal valorFOB,
                         BigDecimal valorFOBComprobante, String establecimiento, String puntoEmision, String secuencial,
                         String autorizacion, Date fechaEmision) {
        this.tpIdClienteEx = tpIdClienteEx;
        this.idClienteEx = idClienteEx;
        this.parteRelExp = parteRelExp;
        this.tipoRegi = tipoRegi;
        this.paisEfecPagoParFis = paisEfecPagoParFis;
        this.paisEfecExp = paisEfecExp;
        this.exportacionDe = exportacionDe;
        this.tipIngExt = tipIngExt;
        this.ingExtGravOtroPais = ingExtGravOtroPais;
        this.tipoComprobante = tipoComprobante;
        this.fechaEmbarque = fechaEmbarque;
        this.valorFOB = valorFOB;
        this.valorFOBComprobante = valorFOBComprobante;
        this.establecimiento = establecimiento;
        this.puntoEmision = puntoEmision;
        this.secuencial = secuencial;
        this.autorizacion = autorizacion;
        this.fechaEmision = fechaEmision;
    }
}
