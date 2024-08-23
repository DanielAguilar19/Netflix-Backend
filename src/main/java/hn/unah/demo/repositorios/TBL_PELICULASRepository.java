package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_PELICULAS;

@Repository


public interface TBL_PELICULASRepository extends JpaRepository<TBL_PELICULAS, Long>{
}
