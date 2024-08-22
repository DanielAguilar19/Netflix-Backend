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
@Table(name = "TBL_EPISODIOS")
@Data

public class TBL_EPISODIO {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_EPISODIO")
    private Long codigoEpisodio;

    @Column(name = "DURACION")
    private String duracion;

    @Column(name = "TITULO_EPISODIO")
    private String tituloEpisodio;

    @Column(name = "DESCRIPCION")
    private String descripcion;

   

    @CreationTimestamp
    @Column(name = "FECHA_LAZAMIENTO")
    @JsonProperty("fechaLazamiento")
    private LocalDateTime fechaLazamiento;

    //no tiene 
    
}
