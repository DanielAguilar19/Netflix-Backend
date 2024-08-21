package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTENIDO_DESCRIPCIONESRepository;

@Service

public class TBL_CONTENIDO_DESCRIPCIONESService {

    @Autowired
    private TBL_CONTENIDO_DESCRIPCIONESRepository tbl_CONTENIDO_DESCRIPCIONESRepository;
    
}
