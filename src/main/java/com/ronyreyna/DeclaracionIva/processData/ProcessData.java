package com.ronyreyna.DeclaracionIva.processData;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import com.ronyreyna.DeclaracionIva.DTO.ReporteDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessData implements Serializable {
    private static final long serialVersionUID = 591433208580122207L;
    private List<ReporteDTO> reporteDTOS;
}
