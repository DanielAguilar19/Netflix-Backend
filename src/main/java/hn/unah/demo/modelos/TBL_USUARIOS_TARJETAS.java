package hn.unah.demo.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_USUARIOS_TARJETAS")
@Data
public class TBL_USUARIOS_TARJETAS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO_TARJETA")
    private Long codigoRegistroTarjeta;

    @Column(name = "NUMERO_TARJETA")
    private String numeroTarjeta;

    @Column(name = "ANNIO_VENCIMIENTO")
    private Integer annioVencimiento;

    @Column(name = "MES_VENCIMIENTO")
    private Integer mesVencimiento;

    @Column(name = "CVV")
    private Integer cvv;

    @Column(name = "NOMBRE_TARJETA") // esto lo pide netflix real para pagos, creo que se refiere a el nombre del
                                     // titular de la tarjeta
    private String nombreTarjeta;

    ////////////////////////////////////////////////////
    // relacion de muchos a uno con la tabla de usuarios
    @ManyToOne
    @JoinColumn(name = "CODIGO_USUARIO", referencedColumnName = "CODIGO_USUARIO")
    private TBL_USUARIOS usuario;

    /*************************************************/
    // relcaion de uno a muchos con la tabla de historial_pagos
    @OneToMany(mappedBy = "codigoRegistroTarjeta", cascade = CascadeType.ALL)
    private List<TBL_HISTORIAL_PAGOS> listaHistorialPagos;

}
