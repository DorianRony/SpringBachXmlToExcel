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
@XmlRootElement(name = "detalle")
public class DetalleFactura implements Serializable {

    private String codigoPrincipal;
    private String codigoAuxiliar;
    private String descripcion;
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

}
