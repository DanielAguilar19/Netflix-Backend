package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.modelos.TBL_HISTORIAL_USUARIOS_X_PLAN;
import hn.unah.demo.modelos.TBL_PERSONAS;
import hn.unah.demo.modelos.TBL_USUARIOS;
import hn.unah.demo.modelos.TBL_USUARIOS_TARJETAS;
import hn.unah.demo.repositorios.TBL_USUARIOSRepository;

@Service
public class TBL_USARIOSServices {

    @Autowired
    private TBL_USUARIOSRepository tblusuariorepository;

    @Autowired
    private TBL_PERSONASService tbl_PERSONASService;

    @Autowired
    private TBL_USUARIOS_TARJETASService tbl_USUARIOS_TARJETASService;

    @Autowired
    private TBL_HISTORIAL_USUARIOS_X_PLANService tbl_HISTORIAL_USUARIOS_X_PLANService;

    // metodo para crear un usuario
    public TBL_USUARIOS crearUsuario(TBL_USUARIOS nvoUsuario) {

        if (nvoUsuario != null) {

            return this.tblusuariorepository.save(nvoUsuario);

        }
        return null;
    }

    // metodo para editar campos de un usuario
    public TBL_USUARIOS editarUsuario(long codigoUsuario, TBL_USUARIOS nvoUsuarioEditado) {

        if (this.tblusuariorepository.existsById(codigoUsuario)) {

            TBL_USUARIOS objUsuario = this.tblusuariorepository.findById(codigoUsuario).get();
            // el correo no sera osible de editar que sera uno de los identificadores unicos
            objUsuario.setContrasenia(nvoUsuarioEditado.getContrasenia());

            return this.tblusuariorepository.save(objUsuario);
        }

        return null;
    }

    // metodo para validar existencia de un usuario
    public boolean validarUsuario(String correo, String contrasenia) {
        TBL_USUARIOS usuarioLoguear = this.tblusuariorepository.validarContraseniaCorreo(correo, contrasenia);
        if (usuarioLoguear != null) {
            return true;
        }
        return false;
    }

    // metodo para crear usuario asociarle las acciones para elegir plan y pagar
    public TBL_USUARIOS nvoRegistroInfoRequisitosCompletos(TBL_PERSONAS nvaPersona, String contrasenia,
            TBL_USUARIOS_TARJETAS nvaTarjeta, long codigoTipoPlan, long codigoTipoPago) {

        if (nvaPersona != null) {

            if (contrasenia != null) {

                TBL_PERSONAS nvaPersonas = this.tbl_PERSONASService.crearNuevaPersona(nvaPersona, contrasenia);

                // crear un objeto de la tarjeta i asociarala al usuario
                nvaPersona.getUsuario().getCodigoUsuario();
                TBL_USUARIOS_TARJETAS tarjetas = this.tbl_USUARIOS_TARJETASService
                        .guardarNuevaTarjetaAsiadaAUsuario(nvaTarjeta, nvaPersonas.getUsuario().getCodigoUsuario());

                // ¿que plan eligio?, aqui registramos su adquision
                // ***TBL_HISTORIAL_USUARIOS_X_PLAN nvoRegistroAdquisicionPlan = */
                this.tbl_HISTORIAL_USUARIOS_X_PLANService.crearNvoRegistroDeAdquisicion(
                        nvaPersona.getUsuario().getCodigoUsuario(), codigoTipoPlan, tarjetas.getCodigoRegistroTarjeta(),
                        codigoTipoPago);

            }
            return null;
        }
        return null;
    }

}
