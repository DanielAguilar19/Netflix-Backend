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
@Table(name = "TBL_DEPARTAMENTO_LABORAL")
@Data
public class TBL_DEPARTAMENTO_LABORAL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_DEPARTAMENTO")
    private Long codigoDepartamento;

    @Column(name = "NOMBRE_DEPARTAMENTO")
    private String nombreDepartamento;

    /***************************************/
    // relacion de uno a muchos con la tabla empeleados
    @OneToMany(mappedBy = "departamentoLaboral", cascade = CascadeType.ALL)
    private List<TBL_EMPLEADOS> listaEmpleadosDepartamento;
}
