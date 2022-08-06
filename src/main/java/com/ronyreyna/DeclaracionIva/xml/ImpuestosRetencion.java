package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "impuesto")
public class ImpuestosRetencion implements Serializable {

    private String codigo;
    private String codigoRetencion;
    private BigDecimal baseImponible;
    private BigDecimal porcentajeRetener;
    private BigDecimal valorRetenido;
    private String codDocSustento;
    private String numDocSustento;
    private String fechaEmisionDocSustento;

}
