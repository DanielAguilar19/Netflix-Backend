package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_GENEROS;

@Repository


public interface TBL_GENEROSRepository extends JpaRepository<TBL_GENEROS, Long> {

    
}
