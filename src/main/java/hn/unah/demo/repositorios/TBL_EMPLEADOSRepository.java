package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_EMPLEADOS;

@Repository


public interface TBL_EMPLEADOSRepository extends JpaRepository<TBL_EMPLEADOS, Long> {

    
}
