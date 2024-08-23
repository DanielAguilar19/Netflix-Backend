package hn.unah.demo.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_TIPO_PAGO")
@Data
public class TBL_TIPO_PAGO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_TIPO_PAGO")
    private Long codigoTipoPago;

    @Column(name = "NOMBRE_TIPO")
    private String nombreTipo;

    /************************************/
    // relacion de uno a muchos con la tabla de historial_pagos
    @OneToMany(mappedBy = "codigoTipoPago", cascade = CascadeType.ALL)
    private List<TBL_HISTORIAL_PAGOS> listaHistorialPagos;

}
