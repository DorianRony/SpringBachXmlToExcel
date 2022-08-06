package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "infoNotaCredito")
public class InfoNotaCredito implements Serializable {

    private String fechaEmision;
    private String dirEstablecimiento;
    private String tipoIdentificacionComprador;
    private String razonSocialComprador;
    private String identificacionComprador;
    private String contribuyenteEspecial;
    private String obligadoContabilidad;
    private String rise;
    private String codDocModificado;
    private String numDocModificado;
    private String fechaEmisionDocSustento;
    private BigDecimal totalSinImpuestos;
    private BigDecimal valorModificacion;
    private String moneda;

    @XmlElementWrapper(name="totalConImpuestos")
    @XmlElement(name="totalImpuesto")
    private List<TotalImpuesto> totalConImpuesto;

    private String motivo;

}
