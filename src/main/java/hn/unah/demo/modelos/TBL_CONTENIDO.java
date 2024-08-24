package hn.unah.demo.modelos;

import java.time.LocalDateTime;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;

//import com.fasterxml.jackson.annotation.JsonIgnore;

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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTENIDO")
@Data
public class TBL_CONTENIDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CONTENIDO")
    private Long idConteido;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "CATEGORIA_PRINCIPAL")
    private Integer categoriaPrincipal;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @CreationTimestamp
    @Column(name = "FECHA_LANZAMIENTO")
    private LocalDateTime fechaLanzamiento;

    @Column(name = "RESTRICCION_EDAD")
    private Integer restriccionEdad;

    @Column(name = "DESCRIPCION_RESTRICCION") // cambiar de CLOB a STRING
    private String descripcionRestriccion;

    /***********************************************/
    // relacion de uno a muchos con la tabla series
    @OneToMany(mappedBy = "contenido", cascade = CascadeType.ALL)
    private List<TBL_SERIES> listaSerie;

    ////////////////////////////////////////////////
    // relacion de muchos a muchos con tbl ubicacinoes
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "TBL_CONTENIDO_PAISES", joinColumns = @JoinColumn(name = "CODIGO_CONTENIDO", referencedColumnName = "CODIGO_CONTENIDO"), inverseJoinColumns = @JoinColumn(name = "CODIGO_UBICACION", referencedColumnName = "CODIGO_UBICACION"))
    private List<TBL_UBICACIONES> listaUbicaciones;

    ////////////////////////////////////////////////
    // relacion de muchos a muchos con la tabla de contenido_idioma
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "TBL_CONTENIDO_X_IDIOMA", joinColumns = @JoinColumn(name = "CODIGO_CONTENIDO", referencedColumnName = "CODIGO_CONTENIDO"), inverseJoinColumns = @JoinColumn(name = "CODIGO_IDIOMA", referencedColumnName = "CODIGO_IDIOMA"))
    private List<TBL_IDIOMAS> listaContenidoPorIdioma;

    ///////////////////////////////////////////////
    // relacion de muchos a uno con la tbl tipo_contenido
    @ManyToOne
    @JoinColumn(name = "CODIGO_TIPO_CONTENIDO", referencedColumnName = "CODIGO_TIPO_CONTENIDO")
    private TBL_TIPO_CONTENIDO tipoContenido;

    /**********************************************/
    // relacion de muchos a muchos con tbl perfiles (tbl intermedia
    // historial_vizualizacion)
    // @JsonIgnore
    @ManyToMany(mappedBy = "listaContenidoPorPerfil", cascade = CascadeType.ALL)
    private List<TBL_PERFILES> listaPerfiles;

    ////////////////////////////////////////////////
    // relacion de muchos a muchos con la tabla de reparto (tbl intermedia
    // reparto_cotenido)
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "TBL_REPARTO_X_CONTENIDO", joinColumns = @JoinColumn(name = "CODIGO_CONTENIDO", referencedColumnName = "CODIGO_CONTENIDO"), inverseJoinColumns = @JoinColumn(name = "CODIGO_REPARTO", referencedColumnName = "CODIGO_REPARTO"))
    private List<TBL_REPARTO> listaReparto;

    /**********************************************/
    // relacion de muchos a muchos con tbl estudios (tbl intermedia
    // contenido_estudios)
    @ManyToMany(mappedBy = "listaContenidoPorEstudio", cascade = CascadeType.ALL)
    private List<TBL_ESTUDIOS> listaEstudios; // son los lugares de grabacion

    /*********************************************/
    // relacion de muchos a muchos con tbl categorias (tbl_intermedia
    // contenido_x_subcategoria)
    @ManyToMany(mappedBy = "listaContenido", cascade = CascadeType.ALL)
    private List<TBL_CATEGORIAS> listacategoria;

    /*********************************************/
    // relacion de uno a muchos con la tabla peliculas
    @OneToMany(mappedBy = "contenido", cascade = CascadeType.ALL)
    private List<TBL_PELICULAS> listaPeliculas;

    ///////////////////////////////////////////////
    // relacion de muchos a muchos con tbl Actores
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "TBL_CONTENIDO_X_ACTORES", joinColumns = @JoinColumn(name = "CODIGO_CONTENIDO", referencedColumnName = "CODIGO_CONTENIDO"), inverseJoinColumns = @JoinColumn(name = "CODIGO_ACTOR", referencedColumnName = "CODIGO_ACTOR"))
    private List<TBL_ACTORES> listaActores;

    ///////////////////////////////////////////////
    // relacino de muchos a uno con la tabla restricciones
    @ManyToOne
    @JoinColumn(name = "CODIGO_RESTRICCION", referencedColumnName = "CODIGO_RESTRICCION")
    private TBL_RESTRICCIONES restricciones;

}
