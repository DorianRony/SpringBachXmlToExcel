package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "destinatario")
public class Destinatario implements Serializable {

    private String identificacionDestinatario;
    private String razonSocialDestinatario;
    private String dirDestinatario;
    private String motivoTraslado;
    private String docAduaneroUnico;
    private String codEstabDestino;
    private String ruta;
    private String codDocSustento;
    private String numDocSustento;
    private String numAutDocSustento;
    private String fechaEmisionDocSustento;

    @XmlElementWrapper(name = "detalles")
    @XmlElement(name = "detalle")
    List<DetalleRetencion> detalles;

}
