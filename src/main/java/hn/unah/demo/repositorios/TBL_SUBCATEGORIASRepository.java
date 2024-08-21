package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_SUBCATEGORIAS;

@Repository



public interface TBL_SUBCATEGORIASRepository extends JpaRepository<TBL_SUBCATEGORIAS, Long> {
}
