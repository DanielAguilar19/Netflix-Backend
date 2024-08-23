package hn.unah.demo.modelos;



import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_PERSONAS")
@Data

public class TBL_PERSONA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_PERSONA")
    private Long codigoPersona;

     @Column(name = "P_NOMBRE")
    private String primerNombre;

    @Column(name = "S_NOMBRE")
    private String segundoNombre;

    @Column(name = "P_APELLIDO")
    private String primerApellido;

    @Column(name = "S_APELLIDO")
    private String segundoApellido;

    @Column(name = "CORREO_ELECTRONICO")
    private String correo;

    @Column(name = "TELEFONO")
    private String telefono;

    @CreationTimestamp
    @Column(name = "FECHA_REGISTRO")
    @JsonProperty("fecharegistro")
    private LocalDateTime fechaRegistro;

   

    


    //ubicacion
    
}
