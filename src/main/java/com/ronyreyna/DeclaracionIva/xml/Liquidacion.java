package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "liquidacionCompra")
public class Liquidacion implements Serializable {

    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name = "version")
    private String version;

    @XmlElement(name = "infoTributaria")
    private InfoTributaria infoTributaria;

    @XmlElement(name = "infoLiquidacionCompra")
    private InfoLiquidacionCompra infoLiquidacionCompra;

    @XmlElementWrapper(name="detalles")
    @XmlElement(name = "detalle")
    private List<DetalleLiquidacion> detalle;

    @XmlElementWrapper(name="reembolsos")
    @XmlElement(name = "reembolsoDetalle")
    private List<Reembolsos> reembolsoDetalle;

    @XmlElement(name = "maquinaFiscal")
    private MaquinaFiscal maquinaFiscal;

    @XmlElementWrapper(name="infoAdicional")
    @XmlElement(name = "campoAdicional")
    private List<CampoAdicional> campoAdicionals;
}