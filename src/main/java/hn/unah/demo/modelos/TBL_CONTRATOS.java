package hn.unah.demo.modelos;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTRATOS")
@Data

public class TBL_CONTRATOS {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CONTRATOS")
    private Long idContratos;

    @Column(name = "TIPO_CONTRATO")
    private String tipoContrato;

    @CreationTimestamp
    @Column(name = "FECHA_INICIO")
    @JsonProperty("fechaInicio")
    private LocalDateTime fechaInicio;

    @CreationTimestamp
    @Column(name = "FECHA_FIN")
    @JsonProperty("fechaFin")
    private LocalDateTime fechaFin;

    //no tienn


    
}
