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
@XmlRootElement(name = "detalleCompras")
@NoArgsConstructor
public class DetalleVentas implements Serializable {

    @XmlElement(name = "tpIdCliente")
    private String tpIdCliente;

    @XmlElement(name = "idCliente")
    private String idCliente;

    @XmlElement(name = "parteRelVtas")
    private String parteRelVtas;

    @XmlElement(name = "tipoCliente")
    private String tipoCliente;

    @XmlElement(name = "denoCli")
    private String denoCli;

    @XmlElement(name = "tipoComprobante")
    private String tipoComprobante;

    @XmlElement(name = "tipoEmision")
    private String tipoEmision;

    @XmlElement(name = "numeroComprobantes")
    private String numeroComprobantes;

    @XmlElement(name = "baseNoGraIva")
    private BigDecimal baseNoGraIva;

    @XmlElement(name = "baseImponible")
    private BigDecimal baseImponible;

    @XmlElement(name = "baseImpGrav")
    private BigDecimal baseImpGrav;

    @XmlElement(name = "montoIva")
    private BigDecimal montoIva;

    @XmlElementWrapper(name = "compensaciones")
    @XmlElement(name = "compensacion")
    private List<Compensacion> compensacion;

    @XmlElement(name = "montoIce")
    private BigDecimal montoIce;

    @XmlElement(name = "valorRetIva")
    private BigDecimal valorRetIva;

    @XmlElement(name = "valorRetRenta")
    private BigDecimal valorRetRenta;

    @XmlElement(name="formasDePago")
    private FormaPagoVentas formaDePago;

}
