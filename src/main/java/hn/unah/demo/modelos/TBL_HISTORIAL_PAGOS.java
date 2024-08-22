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
@Table (name = "TBL_HISTORIALES_PAGOS")
@Data

public class TBL_HISTORIAL_PAGOS {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private Long codigoRegistro;

    
    @CreationTimestamp
    @Column(name = "FECHA_PAGO")
    @JsonProperty("fechaPago")
    private LocalDateTime fechaPago;

    //usuario planes 

    //pagos
    
}
