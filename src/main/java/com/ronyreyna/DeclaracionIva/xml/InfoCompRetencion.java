package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "infoCompRetencion")
public class InfoCompRetencion implements Serializable {

    private String fechaEmision;
    private String dirEstablecimiento;
    private String contribuyenteEspecial;
    private String obligadoContabilidad;
    private String tipoIdentificacionSujetoRetenido;
    private String razonSocialSujetoRetenido;
    private String identificacionSujetoRetenido;
    private String periodoFiscal;

}
