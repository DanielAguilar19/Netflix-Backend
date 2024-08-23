package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_TIPO_ESTADO;

@Repository


public interface TBL_TIPO_ESTADORepository extends JpaRepository<TBL_TIPO_ESTADO, Long>{
}
