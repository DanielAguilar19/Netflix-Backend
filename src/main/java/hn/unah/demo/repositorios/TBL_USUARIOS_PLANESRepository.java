package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_USUARIOS_PLANES;

@Repository


public interface TBL_USUARIOS_PLANESRepository extends JpaRepository<TBL_USUARIOS_PLANES, Long>{
}
