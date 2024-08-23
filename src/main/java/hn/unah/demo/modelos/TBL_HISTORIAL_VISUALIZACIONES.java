package hn.unah.demo.modelos;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TBL_HISTORIAL_VISUALIZACIONES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_HISTORIAL")
    private Long idHistorial;

    @CreationTimestamp
    @Column(name = "FECHA_VISUALIZACION")
    @JsonProperty("fechaVisualizacion")
    private LocalDateTime fechaVisulizacion;

    @Column(name = "PROGRESO")
    private String progreso;

    /**********************************************/
    private Long ID_CONTENIDO;

    private Long CODIGO_PERFIL;

}
