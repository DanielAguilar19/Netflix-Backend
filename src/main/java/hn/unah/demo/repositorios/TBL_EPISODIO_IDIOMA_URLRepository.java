package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.demo.modelos.TBL_EPISODIO_IDIOMA_URL;
import jakarta.persistence.Entity;

@Entity


public interface TBL_EPISODIO_IDIOMA_URLRepository extends JpaRepository<TBL_EPISODIO_IDIOMA_URL, Long> {
}
