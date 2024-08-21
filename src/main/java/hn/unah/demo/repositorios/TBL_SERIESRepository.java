package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_SERIES;

@Repository


public interface TBL_SERIESRepository extends JpaRepository<TBL_SERIES, Long> {

    
}
