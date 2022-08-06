package com.ronyreyna.DeclaracionIva.xml.ats;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "detalleVentas")
@NoArgsConstructor
public class DetalleCompras implements Serializable {

    @XmlElement(name = "codSustento")
    private String codSustento;

    @XmlElement(name = "tpIdProv")
    private String tpIdProv;

    @XmlElement(name = "idProv")
    private String idProv;

    @XmlElement(name = "tipoComprobante")
    private String tipoComprobante;

    @XmlElement(name = "tipoProv")
    private String tipoProv;

    @XmlElement(name = "denoProv")
    private String denoProv;

    @XmlElement(name = "parteRel")
    private String parteRel;

    @XmlElement(name = "fechaRegistro")
    private String fechaRegistro;

    @XmlElement(name = "establecimiento")
    private String establecimiento;

    @XmlElement(name = "puntoEmision")
    private String puntoEmision;

    @XmlElement(name = "secuencial")
    private String secuencial;

    @XmlElement(name = "fechaEmision")
    private String fechaEmision;

    @XmlElement(name = "autorizacion")
    private String autorizacion;

    @XmlElement(name = "baseNoGraIva")
    private BigDecimal baseNoGraIva;

    @XmlElement(name = "baseImponible")
    private BigDecimal baseImponible;

    @XmlElement(name = "baseImpGrav")
    private BigDecimal baseImpGrav;

    @XmlElement(name = "baseImpExe")
    private BigDecimal baseImpExe;

    @XmlElement(name = "montoIce")
    private BigDecimal montoIce;

    @XmlElement(name = "montoIva")
    private BigDecimal montoIva;

    @XmlElement(name = "valRetBien10")
    private BigDecimal valRetBien10;

    @XmlElement(name = "valRetServ20")
    private BigDecimal valRetServ20;

    @XmlElement(name = "valorRetBienes")
    private BigDecimal valorRetBienes;

    @XmlElement(name = "valRetServ50")
    private BigDecimal valRetServ50;

    @XmlElement(name = "valorRetServicios")
    private BigDecimal valorRetServicios;

    @XmlElement(name = "valRetServ100")
    private BigDecimal valRetServ100;

    @XmlElement(name = "totbasesImpReemb")
    private BigDecimal totbasesImpReemb;

    @XmlElement(name = "pagoExterior")
    private PagoExterior pagoExterior;

    @XmlElement(name = "formasDePago")
    private List<FormaPago> formasDePago;

    @XmlElementWrapper(name = "air")
    @XmlElement(name = "detalleAir")
    private List<DetalleAir> detalleAir;

    @XmlElement(name = "docModificado")
    private String docModificado;

    @XmlElement(name = "estabModificado")
    private String estabModificado;

    @XmlElement(name = "ptoEmiModificado")
    private String ptoEmiModificado;

    @XmlElement(name = "secModificado")
    private String secModificado;

    @XmlElement(name = "autModificado")
    private String autModificado;

    @XmlElementWrapper(name = "reembolsos")
    @XmlElement(name = "reembolso")
    private List<Reembolso> rembolso;

    @XmlElement(name = "estabRetencion1")
    private Integer estabRetencion1;

    @XmlElement(name = "ptoEmiRetencion1")
    private Integer ptoEmiRetencion1;

    @XmlElement(name = "secRetencion1")
    private Integer secRetencion1;

    @XmlElement(name = "autRetencion1")
    private String autRetencion1;

    @XmlElement(name = "fechaEmiRet1")
    private String fechaEmiRet1;

}
