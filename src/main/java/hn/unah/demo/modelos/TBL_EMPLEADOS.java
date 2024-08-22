package hn.unah.demo.modelos;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_EMPLEADOS")
@Data

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
    
}
