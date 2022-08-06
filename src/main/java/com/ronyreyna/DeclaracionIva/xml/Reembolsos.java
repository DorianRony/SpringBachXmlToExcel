package com.ronyreyna.DeclaracionIva.xml;

import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "reembolsoDetalle")
public class Reembolsos implements Serializable {

    private String tipoIdentificacionProveedorReembolso;
    private String identificacionProveedorReembolso;
    private String codPaisPagoProveedorReembolso;
    private String tipoProveedorReembolso;
    private String codDocReembolso;
    private String estabDocReembolso;
    private String ptoEmiDocReembolso;
    private String secuencialDocReembolso;
    private Date fechaEmisionDocReembolso;
    private String numeroautorizacionDocReembolso;

    @XmlElementWrapper(name="detalleImpuestos")
    @XmlElement(name = "detalleImpuesto")
    private List<DetalleImpuesto> detalleImpuesto;

}
