package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_DEPARTAMENTO_LABORAL;

@Repository


public interface TBL_DEPARTAMENTO_LABORALRepository extends JpaRepository<TBL_DEPARTAMENTO_LABORAL, Long> {
}
