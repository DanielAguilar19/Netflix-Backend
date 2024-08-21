package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_DIRECTORES;

@Repository

public interface TBL_DIRECTORESRepository extends JpaRepository<TBL_DIRECTORES,Long>{


    
}
