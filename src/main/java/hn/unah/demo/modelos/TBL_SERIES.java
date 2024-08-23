package hn.unah.demo.modelos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_SERIES")
@Data

public class TBL_SERIES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_SERIE")
    private Long codigoSerie;

    // @Column(name = "NOMBRE_GENERO")
    // private String nombreGenero;

    @Column(name = "NUMERO_TEMPORADAS")
    Integer numeroTemporadas;

    //////////////////////////////////////
    // relacion de muchos a muchos con la tabla episodios (tabla intermedia
    // episodios_por_teporadas)
    @ManyToMany
    @JoinTable(name = "TBL_EPISODIOS_X_TEMPORADA", joinColumns = @JoinColumn(name = "CODIGO_SERIE", referencedColumnName = "CODIGO_SERIE"), inverseJoinColumns = @JoinColumn(name = "CODIGO_EPISODIO", referencedColumnName = "CODIGO_EPISODIO"))
    private List<TBL_EPISODIOS> listaEpisodios;
    /***********************************/
    // relacion de muchos a uno con la tabla contenido
    @ManyToOne
    @JoinColumn(name = "CODIGO_CONTENIDO", referencedColumnName = "CODIGO_CONTENIDO")
    private TBL_CONTENIDO contenido;
}
