package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.modelos.TBL_PERSONAS;
import hn.unah.demo.modelos.TBL_USUARIOS;
import hn.unah.demo.modelos.TBL_USUARIOS_TARJETAS;
import hn.unah.demo.repositorios.TBL_PERSONASRepository;
import hn.unah.demo.servicios.TBL_PERSONASService;
import hn.unah.demo.servicios.TBL_USARIOSServices;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/usuarios")
public class TBL_USUARIOSControllers {

    @Autowired
    private TBL_USARIOSServices tbl_USARIOSServices;

    @Autowired
    private TBL_PERSONASService tbl_PERSONASService;

    // metodo para crear solamente el usuario
    @PostMapping("/crear/usuario")
    public TBL_USUARIOS crearRegistroUsuarioNuevo(@RequestBody TBL_PERSONAS nvapersona,
            @RequestParam String contrasenia) {

        return this.tbl_USARIOSServices.crearUsuario(nvapersona, contrasenia);

    }

    @PostMapping("/crear/registroCompleto/{codigoTipoPlan}")
    public TBL_USUARIOS registroCompletoAccederPlataforma(@RequestBody TBL_PERSONAS nvapersona,
            @RequestParam String contrasenia, @RequestBody TBL_USUARIOS_TARJETAS tarjeta,
            @PathVariable(name = "codigoTipoPlan") long codigoTipoPlan, @RequestParam long codigoTipoPago) {

        return this.tbl_USARIOSServices.nvoRegistroInfoRequisitosCompletos(nvapersona, contrasenia, tarjeta,
                codigoTipoPlan, codigoTipoPago);

    }

}
