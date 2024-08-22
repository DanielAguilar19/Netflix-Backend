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
@Table(name = "TBL_USUARIOS_PLANES")
@Data

public class TBL_USUARIOS_PLANES {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGRISTRO")
    private Long codigoRegistro;

    @CreationTimestamp
    @Column(name = "FECHA_ADQUISICION")
    @JsonProperty("fechaAdquisicion")
    private LocalDateTime fechaAdquisicion;

    @CreationTimestamp
    @Column(name = "FECHA_VENCIMIENTO")
    @JsonProperty("fechaVencimiento")
    private LocalDateTime fechaVencimiento;
    
}
