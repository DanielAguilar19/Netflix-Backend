package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_PAGOS;

@Repository


public interface TBL_PAGORepository extends JpaRepository<TBL_PAGOS, Long>{
}
