package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_RESTRICCIONES;

@Repository


public interface TBL_RESTRICCIONESRepository extends JpaRepository<TBL_RESTRICCIONES, Long>{
}
