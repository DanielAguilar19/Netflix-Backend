package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_PERMISOS_X_ROLLES")

public class TBL_PERMISOS_X_ROLLES {


    @Column(name = "CODIGO_PERMISO") // esta es una tabla intermedia entre tbl rolles y tbl permisos
    private long codigoPermiso;

    @Column(name = "CODIGO_ROL")
    private long codigoRoll;

}
