package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_ROLES_PERMISOS")

public class TBL_ROLES_PERMISOS {

    // relacion entre roles

    // relacion entre permisos

    @Column(name = "CODIGO_PERMISO") // esta es una tabla intermedia entre tbl rolles y tbl permisos
    private long codigoPermiso;

    @Column(name = "CODIGO_ROLL")
    private long codigoRoll;

}
