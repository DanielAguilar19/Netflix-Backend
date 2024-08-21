package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_UBICACIONES")
@Data
public class TBL_UBICACIONES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_UBICACION")
    private long idUbicacion;

    @Column(name = "NOMBRE_LUGAR")
    private String nombreLuagar;

    @Column(name = "Tipo")
    private String tipo;

    // relacion con la misma tabla (recusrsiva )
}
