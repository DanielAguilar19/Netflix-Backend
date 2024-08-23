package hn.unah.demo.modelos;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    private Long codigoReparto;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    @JsonProperty("apellido")
    private String apellido;

    @Column(name = "DIRECTOR")
    private Integer director;

    @Column(name = "ACTOR")
    private Integer actor;

    @ManyToMany(mappedBy = "listaReparto", cascade = CascadeType.ALL)
    private List<TBL_CONTENIDO> listaContenido;

}
