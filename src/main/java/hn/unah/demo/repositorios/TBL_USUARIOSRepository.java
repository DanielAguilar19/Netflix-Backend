package hn.unah.demo.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.demo.modelos.TBL_USUARIOS;

@Repository
public interface TBL_USUARIOSRepository extends JpaRepository<TBL_USUARIOS, Long> {
    @Query("SELECT u FROM TBL_USUARIOS u WHERE u.correo = :correo AND u.contrasenia = :contrasenia")
    TBL_USUARIOS validarContraseniaCorreo(String correo, String contrasenia);
}
