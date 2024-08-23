package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_PERFILES;

@Repository

public interface TBL_PERFILESRepository extends JpaRepository<TBL_PERFILES, Long> {

}
