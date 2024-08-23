package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_ADMINISTRADORES_PLATAFORMA")
@Data
public class TBL_ADMINISTRADORES_PLATAFORMA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_ADMINISTRADOR")
    private Long codigoAdministrador;

    @Column(name = "USUARIO_ADMINISTRADOR") // es eñ mombre del usuario asignado (no es el nombre de la persona como
                                            // tal)
    private String usuarioAdministrador;

    @Column(name = "CONTRASENA_ADMINISTRADOR")
    private String contrasenaAdministrador;

    //////////////////////////////////////////////////////////
    // relacion de uno a uno con la tabla empleados
    @OneToOne
    @JoinColumn(name = "CODIGO_EMPLEADO", referencedColumnName = "CODIGO_EMPLEADO")
    private TBL_EMPLEADOS empleado;

    /////////////////////////////////////////////////////////
    // relacion de muchos a uno con la tablas roles (rooll es que tipo actividades
    ///////////////////////////////////////////////////////// es encargado
    ///////////////////////////////////////////////////////// adminsitrar ,dentro de
    ///////////////////////////////////////////////////////// la platafroma)
    @ManyToOne
    @JoinColumn(name = "CODIGO_ROLL", referencedColumnName = "CODIGO_ROLL")
    private TBL_ROLLES rolAdministrador;

}