package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_EPISODIO_TEMPORADA;

@Repository



public interface TBL_EPISODIO_TEMPORADARepository extends JpaRepository<TBL_EPISODIO_TEMPORADA, Long>{
}
