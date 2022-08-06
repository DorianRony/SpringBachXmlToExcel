package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "infoLiquidacionCompra")
public class InfoLiquidacionCompra implements Serializable {

    private String fechaEmision;
    private String dirEstablecimiento;
    private String contribuyenteEspecial;
    private String obligadoContabilidad;
    private String tipoIdentificacionProveedor;
    private String razonSocialProveedor;
    private String identificacionProveedor;
    private String direccionProveedor;
    private BigDecimal totalSinImpuestos;
    private BigDecimal totalDescuento;
    private String codDocReembolso;
    private BigDecimal totalComprobantesReembolso;
    private BigDecimal totalBaseImponibleReembolso;
    private BigDecimal totalImpuestoReembolso;

    @XmlElementWrapper(name="totalConImpuestos")
    @XmlElement(name = "totalImpuesto")
    private List<TotalImp> totalImpuesto;

    private BigDecimal importeTotal;
    private String moneda;

    @XmlElementWrapper(name="pagos")
    @XmlElement(name = "pago")
    private List<Pagos> pago;
}
