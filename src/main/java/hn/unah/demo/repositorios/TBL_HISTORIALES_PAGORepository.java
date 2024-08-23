package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_HISTORIAL_PAGOS;

@Repository


public interface TBL_HISTORIALES_PAGORepository extends JpaRepository<TBL_HISTORIAL_PAGOS, Long> {
}
