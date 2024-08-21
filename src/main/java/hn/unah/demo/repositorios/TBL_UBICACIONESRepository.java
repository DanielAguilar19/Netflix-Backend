package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_UBICACIONES;

@Repository
public interface TBL_UBICACIONESRepository extends JpaRepository<TBL_UBICACIONES, Long> {

}
