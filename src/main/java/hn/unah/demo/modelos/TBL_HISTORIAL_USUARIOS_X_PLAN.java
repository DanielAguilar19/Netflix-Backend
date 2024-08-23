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
@Table(name = "TBL_HISTORIAL_USUARIOS_X_PLAN")
@Data
public class TBL_HISTORIAL_USUARIOS_X_PLAN {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private long codigoRegistro;

    @CreationTimestamp
    @Column(name = "FECHA_ADQUISICION")
    @JsonProperty("fechaAdquisicion")
    private LocalDateTime fechaAdquisicion;

    @CreationTimestamp
    @Column(name = "FECHA_VENCIMIENTO")
    @JsonProperty("fechaVencimiento")
    private LocalDateTime fechaVencimiento;

    /***********************************************/
    // relacion de uno a uno con historil_pagos
    @OneToOne(mappedBy = "usuarioPlanesNumRegistro")
    private TBL_HISTORIAL_PAGOS historialPagos;

    ////////////////////////////////////////////////////
    // relaicion de muchos a uno con ta tabla tipo_pago
    @ManyToOne
    @JoinColumn(name = "CODIGO_TIPO_PAGO")
    private TBL_TIPO_PAGO codigoTipoPago;

    @Column(name = "CODIGO_USUARIO") // FK
    private long codigoUsuario;

    @Column(name = "CODIGO_PLAN") // FK
    private long codigoPlan;

    /////////////////////////////////////////////////
    // relacion de muchos a uno con la tbl tipo_estado
    @ManyToOne
    @JoinColumn(name = "CODIGO_ESTADO", referencedColumnName = "CODIGO_ESTADO")
    private TBL_TIPO_ESTADO estado;

}
