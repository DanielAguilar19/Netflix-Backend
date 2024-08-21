package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_ADMINISTRACION_PLATAFORMA;

@Repository


public interface TBL_ADMINISTRACION_PLATAFORMARepository extends JpaRepository<TBL_ADMINISTRACION_PLATAFORMA, Long>{
}
