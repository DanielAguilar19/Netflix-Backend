package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_ADMINISTRADORES_PLATAFORMARepository;

@Service

public class TBL_ADMINISTRADORES_PLATAFORMAService {

    @Autowired 
    private TBL_ADMINISTRADORES_PLATAFORMARepository tbl_ADMINISTRACION_PLATAFORMARepository;
    
}
