package com.ronyreyna.DeclaracionIva.DTO;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReporteDTO implements Serializable {

    private static final long serialVersionUID = 591433208580122206L;
    private String razonSocial;
    private String ruc;
    private String numeroFactura;
    private String fechaEmision;
    private BigDecimal iva;

    @Override
    public String toString() {
        return "ReporteDTO{" +
            "razonSocial='" + razonSocial + '\'' +
            ", ruc='" + ruc + '\'' +
            ", numeroFactura='" + numeroFactura + '\'' +
            ", fechaEmision='" + fechaEmision + '\'' +
            ", iva=" + iva +
            '}';
    }
}
