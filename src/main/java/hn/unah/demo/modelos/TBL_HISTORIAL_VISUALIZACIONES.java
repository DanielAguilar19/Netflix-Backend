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
@Table(name = "TBL_HISTORIAL_VISUALIZACION")
@Data

public class TBL_HISTORIAL_VISUALIZACIONES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_HISTORIAL")
    private Long idHistorial;

    @CreationTimestamp
    @Column(name = "FECHA_VISUALIZACION")
    @JsonProperty("fechaVisualizacion")
    private LocalDateTime fechaVisulizacion;

<<<<<<< HEAD
    @Column(name = "PROGRESO")
    private String progreso;

    /**********************************************/
    private Long ID_CONTENIDO;

    private Long CODIGO_PERFIL;

=======
    @Column(name= "PROGRESO")
    private Double progreso;

    //perfiles


    //contenido
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
