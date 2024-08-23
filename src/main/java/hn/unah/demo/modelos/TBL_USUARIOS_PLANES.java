package hn.unah.demo.modelos;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

<<<<<<< HEAD
import jakarta.persistence.CascadeType;
=======
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
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
@Table(name = "TBL_USUARIOS_PLANES")
@Data
<<<<<<< HEAD
public class TBL_USUARIOS_PLANES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private long codigoRegistro;

    @CreationTimestamp
    @Column(name = "FECHA_ADQUISICION")
    @JsonProperty("fechaadquisicion")
=======

public class TBL_USUARIOS_PLANES {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGRISTRO")
    private Long codigoRegistro;

    @CreationTimestamp
    @Column(name = "FECHA_ADQUISICION")
    @JsonProperty("fechaAdquisicion")
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
    private LocalDateTime fechaAdquisicion;

    @CreationTimestamp
    @Column(name = "FECHA_VENCIMIENTO")
<<<<<<< HEAD
    @JsonProperty("fechavencimiento")
    private LocalDateTime fechaVencimiento;

    ////////////////////////////////////////////////
    // esta es la tabla intermedis entre usuaios y planes subscripcion
    /***************************************************/
    // relaicon con las tablas de usuarios y planes_subscriptores this is the table
    // intermedia
    @Column(name = "ID_USUARIO")
    private long idUsuarios;

    @Column(name = "ID_PLAN")
    private long idPlan;

    ////////////////////////////////////////////////
    // relacion de muchos a uno con la tabla estados (si esta activo o desactivo
    //////////////////////////////////////////////// igual solo seria que cuando ya
    //////////////////////////////////////////////// se consume pasaria de activo a
    //////////////////////////////////////////////// desctivo)
    @ManyToOne
    @JoinColumn(name = "CODIGO_ESTADO", referencedColumnName = "CODIGO_ESTADO")
    private TBL_ESTADO estado;

    /********************************************/
    // relaicion uno a uno con la tabla de historiales
    @OneToOne(mappedBy = "usuarioPlanesNumRegistro", cascade = CascadeType.ALL)
    private TBL_HISTORIAL_PAGOS historialpagos;

=======
    @JsonProperty("fechaVencimiento")
    private LocalDateTime fechaVencimiento;
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
