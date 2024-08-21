package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_REPARTO_CONTENIDO;

@Repository


public interface TBL_REPARTO_CONTENIDORepository extends JpaRepository<TBL_REPARTO_CONTENIDO, Long> {


    
}
