package hn.unah.demo.modelos;

<<<<<<< HEAD
import java.time.LocalDateTime;
import java.util.List;
=======
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Table(name = "TBL_REPARTO")
@Data

public class TBL_REPARTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REPARTO")
<<<<<<< HEAD
    private Long codigoReparto;
=======
    private Long codigoReparto ;
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce

    @Column(name = "NOMBRE")
    private String nombre;

<<<<<<< HEAD
    @Column(name = "APELLIDO")
    @JsonProperty("apellido")
    private String apellido;

    @Column(name = "DIRECTOR")
    private Integer director;

    @Column(name = "ACTOR")
    private Integer actor;

    @ManyToMany(mappedBy = "listaReparto", cascade = CascadeType.ALL)
    private List<TBL_CONTENIDO> listaContenido;
=======

    @Column(name = "APELLIDO")
    private String apellido;


    @Column(name = "DIRECTOR")
    private Integer director;


    @Column(name = "ACTOR")
    private Integer actor;
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce

}
