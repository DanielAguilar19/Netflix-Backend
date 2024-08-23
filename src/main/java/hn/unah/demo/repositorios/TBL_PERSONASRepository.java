package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_PERSONAS;

@Repository

public interface TBL_PERSONASRepository extends JpaRepository<TBL_PERSONAS, Long> {

}
