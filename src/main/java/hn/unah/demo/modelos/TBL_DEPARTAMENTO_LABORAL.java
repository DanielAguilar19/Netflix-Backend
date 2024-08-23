<<<<<<< HEAD
package hn.unah.demo.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
=======

package hn.unah.demo.modelos;



>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.OneToMany;
=======
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Table;
import lombok.Data;

@Entity
<<<<<<< HEAD
@Table(name = "TBL_DEPARTAMENTO_LABORAL")
@Data
public class TBL_DEPARTAMENTO_LABORAL {

    @Id
=======
@Table(name = "DEPARTAMENTO_LABORAL")
@Data

public class TBL_DEPARTAMENTO_LABORAL{


     @Id
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_DEPARTAMENTO")
    private Long codigoDepartamento;

    @Column(name = "NOMBRE_DEPARTAMENTO")
    private String nombreDepartamento;

<<<<<<< HEAD
    /***************************************/
    // relacion de uno a muchos con la tabla empeleados
    @OneToMany(mappedBy = "departamentoLaboral", cascade = CascadeType.ALL)
    private List<TBL_EMPLEADOS> listaEmpleadosDepartamento;
=======
   




    //con empleados


>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
