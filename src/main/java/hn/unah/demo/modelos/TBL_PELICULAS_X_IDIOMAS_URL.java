package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_PELICULAS_X_IDIOMAS_URL")
@Data

public class TBL_PELICULAS_X_IDIOMAS_URL {

      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO_PI")
    private Long codigoRegistro;

    @Column(name = "URL_VIDEO")
    private String urlVideo;

    //idioma

    //pelicula
    
}
