package hn.unah.demo.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTRATOS")
@Data
public class TBL_CONTRATOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CONTRATO")
    private Long codigoContrato;

    @Column(name = "TIPO_CONTRATO")
    private String tipoContrato;

    @Column(name = "FECHA_INICIO")
    private Date fechaInicio;

    @Column(name = "FECHA_FIN")
    private Date fechaFin;

    //////////////////////////////////////////////////////
    // relacion de muchos a uno con la tabla de cargos
    @ManyToOne
    @JoinColumn(name = "CODIGO_CARGO", referencedColumnName = "CODIGO_CARGO")
    private TBL_CARGOS cargo;

    /////////////////////////////////////////////////////
    // relacion de muchos a uno con la tabla sueldos
    @ManyToOne
    @JoinColumn(name = "CODIGO_SUELDO", referencedColumnName = "CODIGO_SUELDO")
    private TBL_SUELDOS sueldo;

}
