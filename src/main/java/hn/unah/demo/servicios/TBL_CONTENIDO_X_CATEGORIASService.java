package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTENIDO_X_CATEGORIASRepository;

@Service

public class TBL_CONTENIDO_X_CATEGORIASService {

    @Autowired
    private TBL_CONTENIDO_X_CATEGORIASRepository tbl_CONTENIDO_SUBCATEGORIASRepository;
    
}
