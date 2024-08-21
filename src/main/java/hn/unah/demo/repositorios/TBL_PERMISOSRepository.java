package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import hn.unah.demo.modelos.TBL_PERMISOS;

@Repository


public interface TBL_PERMISOSRepository extends JpaRepository<TBL_PERMISOS, Long> {


    
}
