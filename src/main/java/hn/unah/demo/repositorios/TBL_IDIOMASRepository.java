package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_IDIOMAS;

@Repository


public interface TBL_IDIOMASRepository extends JpaRepository<TBL_IDIOMAS, Long>{

    
}
