package hn.unah.demo.modelos;

<<<<<<< HEAD
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
=======
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Table;
import lombok.Data;

@Entity
<<<<<<< HEAD
@Table(name = "TBL_ACTORES")
@Data
public class TBL_ACTORES {
    @Id
    @Column(name = "CODIGO_ACTOR")
    private Integer codigoActor;
=======
@Table(name = "C##NETFLIX.ACTORES")
@Data

public class TBL_ACTORES {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACTORES")
    private Long idActores;
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce

    @Column(name = "NOMBRE")
    private String nombre;

<<<<<<< HEAD
    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "FECHA_NACIMIENTO")
    private LocalDate fechaNacimiento;

    @ManyToMany(mappedBy = "listaActores", cascade = CascadeType.ALL)
    private List<TBL_CONTENIDO> listaContenidoActores;

=======
    @CreationTimestamp
    @Column(name = "FECHA_NACIMIENTO")
    @JsonProperty("fechaNacimiento")
    private LocalDateTime fechaNacimiento;

    @Column(name = "BIOGRAFIA")
    private String biografia;

    //no tiene relacion
    
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
