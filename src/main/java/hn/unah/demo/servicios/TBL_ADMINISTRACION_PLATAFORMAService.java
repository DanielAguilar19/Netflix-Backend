package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_ADMINISTRACION_PLATAFORMARepository;

@Service

public class TBL_ADMINISTRACION_PLATAFORMAService {

    @Autowired 
    private TBL_ADMINISTRACION_PLATAFORMARepository tbl_ADMINISTRACION_PLATAFORMARepository;
    
}
