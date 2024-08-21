package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_DESCRIPCIONES;

@Repository


public interface TBL_DESCRIPCIONESRepository extends JpaRepository<TBL_DESCRIPCIONES, Long>{

    
}
