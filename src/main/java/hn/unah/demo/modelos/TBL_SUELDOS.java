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
@Table(name = "TBL_SUELDOS")
@Data
public class TBL_SUELDOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_SUELDO")
    private long codigoSueldo;

    @Column(name = "MONTO_CANTIDAD")
    private long montoCantidad;

    /********************************************/
    // relacion de de uno a muchos con la tabla de contratos
    @OneToMany(mappedBy = "", cascade = CascadeType.ALL)
    private List<TBL_CONTRATOS> listaContratosPorTipoSueldo;

}
