package hn.unah.demo.modelos;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_EPISODIOS")
@Data
public class TBL_EPISODIOS {
    @Id
    @Column(name = "CODIGO_EPISODIO")
    private Integer CodigoEpisodio;

    @Column(name = "DURACION")
    private Integer duracion;

    @Column(name = "TITULO_EPISODIO")
    private String titulo;

    @Column(name = "FECHA_LANZAMIENTO")
    private LocalDate fechaLanzamiento;

    @ManyToMany(mappedBy = "listaEpisodios", cascade = CascadeType.ALL)
    private List<TBL_SERIES> listaSeries;

    ////////////////////////////////////////
    // relacion de muchos a mcuhos con la tabla idios (tbl intermedia
    //////////////////////////////////////// episodios_idiomas)
    @ManyToMany
    @JoinTable(name = "TBL_EPISODIOS_X_IDIOMAS_URL", joinColumns = @JoinColumn(name = "CODIGO_EPISODIO", referencedColumnName = "CODIGO_EPISODIO"), inverseJoinColumns = @JoinColumn(name = "CODIGO_IDIOMA", referencedColumnName = "CODIGO_IDIOMA"))
    private List<TBL_IDIOMAS> listasIdiomasPorEpisodios;

    // falta relacion con tabla EPISODIOS_IDIOMAS_URL
}
