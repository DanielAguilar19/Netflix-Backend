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
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_HISTRIAL_PAGOS") // cambiar en la base de datos
@Data

public class TBL_HISTORIAL_PAGOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_HISTORIAL_PAGO")
    private long codigoHistorial;

    @CreationTimestamp
    @Column(name = "FECHA_PAGO")
    @JsonProperty("fechaPago")
    private LocalDateTime fechaPago;

    ///////////////////////////////////////
    // relacion de muchos a uno con la tbl usuarios_tarjetas
    @ManyToOne
    @JoinColumn(name = "CODIGO_REGISTRO_TARJETA", referencedColumnName = "CODIGO_REGISTRO_TARJETA")
    private TBL_USUARIOS_TARJETAS codigoRegistroTarjeta;

    //////////////////////////////////////
    // relaicon de muchos a uno con tbl tipo_pagos
    @ManyToOne
    @JoinColumn(name = "CODIGO_TIPO_PAGO", referencedColumnName = "CODIGO_TIPO_PAGO")
    private TBL_TIPO_PAGO codigoTipoPago;
}
