package hn.unah.demo.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_IDIOMAS")
@Data
public class TBL_IDIOMAS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_IDIOMA")
<<<<<<< HEAD
    private Long idDescripcion;

    @Column(name = "NOMBRE_TIPO")
    private String tituloDescripcion;

    /////////////////////////////////////////////////////
    // relacion de uno a muchos con la tabla de perfiles
    @OneToMany(mappedBy = "idiomas", cascade = CascadeType.ALL)
    private List<TBL_PERFILES> listaPerfiles;

    /***************************************************/
    // relacion de muchos a muchos con la tabal contenido (tabla intermedia
    // contenido_idioma)
    @JsonIgnore
    @ManyToMany(mappedBy = "listaIdomasPorContenido", cascade = CascadeType.ALL)
    private List<TBL_CONTENIDO> listaContenido;

    /****************************************************/
    // relacion de mucho a muchos con peliculas (tabla intermedia
    // pelicilas_idiomas_url)
    @ManyToMany(mappedBy = "listaIdiomas", cascade = CascadeType.ALL)
    private List<TBL_PELICULAS> listaPeliculas;

    /**************************************************/
    // reliacion de muchos a muchos con la tabla eposdois (tbl intermdia episodios
    // idiomas)
    @ManyToMany(mappedBy = "listasIdiomasPorEpisodios", cascade = CascadeType.ALL)
    private List<TBL_EPISODIOS> listaEpisodios;
=======
    private Long codigoIdioma;

    @Column(name = "NOMBRE_TIPO")
    private String nombreTipo;

    
    //no tiene
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
