package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_EPISODIO;

@Repository


public interface TBL_EPISODIORepository extends JpaRepository<TBL_EPISODIO, Long>{

    
}
