package hn.unah.demo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.modelos.TBL_CATEGORIAS;
import hn.unah.demo.servicios.TBL_CATEGORIASService;

@RestController
@RequestMapping("/api/categorias")

public class TBL_CATEGORIASController {

    @Autowired
    private TBL_CATEGORIASService tbl_CATEGORIASService;

    @PostMapping("/agregarcontenido/{codigoCategoria}")
    public TBL_CATEGORIAS agregarContenidoAcategoria(@PathVariable(name = "codigoCategoria") long codigoCategoria,
            @RequestParam List<Long> codigosCategoria) {

        return this.tbl_CATEGORIASService.agregarContenidoACategoria(codigoCategoria, codigosCategoria);

    }

    @PostMapping("/crear/categoria")
    public TBL_CATEGORIAS crearNuevaCategoria() {
        return this.tbl_CATEGORIASService.crearNuevaCategoria(new TBL_CATEGORIAS());
    }

}
