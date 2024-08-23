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
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_PERMISOS")
@Data

public class TBL_PERMISOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_PERMISO")
    private Long idPermiso;

    @Column(name = "NOMBRE_PERMISO")
    private String nombrePermiso;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @JsonIgnore
    @ManyToMany(mappedBy = "listaPermisos", cascade = CascadeType.ALL)
    private List<TBL_ROLES> listaRoles; // son los roles a lo que esta permos estan asociados

}
