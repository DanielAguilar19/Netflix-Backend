package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_REPARTO;




@Repository


public interface TBL_REPARTORepository extends JpaRepository<TBL_REPARTO, Long> {
    
    
}