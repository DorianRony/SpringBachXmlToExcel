package com.ronyreyna.DeclaracionIva.xml.ats;

import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "pagoExterior")
public class PagoExterior implements Serializable {

    private String pagoLocExt;
    private String paisEfecPago;
    private String aplicConvDobTrib;
    private String pagExtSujRetNorLeg;

}
