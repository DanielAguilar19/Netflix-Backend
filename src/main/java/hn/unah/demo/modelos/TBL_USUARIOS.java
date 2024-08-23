package hn.unah.demo.modelos;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_SYSTEM_USUARIOS")
@Data
public class TBL_USUARIOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "CONTRASENIA")
    private String contrasenia;

    ///////////////////////////////////////////////
    // relacion de uno a uno con la tabla de personas
    @OneToOne
    @JoinColumn(name = "CODIGO_PERSONA", referencedColumnName = "CODIGO_PERSONA")
    private TBL_PERSONAS persona;

    ////////////////////////////////////////////////
    //// relacion de muchoa a uno con la tabla de planes
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "TBL_USUARIOS_PLANES", joinColumns = @JoinColumn(name = "ID_USUARIOS", referencedColumnName = "ID_USUARIO"), inverseJoinColumns = @JoinColumn(name = "ID_PLAN", referencedColumnName = "ID_PLAN"))
    private List<TBL_PLANES_SUBSCRIPCION> listaPlanesSubscripcion;

    /********************************************/
    // relacion de uno a muchos con Tarjestas_usuario
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<TBL_USUARIOS_TARJETAS> listaTarjetasUsuario;

    /*******************************************/
    // relacion de uno amuchos con la talba perfiles
    @OneToMany(mappedBy = "usuarios", cascade = CascadeType.ALL)
    private List<TBL_PERFILES> listaPerfiles;

    

}
