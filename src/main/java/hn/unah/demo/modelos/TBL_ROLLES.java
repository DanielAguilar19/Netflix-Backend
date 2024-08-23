package hn.unah.demo.modelos;

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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_ROLLES")
@Data
public class TBL_ROLLES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_ROLL")
    private Long idRol;

    @Column(name = "NOMBRE_ROLL")
    private String nombreRoll;

    @Column(name = "DESCRIPCION_ROLL")
    private String descripcionRoll;

    /******************************************/
    // relacion con la tabla de administradores_platafroma
    @OneToMany(mappedBy = "rolAdministrador", cascade = CascadeType.ALL)
    private List<TBL_ADMINISTRADORES_PLATAFORMA> listaAdministradoresPlataforma;

    ////////////////////////////////////////////
    // relacion de mucho a muchos entre roles y permisos (tabla intermedia
    //////////////////////////////////////////// reloes_permiso)
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "TBL_ROLES_PERMISOS", joinColumns = @JoinColumn(name = "CODIGO_ROLL", referencedColumnName = "CODIGO_ROLL"), inverseJoinColumns = @JoinColumn(name = "CODIGO_PERMISO", referencedColumnName = "CODIGO_PERMISO"))
    private List<TBL_PERMISOS> listaPermisos;

}
