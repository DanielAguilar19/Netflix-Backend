package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_CONTENIDOS_X_ESTUDIO;

@Repository

public interface TBL_CONTENIDOS_X_ESTUDIORepository extends JpaRepository<TBL_CONTENIDOS_X_ESTUDIO, Long> {

}
