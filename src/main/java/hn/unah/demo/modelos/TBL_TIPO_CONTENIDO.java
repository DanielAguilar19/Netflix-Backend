package hn.unah.demo.modelos;

import java.util.List;

import javax.print.DocFlavor.STRING;

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
@Table(name = "TBL_TIPO_CONTENIDO")
@Data
public class TBL_TIPO_CONTENIDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_TIPO_CONTENIDO")
    private Long codigoTipoContenido;

    @Column(name = "NOMBRE_TIPO")
    private String nombreTipo;

    /******************************************/
    // relacion de uno a muchos con la tabla contenido
    @OneToMany(mappedBy = "tipoContenido", cascade = CascadeType.ALL)
    private List<TBL_CONTENIDO> listaContenido;
}
