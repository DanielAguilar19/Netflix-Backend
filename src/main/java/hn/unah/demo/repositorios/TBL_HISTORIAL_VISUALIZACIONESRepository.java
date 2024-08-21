package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_HISTORIAL_VISUALIZACIONES;

@Repository


public interface TBL_HISTORIAL_VISUALIZACIONESRepository extends JpaRepository<TBL_HISTORIAL_VISUALIZACIONES, Long> {
}
