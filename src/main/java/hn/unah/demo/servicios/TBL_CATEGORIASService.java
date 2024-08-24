package hn.unah.demo.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.modelos.TBL_CATEGORIAS;
import hn.unah.demo.modelos.TBL_CONTENIDO;
import hn.unah.demo.repositorios.TBL_CATEGORIASRepository;
import hn.unah.demo.repositorios.TBL_CONTENIDORepository;

@Service

public class TBL_CATEGORIASService {

    @Autowired

    private TBL_CATEGORIASRepository tbl_CATEGORIASRepository;

    private TBL_CONTENIDORepository tbl_CONTENIDORepository;

    // metodo para crear y agregar contenidos a una categoria, enviando el condigo
    // de los conenidos(puede ser solo uno)
    public TBL_CATEGORIAS agregarContenidoACategoria(long codigoCategoria, List<Long> codigoContenidos) {

        if (this.tbl_CATEGORIASRepository.existsById(codigoCategoria)) {
            if (codigoContenidos != null) {

                List<TBL_CONTENIDO> listaContenidos = new ArrayList<>();

                for (Long conten : codigoContenidos) {
                    TBL_CONTENIDO objContenido = this.tbl_CONTENIDORepository.findById(conten).get();

                    listaContenidos.add(objContenido);

                }

                TBL_CATEGORIAS objCategoria = this.tbl_CATEGORIASRepository.findById(codigoCategoria).get();

                objCategoria.setListaContenido(listaContenidos);
                return this.tbl_CATEGORIASRepository.save(objCategoria);

            }
            return null;
        }
        return null;
    }

    // metodo para crear una categoria
    public TBL_CATEGORIAS crearNuevaCategoria(TBL_CATEGORIAS nvaCategoria) {

        if (nvaCategoria != null) {

            return this.tbl_CATEGORIASRepository.save(nvaCategoria);

        }
        return null;

    }

}
