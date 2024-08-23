package hn.unah.demo.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_ESTADO")
@Data
public class TBL_ESTADO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_ESTADO")
    private long codigoEstado;

    @Column(name = "TIPO_ESTADO")
    private String tipoEstado;

    /***************************************/
    // relacion de uno a muchos con la tabla de usuarios_planes
    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<TBL_USUARIOS_PLANES> listaUsuariosPlan;

}
