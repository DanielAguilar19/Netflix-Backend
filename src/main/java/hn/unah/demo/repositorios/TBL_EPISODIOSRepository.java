package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_EPISODIOS;

@Repository

public interface TBL_EPISODIOSRepository extends JpaRepository<TBL_EPISODIOS, Long> {

}
