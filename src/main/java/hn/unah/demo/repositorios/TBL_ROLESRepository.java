package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_ROLES;

@Repository
public interface TBL_ROLESRepository extends JpaRepository<TBL_ROLES, Long> {

}
