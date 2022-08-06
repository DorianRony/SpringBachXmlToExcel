package com.ronyreyna.DeclaracionIva.xml;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "infoFactura")
public class InfoFactura implements Serializable {

    private String fechaEmision;
    private String dirEstablecimiento;
    private String contribuyenteEspecial;
    private String obligadoContabilidad;
    private String tipoIdentificacionComprador;
    private String guiaRemision;
    private String razonSocialComprador;
    private String identificacionComprador;
    private String direccionComprador;

    private BigDecimal totalSinImpuestos;
    private BigDecimal totalDescuento;

    @XmlElementWrapper(name="totalConImpuestos")
    @XmlElement(name="totalImpuesto")
    private List<TotalImpuesto> totalConImpuesto;

    private String propina;
    private BigDecimal importeTotal;
    private String moneda;

    @XmlElementWrapper(name="pagos")
    @XmlElement(name="pago")
    private List<Pagos> pagos;

    private BigDecimal valorRetIva;
    private BigDecimal valorRetRenta;

}
