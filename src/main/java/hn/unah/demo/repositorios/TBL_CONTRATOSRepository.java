package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_CONTRATOS;

@Repository


public interface TBL_CONTRATOSRepository extends JpaRepository<TBL_CONTRATOS, Long>{
    
    
}
