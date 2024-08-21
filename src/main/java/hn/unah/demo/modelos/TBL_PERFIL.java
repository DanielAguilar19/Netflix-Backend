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
@Table(name = "")
@Data

public class TBL_PERFIL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DIRECTOR")
    private Long idDirector;

    @Column(name = "NOMBRE")
    private String nombre;

    @CreationTimestamp
    @Column(name = "FECHA_NACIMIENTO")
    @JsonProperty("fechaNacimiento")
    private LocalDateTime fechaNacimiento;

    @Column(name = "BIOGRAFIA")
    private String biografia;


    //no tiene relaciones
    
}
