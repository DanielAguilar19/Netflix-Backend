package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTENIDO_ACTORESRepository;

@Service
public class TBL_CONTENIDO_ACTOREService {

    @Autowired
    private TBL_CONTENIDO_ACTORESRepository tblContenidopActoresRepository;
    
}
