package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hn.unah.demo.modelos.TBL_CONTENIDO;

@Repository
public interface TBL_CONTENIDORepository extends JpaRepository<TBL_CONTENIDO, Long> {
    
}
