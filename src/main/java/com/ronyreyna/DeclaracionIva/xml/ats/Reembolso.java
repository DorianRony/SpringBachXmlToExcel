package com.ronyreyna.DeclaracionIva.xml.ats;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "reembolso")
@NoArgsConstructor
public class Reembolso implements Serializable {
    private String tipoComprobanteReemb;
    private String tpIdProvReemb;
    private String idProvReemb;
    private String establecimientoReemb;
    private String puntoEmisionReemb;
    private String secuencialReemb;
    private String fechaEmisionReemb;
    private String autorizacionReemb;
    private BigDecimal baseImponibleReemb;
    private BigDecimal baseImpGravReemb;
    private BigDecimal baseNoGraIvaReemb;
    private BigDecimal baseImpExeReemb;
    private BigDecimal totbasesImpReemb;
    private BigDecimal montoIceRemb;
    private BigDecimal montoIvaRemb;

    public Reembolso(String tipoComprobanteReemb, String tpIdProvReemb, String idProvReemb, String establecimientoReemb, String puntoEmisionReemb, String secuencialReemb, String fechaEmisionReemb, String autorizacionReemb, BigDecimal baseImponibleReemb, BigDecimal baseImpGravReemb, BigDecimal baseNoGraIvaReemb, BigDecimal baseImpExeReemb, BigDecimal montoIceRemb, BigDecimal montoIvaRemb) {
        this.tipoComprobanteReemb = tipoComprobanteReemb;
        this.tpIdProvReemb = tpIdProvReemb;
        this.idProvReemb = idProvReemb;
        this.establecimientoReemb = establecimientoReemb;
        this.puntoEmisionReemb = puntoEmisionReemb;
        this.secuencialReemb = secuencialReemb;
        this.fechaEmisionReemb = fechaEmisionReemb;
        this.autorizacionReemb = autorizacionReemb;
        this.baseImponibleReemb = baseImponibleReemb;
        this.baseImpGravReemb = baseImpGravReemb;
        this.baseNoGraIvaReemb = baseNoGraIvaReemb;
        this.baseImpExeReemb = baseImpExeReemb;
        this.montoIceRemb = montoIceRemb;
        this.montoIvaRemb = montoIvaRemb;
    }
}
