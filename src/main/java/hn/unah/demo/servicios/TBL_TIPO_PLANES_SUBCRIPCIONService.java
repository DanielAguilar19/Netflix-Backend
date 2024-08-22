package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_TIPO_PLANES_SUBCRIPCIONRepository;

@Service

public class TBL_TIPO_PLANES_SUBCRIPCIONService {

    @Autowired
    private TBL_TIPO_PLANES_SUBCRIPCIONRepository tbl_TIPO_PLANES_SUBCRIPCIONRepository;
    
}
