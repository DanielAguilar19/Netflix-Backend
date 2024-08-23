package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_EPISODIOS_X_TEMPORADA;

@Repository


public interface TBL_EPISODIOS_X_TEMPORADARepository extends JpaRepository<TBL_EPISODIOS_X_TEMPORADA, Long> {
}
