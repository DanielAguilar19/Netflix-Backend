package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTENIDO_GENERORepository;

@Service

public class TBL_CONTENIDO_GENEROSService {
    @Autowired
    private TBL_CONTENIDO_GENERORepository tbl_CONTENIDO_GENERORepository;
    
}
