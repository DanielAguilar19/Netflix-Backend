package hn.unah.demo.modelos;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
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
@Table(name = "TBL_PERSONAS")
@Data

public class TBL_PERSONAS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_PERSONA")
    private Long idDirector;

    @Column(name = "P_NOMBRE")
    private String primerNombre;

    @Column(name = "S_NOMBRE")
    private String segundoNombre;

    @Column(name = "P_APELLIDO")
    private String primerApellido;

    @Column(name = "S_APELLIDO")
    private String segundoApellido;

    @Column(name = "CORREO_ELECTRONICO")
    private String email;

    @Column(name = "TELEFONO")
    private String telefono;

    @CreationTimestamp
    @Column(name = "FECHA_REGISTRO")
    @JsonProperty("fecharegistro")
    private LocalDateTime fechaRegistro;

    /***************************************************/
    // relacino de uno a uno con la tabla de USUARIOS
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
    private TBL_USUARIOS usuario;

    /****************************************************/
    // relacion de muchos a uno con la tabla ubicaciones
    @ManyToOne
    @JoinColumn(name = "CODIGO_UBICACION", referencedColumnName = "CODIGO_UBICACION")
    private TBL_UBICACIONES ubicacion;

    /****************************************************/
    // relacion de uno a uno con la tabla de empleados
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
    private TBL_EMPLEADOS empleado;

}
