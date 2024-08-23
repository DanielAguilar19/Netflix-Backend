package hn.unah.demo.modelos;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
=======
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Table;
import lombok.Data;

@Entity
<<<<<<< HEAD
@Table(name = "TBL_HISTORIAL_PAGOS")
@Data
public class TBL_HISTORIAL_PAGOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private long codigoRegistro;

=======
@Table (name = "TBL_HISTORIALES_PAGOS")
@Data

public class TBL_HISTORIAL_PAGOS {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private Long codigoRegistro;

    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
    @CreationTimestamp
    @Column(name = "FECHA_PAGO")
    @JsonProperty("fechaPago")
    private LocalDateTime fechaPago;

<<<<<<< HEAD
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

=======
    //usuario planes 

    //pagos
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
