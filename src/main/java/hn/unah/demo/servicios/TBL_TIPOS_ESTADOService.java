package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_TIPO_ESTADORepository;

@Service

public class TBL_TIPOS_ESTADOService {
    @Autowired
    private TBL_TIPO_ESTADORepository tbl_TIPO_ESTADORepository;
    
}
