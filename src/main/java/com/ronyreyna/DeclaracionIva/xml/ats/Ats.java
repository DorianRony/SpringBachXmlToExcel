package com.ronyreyna.DeclaracionIva.xml.ats;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "iva")
@NoArgsConstructor
public class Ats implements Serializable {

    @XmlElement(name = "TipoIDInformante")
    private String tipoIdInformante;

    @XmlElement(name = "IdInformante")
    private String idInformante;

    @XmlElement(name = "razonSocial")
    private String razonSocial;

    @XmlElement(name = "Anio")
    private String anio;

    @XmlElement(name = "Mes")
    private String mes;

    @XmlElement(name = "numEstabRuc")
    private String numEstabRuc;

    @XmlElement(name = "totalVentas")
    private BigDecimal totalVentas;

    @XmlElement(name = "codigoOperativo")
    private String codigoOperativo;

    @XmlElementWrapper(name = "compras")
    @XmlElement(name = "detalleCompras")
    private List<DetalleCompras> detalleCompras;

    @XmlElementWrapper(name = "ventas")
    @XmlElement(name = "detalleVentas")
    private List<DetalleVentas> detalleVentas;

    @XmlElementWrapper(name = "ventasEstablecimiento")
    @XmlElement(name = "ventaEst")
    private List<VentaEstablecimiento> ventaEst;

    @XmlElementWrapper(name = "exportaciones")
    @XmlElement(name = "detalleExportaciones")
    private List<Exportaciones> detalleExportaciones;

    @XmlElementWrapper(name = "anulados")
    @XmlElement(name = "detalleAnulados")
    private List<DetalleAnulado> detalleAnulados;
}
