package hn.unah.demo.modelos;

import java.time.LocalDateTime;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
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
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_PERFILES")
@Data

public class TBL_PERFILES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_PERFIL")
    private Long codigoPerfil;

    @Column(name = "NOMBRE_PERFIL")
    private String nombrePerfil;

    @Column(name = "REPRODUCCION_AUTOMATICA")
    private boolean reproduccionAutomatica;

    @CreationTimestamp
    @Column(name = "FECHA_CREACION")
    // @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDateTime fechaCreacion;

    ////////////////////////////////////////////////
    // relacion de muhcos a uno con la tabal usuarios
    @ManyToOne
    @JoinColumn(name = "CODIGO_USUARIO", referencedColumnName = "CODIGO_USUARIO")
    private TBL_USUARIOS usuarios;

    ///////////////////////////////////////////////
    // relacion de muchos a uno con la tabal de idiomas
    @ManyToOne
    @JoinColumn(name = "CODIGO_IDIOMA", referencedColumnName = "CODIGO_IDIOMA")
    private TBL_IDIOMAS idiomas;

    ///////////////////////////////////////////////
    // relacion de muchos a muchos con contenido (tbl intermedia
    // historil_vizualizaciones)
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "TBL_HISTORIAL_VISUALIZACINONES", joinColumns = @JoinColumn(name = "CODIGO_PERFIL", referencedColumnName = "CODIGO_PERFIL"), inverseJoinColumns = @JoinColumn(name = "CODIGO_CONTENIDO", referencedColumnName = "CODIGO_CONTENIDO"))
    private List<TBL_CONTENIDO> listaContenidoPorPerfil;

}
