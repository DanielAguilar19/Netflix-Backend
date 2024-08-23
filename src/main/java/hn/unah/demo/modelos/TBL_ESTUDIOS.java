package hn.unah.demo.modelos;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Table(name = "TBL_ESTUDIOS")
@Data

public class TBL_ESTUDIOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_ESTUDIO")
    private Long codigoEstudio;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "UBICACION")
    private String ubicacion;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    //////////////////////////////////////////////////////
    // relacion de muchos a muchos con tbl contenido (tbl intermedia
    // contenido_estudios)
    @ManyToMany
    @JoinTable(name = "TBL_CONTENIDOS_X_ESTUDIO", joinColumns = @JoinColumn(name = "CODIGO_ESTUDIO", referencedColumnName = "CODIGO_ESTUDIO"), inverseJoinColumns = @JoinColumn(name = "CODIGO_CONTENIDO", referencedColumnName = "CODIGO_CONTENIDO"))
    private List<TBL_CONTENIDO> listaContenidoPorEstudio;

}
