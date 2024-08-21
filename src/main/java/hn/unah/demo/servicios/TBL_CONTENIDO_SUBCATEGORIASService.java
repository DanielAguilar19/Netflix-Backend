package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTENIDO_SUBCATEGORIASRepository;

@Service

public class TBL_CONTENIDO_SUBCATEGORIASService {

    @Autowired
    private TBL_CONTENIDO_SUBCATEGORIASRepository tbl_CONTENIDO_SUBCATEGORIASRepository;
    
}
