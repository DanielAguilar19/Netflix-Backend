package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_PLANES_SUBSCRIPCION;

@Repository
public interface TBL_PLANES_SUBSCRIPCIONRepository extends JpaRepository<TBL_PLANES_SUBSCRIPCION, Long> {

}
