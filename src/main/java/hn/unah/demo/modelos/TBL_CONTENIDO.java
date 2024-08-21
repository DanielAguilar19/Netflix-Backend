package hn.unah.demo.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_CONTENIDO")
@Data
public class TBL_CONTENIDO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTENIDO")
    private Long idConteido ;

    @Column(name "TITULO")
    private String titulo;

    @Column(name = "DESCRIPCION")
    private Stirng descripcion;

    @CreationTimestamp
    @Column(name = "FECHA_LANZAMIENTO")
    private LocalDateTime fechaLanzamiento;

    @Column(name = "TIPO_CONTENIDO")
    private String tipoContenido;

    @Column(name="DURACION")
    private Doble duracion;


    
     //no tiene

    
}
