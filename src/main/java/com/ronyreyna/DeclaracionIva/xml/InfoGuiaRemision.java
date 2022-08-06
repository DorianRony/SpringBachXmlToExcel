package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "infoGuiaRemision")
public class InfoGuiaRemision implements Serializable {

    private String dirEstablecimiento;
    private String dirPartida;
    private String razonSocialTransportista;
    private String tipoIdentificacionTransportista;
    private String rucTransportista;
    private String rise;
    private String obligadoContabilidad;
    private String contribuyenteEspecial;
    private String fechaIniTransporte;
    private String fechaFinTransporte;
    private String placa;

}
