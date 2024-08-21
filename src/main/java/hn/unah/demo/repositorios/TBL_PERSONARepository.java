package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_PERSONA;

@Repository

public interface TBL_PERSONARepository extends JpaRepository<TBL_PERSONA,Long>{


    
}
