package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_ADMINISTRADORES_PLATAFORMA;

@Repository

public interface TBL_ADMINISTRADORES_PLATAFORMARepository extends JpaRepository<TBL_ADMINISTRADORES_PLATAFORMA, Long> {
}
