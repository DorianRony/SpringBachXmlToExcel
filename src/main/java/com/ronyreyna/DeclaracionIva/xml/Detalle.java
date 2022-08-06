package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "detalle")
public class Detalle implements Serializable {

    private String codigoInterno;
    private String codigoAdicional;
    private String descripcion;
    private Double cantidad;
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
