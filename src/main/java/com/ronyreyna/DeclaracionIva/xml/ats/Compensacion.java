package com.ronyreyna.DeclaracionIva.xml.ats;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "compensacion")
@NoArgsConstructor
public class Compensacion implements Serializable {

    private String tipoCompe;
    private BigDecimal monto;

    public Compensacion(String tipoCompe, BigDecimal monto) {
        this.tipoCompe = tipoCompe;
        this.monto = monto;
    }
}
