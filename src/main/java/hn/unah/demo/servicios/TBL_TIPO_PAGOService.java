package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_TIPO_PAGORepository;

@Service

public class TBL_TIPO_PAGOService {

    @Autowired
    private TBL_TIPO_PAGORepository tbl_TIPO_PAGORepository;
    
}
