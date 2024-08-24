package hn.unah.demo.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_TIPO_PLANES_SUBSCRIPCION")
public class TBL_TIPO_PLANES_SUBSCRIPCION {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_PLAN")
    private Long idPlan;

    @Column(name = "NOMBE_PLAN")
    private String nombrePlan;

    @Column(name = "PRECIO")
    private Double precio;

    @Column(name = "PERFILES_DISPOSICIONES")
    private Integer perfilesDisposiciones;

    @Column(name = "MIEMBROS_EXTRAS")
    private Integer miembrosExtras;

    @Column(name = "RESOLUCION")
    private String resolucion;

    @Column(name = "TIEMPO_ACCESOS")
    private Integer timepoAcceso;

    /********************************************/
    // relacion de uno a muchos con la tabal de usuarios planes (un plan puede ser
    // basico , medio , premiun)(una subscripcion es la furacion por la ques se pago
    // ese plan )
    @OneToMany(mappedBy = "codigoPlan", cascade = CascadeType.ALL)
    private List<TBL_HISTORIAL_USUARIOS_X_PLAN> listaUsuariosPorPlan;

    // un usuario puede tenr asosciado muchos tipos de planes que a usado (debemos
    // de incluor un estado de activo o no , para ver cual de los que ha comprado su
    // servicio en los regusstro de la tabla es el que tiene cativo actialemrnte )
    // unn plan

    @JsonIgnore
    @ManyToMany(mappedBy = "listaPlanesSubscripcion", cascade = CascadeType.ALL)
    private List<TBL_USUARIOS> listaUsuarios;

}
