package hn.unah.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.modelos.TBL_PERFILES;
import hn.unah.demo.modelos.TBL_USUARIOS;
import hn.unah.demo.repositorios.TBL_PERFILESRepository;
import hn.unah.demo.repositorios.TBL_USUARIOSRepository;

@Service

public class TBL_PERFILEService {

    @Autowired
    private TBL_PERFILESRepository tbl_PERFILESRepository;

    @Autowired
    private TBL_USUARIOSRepository tbl_usuariosRepository;

    // metodo para devolver los perfiles asociados a un usuario
    public List<TBL_PERFILES> obtenerListaPerfilesPorUsuario(long codigoUsuario) {
        if (this.tbl_usuariosRepository.existsById(codigoUsuario)) {

            TBL_USUARIOS objUsuario = this.tbl_usuariosRepository.findById(codigoUsuario).get();

            List<TBL_PERFILES> listaPerfiles = objUsuario.getListaPerfiles();

            return listaPerfiles;

        }

        return null;

    }

    // metodo para crear un perfil en la cuenta de un usuario
    public TBL_PERFILES crearNuevoPerfil(TBL_PERFILES nvoPerfil, long codigoUsuario) {
        if (this.tbl_usuariosRepository.existsById(codigoUsuario)) {

            TBL_USUARIOS objUsuario = this.tbl_usuariosRepository.findById(codigoUsuario).get();
            nvoPerfil.setUsuarios(objUsuario);
            return this.tbl_PERFILESRepository.save(nvoPerfil);

        }
        return null;
    }

    // metodo para eliminar un perfil asociado a un usuario
    public String eliminarPerfil(long codigoUsuario, long codigoPerfil) {

        if (this.tbl_usuariosRepository.existsById(codigoUsuario)) {
            if (this.tbl_PERFILESRepository.existsById(codigoPerfil)) {

                TBL_PERFILES objPerfil = this.tbl_PERFILESRepository.findById(codigoPerfil).get();
                if (objPerfil.getUsuarios().getCodigoUsuario() == codigoPerfil) {

                    this.tbl_PERFILESRepository.delete(objPerfil);

                }
                return null;
            }
            return null;
        }
        return null;
    }

}
