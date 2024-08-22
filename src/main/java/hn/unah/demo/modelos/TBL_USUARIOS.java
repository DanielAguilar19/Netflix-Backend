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
@Table(name = "TBL_SYSTEM_USUARIOS")
@Data
public class TBL_USUARIOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "P_NOMBRE")
    private String primerNombre;

    @Column(name = "S_NOMBRE")
    private String segundoNombre;

    @Column(name = "P_APELLIDO")
    private String primerApellido;

    @Column(name = "S_APELLIDO")
    private String segundoApellido;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CONTRASENIA")
    private String contrasenia;

    @CreationTimestamp
    @Column(name = "FECHA_REGISTRO")
    @JsonProperty("fecharegistro")
    private LocalDateTime fechaRegistro;

    

}
