package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.modelos.TBL_PERSONAS;
import hn.unah.demo.modelos.TBL_USUARIOS;
import hn.unah.demo.repositorios.TBL_PERSONASRepository;
import hn.unah.demo.repositorios.TBL_USUARIOSRepository;

@Service

public class TBL_PERSONASService {

    @Autowired
    private TBL_PERSONASRepository tblPersonasRepository;

    @Autowired

    private TBL_USUARIOSRepository tblUsuariosRepository;

    // metodo para crear un usuario partiendo de la jerarquia
    public TBL_PERSONAS crearNuevaPersona(TBL_PERSONAS nvaPersona, String contrasenia) {

        if (!this.tblPersonasRepository.existdByEmail(nvaPersona.getEmail())) {

            this.tblPersonasRepository.save(nvaPersona);
            TBL_USUARIOS newUsuario = new TBL_USUARIOS();

            newUsuario.setPersona(nvaPersona);
            newUsuario.setContrasenia(contrasenia);
            // guardar el usuario
            this.tblUsuariosRepository.save(newUsuario);

        }
        return null;
    }

}
