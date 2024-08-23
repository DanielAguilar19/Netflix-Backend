package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_PELICULA_IDIOMA_URL;

@Repository


public interface TBL_PELICULAS_IDIOMAS_URLRepository extends JpaRepository<TBL_PELICULA_IDIOMA_URL, Long> {


    
}
