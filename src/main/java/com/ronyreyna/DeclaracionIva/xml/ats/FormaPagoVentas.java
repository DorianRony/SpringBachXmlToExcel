package com.ronyreyna.DeclaracionIva.xml.ats;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "formaPago")
public class FormaPagoVentas implements Serializable {
    private List<String> formaPago;

    public FormaPagoVentas(){
        //
    }

    public FormaPagoVentas(List<String> formaPago) {
        this.formaPago = formaPago;
    }

}
