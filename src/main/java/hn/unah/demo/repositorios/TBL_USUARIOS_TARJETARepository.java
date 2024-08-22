package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_USUARIO_TARJETAS;

@Repository


public interface TBL_USUARIOS_TARJETARepository extends JpaRepository<TBL_USUARIO_TARJETAS, Long> {
    
}
