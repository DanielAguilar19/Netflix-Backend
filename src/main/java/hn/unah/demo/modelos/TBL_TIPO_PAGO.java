package hn.unah.demo.modelos;

<<<<<<< HEAD
import java.util.List;

import jakarta.persistence.CascadeType;
=======
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.OneToMany;
=======
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Table;
import lombok.Data;

@Entity
<<<<<<< HEAD
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

=======
@Table(name = "")
@Data

public class TBL_TIPO_PAGO {

      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_TIPO_PAGO")
    private Long codigoTipoPago ;

    @Column(name = "NOMBRE_TIPO")
    private String nombreTipo;
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
