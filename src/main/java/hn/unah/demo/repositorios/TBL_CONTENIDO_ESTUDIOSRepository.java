package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_CONTENIDO_ESTUDIOS;

@Repository

public interface TBL_CONTENIDO_ESTUDIOSRepository extends JpaRepository<TBL_CONTENIDO_ESTUDIOS, Long> {

}
