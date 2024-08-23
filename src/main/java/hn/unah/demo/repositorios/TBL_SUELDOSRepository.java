package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_SUELDOS;

@Repository
public interface TBL_SUELDOSRepository extends JpaRepository<TBL_SUELDOS, Long> {

}
