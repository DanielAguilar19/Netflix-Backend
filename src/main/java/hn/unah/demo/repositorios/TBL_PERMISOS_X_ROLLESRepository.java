package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import hn.unah.demo.modelos.TBL_PERMISOS_X_ROLLES;

@Repository


public interface TBL_PERMISOS_X_ROLLESRepository extends JpaRepository<TBL_PERMISOS_X_ROLLES, Long>{
}
