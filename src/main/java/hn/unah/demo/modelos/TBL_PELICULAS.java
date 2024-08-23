package hn.unah.demo.modelos;

<<<<<<< HEAD
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_PELICULAS")
@Data
<<<<<<< HEAD
public class TBL_PELICULAS {

    @Id
=======

public class TBL_PELICULAS {

     @Id
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_PELICULA")
    private Long codigoPelicula;

    @Column(name = "DURACION")
    private String duracion;

<<<<<<< HEAD
    ///////////////////////////////////////////////////
    // relacion de muchos a uno con la tabla de contenido
    @ManyToOne
    @JoinColumn(name = "CODIGO_CONTENIDO", referencedColumnName = "CODIGO_CONTENIDO")
    private TBL_CONTENIDO contenido;

    ///////////////////////////////////////////////////
    // relacion de muchos a mcuhos con la tabla de idiomas (tabla intermedia
    /////////////////////////////////////////////////// peliculas_idioma_url)
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "TBL_PELICULAS_IDIOMAS_URL", joinColumns = @JoinColumn(name = "CODIGO_PELICULA", referencedColumnName = "CODIGO_PELICULA"), inverseJoinColumns = @JoinColumn(name = "CODIGO_IDIOMA", referencedColumnName = "CODIGO_IDIOMA"))
    private List<TBL_IDIOMAS> listaIdiomas;

=======
    //contenido
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
