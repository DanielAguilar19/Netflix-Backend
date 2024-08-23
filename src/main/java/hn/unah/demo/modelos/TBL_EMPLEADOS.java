package hn.unah.demo.modelos;

<<<<<<< HEAD
import java.util.List;

import jakarta.persistence.CascadeType;
=======


>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
=======
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_EMPLEADOS")
@Data
<<<<<<< HEAD
public class TBL_EMPLEADOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_EMPLEADO")
    private long codigoEmpleado;

    //////////////////////////////////////////////////
    // relacion de uno a uno con la tabla de personas
    @OneToOne
    @JoinColumn(name = "CODIGOPERSONA", referencedColumnName = "CODIGO_PEROSONA")
    private TBL_PERSONAS persona;

    //////////////////////////////////////////////////
    // relacion de uno a muchos RECURSIVIDAD
    @OneToMany
    @JoinColumn(name = "JEFE_INMEDIATO", referencedColumnName = "CODIGO_EMPLEADO")
    private List<TBL_EMPLEADOS> jefesInmediatos;

    /////////////////////////////////////////////////
    // relciaon de muchos a uno con la tabla de departamento_laboral
    @ManyToOne
    @JoinColumn(name = "CODIGO_DEPARTAMENTO", referencedColumnName = "CODIGO_DEPARTAMENTO")
    private TBL_DEPARTAMENTO_LABORAL departamentoLaboral;

    ////////////////////////////////////////////////
    // relacion de muchos a uno con la tabla de contratos
    @ManyToOne
    @JoinColumn(name = "CODIGO_CONTRATO", referencedColumnName = "CODIGO_CONTRATO")
    private TBL_CONTRATOS contratos;

    /**********************************************/
    //relacion de uno a uno con la tabla de adminstradores_platafrma
    @OneToOne(mappedBy = "empleado", cascade = CascadeType.ALL)
    private TBL_ADMINISTRADORES_PLATAFORMA administradorPlataforma;



=======

public class TBL_EMPLEADOS {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_EMPLEADOS")
    private Long codigoEmpleados;

    @Column(name = "SUELDO")
    private Integer sueldo;

    //departamento laboral

    //cargo

    //contratos

    //persona

    //administrador plataforma

    // con ella misma
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
