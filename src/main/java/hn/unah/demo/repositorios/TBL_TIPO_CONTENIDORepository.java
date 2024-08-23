package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD:src/main/java/hn/unah/demo/repositorios/TBL_EPISODIO_TEMPORADARepository.java
import hn.unah.demo.modelos.TBL_EPISODIOS_X_TEMPORADA;

@Repository

public interface TBL_EPISODIO_TEMPORADARepository extends JpaRepository<TBL_EPISODIOS_X_TEMPORADA, Long> {
=======
import hn.unah.demo.modelos.TBL_TIPO_CONTENIDO;

@Repository


public interface  TBL_TIPO_CONTENIDORepository extends JpaRepository<TBL_TIPO_CONTENIDO, Long>{

    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce:src/main/java/hn/unah/demo/repositorios/TBL_TIPO_CONTENIDORepository.java
}
