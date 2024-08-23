package hn.unah.demo.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_UBICACIONES")
@Data
public class TBL_UBICACIONES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_UBICACION")
    private long idUbicacion;

    @Column(name = "NOMBRE_LUGAR")
    private String nombreLuagar;

    @Column(name = "TIPO")
    private String tipo;


    //codigo lugar padre

    // relacion con la misma tabla (recusrsiva )
    /*****************************************************/
    // relacion de uno a muchos con la tabla personas
    @OneToMany(mappedBy = "ubicacion", cascade = CascadeType.ALL)
    private List<TBL_PERSONAS> personas;


    /********************************************/
    //relacion de muchos a muchos con la tabla contenido (tbl intermedia contenido_paises)
    @ManyToMany(mappedBy="listaUbicaciones",cascade= CascadeType.ALL)
    private List<TBL_CONTENIDO> listaContenidoPorUbicacion;
}
