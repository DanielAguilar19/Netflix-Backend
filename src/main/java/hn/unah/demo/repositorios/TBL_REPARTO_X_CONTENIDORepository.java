package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_REPARTO_X_CONTENIDO;

@Repository


public interface TBL_REPARTO_X_CONTENIDORepository extends JpaRepository<TBL_REPARTO_X_CONTENIDO, Long> {


    
}
