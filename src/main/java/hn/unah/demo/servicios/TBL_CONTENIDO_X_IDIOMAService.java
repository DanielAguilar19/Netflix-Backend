package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTENIDO_X_IDIOMARepository;

@Service
public class TBL_CONTENIDO_X_IDIOMAService {

    @Autowired
    private TBL_CONTENIDO_X_IDIOMARepository tbl_contenidoIdiomaRepository;
    
}
