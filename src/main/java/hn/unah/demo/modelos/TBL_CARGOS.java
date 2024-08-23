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
@Table(name = "TBL_CARGOS")
@Data
public class TBL_CARGOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CARGO")
    private long codigoCargo;

    @Column(name = "NOMBRE_CARGO")
    private String nombreCargo;

    /********************************************/
    // relacion de uno a muchos con la tabla contratos
    @OneToMany(mappedBy = "cargo", cascade = CascadeType.ALL)
    private List<TBL_CONTRATOS> listaContratosPorCargo;

}
