package com.ronyreyna.DeclaracionIva.xml.ats;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "formaPago")
public class FormaPago implements Serializable {
    private String formaPago;

    public FormaPago(){
        //
    }

    public FormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

}
