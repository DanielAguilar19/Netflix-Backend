package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_TIPOS_ESTADO;

@Repository


public interface TBL_TIPO_ESTADORepository extends JpaRepository<TBL_TIPOS_ESTADO, Long>{
}
