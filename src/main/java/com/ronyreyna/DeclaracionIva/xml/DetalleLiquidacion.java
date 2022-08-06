package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "detalles")
public class DetalleLiquidacion implements Serializable {

    private String codigoPrincipal;
    private String codigoAuxiliar;
    private String descripcion;
    private String unidadMedida;
    private BigDecimal cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal descuento;
    private BigDecimal precioTotalSinImpuesto;

    @XmlElementWrapper(name="detallesAdicionales")
    @XmlElement(name="detAdicional")
    private List<DetalleAdicional> detAdicional;

    @XmlElementWrapper(name="impuestos")
    @XmlElement(name="impuesto")
    private List<Impuestos> impuestos;

    public DetalleLiquidacion() {
    }

    public DetalleLiquidacion(String codigoPrincipal, String codigoAuxiliar, String descripcion, String unidadMedida, BigDecimal cantidad, BigDecimal precioUnitario, BigDecimal descuento, BigDecimal precioTotalSinImpuesto, List<Impuestos> impuestos) {
        this.codigoPrincipal = codigoPrincipal;
        this.codigoAuxiliar = codigoAuxiliar;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.descuento = descuento;
        this.precioTotalSinImpuesto = precioTotalSinImpuesto;
        this.impuestos = impuestos;
    }
}
