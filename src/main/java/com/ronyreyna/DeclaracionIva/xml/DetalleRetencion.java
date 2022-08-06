package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "detalle")
public class DetalleRetencion implements Serializable {

    private String codigoInterno;
    private String codigoAdicional;
    private String descripcion;
    private Integer cantidad;

    @XmlElementWrapper(name="detallesAdicionales")
    @XmlElement(name="detAdicional")
    private List<DetalleAdicional> detAdicional;
    
}
