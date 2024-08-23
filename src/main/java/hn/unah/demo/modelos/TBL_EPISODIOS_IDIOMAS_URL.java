package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_EPISODIOS_IDIOMAS_URL")
@Data
public class TBL_EPISODIOS_IDIOMAS_URL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private long codigoRegistro;

    @Column(name = "URL_VIDEO")
    private String url_video;

    @Column(name = "CODIGO_EPISODIO")
    private Long codigoEpisodio;

    @Column(name = "CODIGO_IDIOMA")
    private long codigoIdioma;
}
