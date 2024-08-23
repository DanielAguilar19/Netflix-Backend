package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_EPISODIOS_X_TEMPORADA")
@Data
public class TBL_EPISODIOS_X_TEMPORADA {
  @Id
  @Column(name = "CODIGO_EPISODIO_TEMPORADA")
  private Integer codigoEpisodioTemporada;

  @Column(name = "NUMERO_TEMPORADA") // controla el orden cronologico de cada episodio por tem serie
  private Integer numeroTemporada;

  @Column(name = "CODIGO_SERIE") // Fk
  private long codigoSerie;

  @Column(name = "CODIGO_EPISODIO") // FK
  private long codigoEpisodio;

}
