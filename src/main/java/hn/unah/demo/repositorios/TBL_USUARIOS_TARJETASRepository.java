package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_USUARIOS_TARJETAS;

@Repository


public interface TBL_USUARIOS_TARJETASRepository extends JpaRepository<TBL_USUARIOS_TARJETAS, Long> {
    
}
