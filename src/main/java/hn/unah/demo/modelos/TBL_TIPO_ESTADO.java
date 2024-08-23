package hn.unah.demo.modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "TBL_TIPO_ESTADO")
@Data

public class TBL_TIPO_ESTADO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_ESTADO")
    private Long codigoEstado;

    @Column(name = "TIPO_ESTADO")
    private String tipoEstado;

    /***************************************/
    // relacion de uno a mcuhcos con la tbl historial_usuarios_x_plan
    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<TBL_HISTORIAL_USUARIOS_X_PLAN> listaEstados;

}
