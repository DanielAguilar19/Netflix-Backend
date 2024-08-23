package hn.unah.demo.modelos;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_HISTORIAL_PAGOS")
@Data
public class TBL_HISTORIAL_PAGOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private long codigoRegistro;

    @CreationTimestamp
    @Column(name = "FECHA_PAGO")
    @JsonProperty("fechaPago")
    private LocalDateTime fechaPago;

    /////////////////////////////////////////////////////
    // relaicon de uno a uno con la tabla de planes_usuarios
    @OneToOne
    @JoinColumn(name = "CODIGO_REGISTRO")
    private TBL_USUARIOS_PLANES usuarioPlanesNumRegistro;

    ////////////////////////////////////////////////////
    // relaicion de muchos a uno con ta tabla tipo_pago
    @ManyToOne
    @JoinColumn(name = "CODIGO_TIPO_PAGO")
    private TBL_TIPO_PAGO codigoTipoPago;

    ////////////////////////////////////////////////////
    // relacion de muchos a uno con la tabla de usuarios_tarjetas
    @ManyToOne
    @JoinColumn(name = "CODIGO_REGISTRO_TARJETA", referencedColumnName = "CODIGO_REGISTRO_TARJETA")
    private TBL_USUARIOS_TARJETAS codigoRegistroTarjeta;

}
