package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.modelos.TBL_USUARIOS;
import hn.unah.demo.repositorios.TBL_USUARIOSRepository;

@Service
public class TBL_USARIOSServices {

    @Autowired
    private TBL_USUARIOSRepository tblusuariorepository;

    // metodo para crear un usuario
    public TBL_USUARIOS crearUsuario(TBL_USUARIOS nvoUsuario) {

        if (nvoUsuario != null) {

            return this.tblusuariorepository.save(nvoUsuario);

        }
        return null;
    }

    // metodo para editar campos de un usuario
    public TBL_USUARIOS editarUsuario(long codigoUsuario, TBL_USUARIOS nvoUsuarioEditado) {

        // TBL_USUARIOS objUsuario = this.tblusuar
        return null;
    }
}
