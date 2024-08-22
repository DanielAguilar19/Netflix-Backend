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
@Table(name = "TBL_USUARIO_TARJETAS")
@Data

public class TBL_USUARIO_TARJETAS {

      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGRISTRO_TARJETA")
    private Long registroTarjeta;

    @Column(name = "NOMBRE_TARJETA")
    private String nombreTarjeta;

    @Column(name = "NUMERO_TARJETA")
    private Integer numeroTarjeta;

    @Column(name = "MES_VENCIMIENTO")
    private String mesVencimiento;

    @Column(name = "CVV")
    private Integer cvv;

    @CreationTimestamp
    @Column(name = "ANNIO_VENCIMIENTO")
    @JsonProperty("annioVencimiento")
    private LocalDateTime annioVencimiento;
    
}
