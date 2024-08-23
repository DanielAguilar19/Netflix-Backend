package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.demo.modelos.TBL_EPISODIOS_X_IDIOMAS_URL;
import jakarta.persistence.Entity;

@Entity

public interface TBL_EPISODIOS_X_IDIOMAS_URLRepository extends JpaRepository<TBL_EPISODIOS_X_IDIOMAS_URL, Long> {
}
