package hn.unah.demo.modelos;

<<<<<<< HEAD
import java.sql.Date;
=======
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
=======
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTRATOS")
@Data
<<<<<<< HEAD
public class TBL_CONTRATOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CONTRATO")
    private Long codigoContrato;
=======

public class TBL_CONTRATOS {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CONTRATOS")
    private Long idContratos;
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce

    @Column(name = "TIPO_CONTRATO")
    private String tipoContrato;

<<<<<<< HEAD
    @Column(name = "FECHA_INICIO")
    private Date fechaInicio;

    @Column(name = "FECHA_FIN")
    private Date fechaFin;

    //////////////////////////////////////////////////////
    // relacion de muchos a uno con la tabla de cargos
    @ManyToOne
    @JoinColumn(name = "CODIGO_CARGO", referencedColumnName = "CODIGO_CARGO")
    private TBL_CARGOS cargo;

    /////////////////////////////////////////////////////
    // relacion de muchos a uno con la tabla sueldos
    @ManyToOne
    @JoinColumn(name = "CODIGO_SUELDO", referencedColumnName = "CODIGO_SUELDO")
    private TBL_SUELDOS sueldo;

=======
    @CreationTimestamp
    @Column(name = "FECHA_INICIO")
    @JsonProperty("fechaInicio")
    private LocalDateTime fechaInicio;

    @CreationTimestamp
    @Column(name = "FECHA_FIN")
    @JsonProperty("fechaFin")
    private LocalDateTime fechaFin;

    //no tienn


    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
