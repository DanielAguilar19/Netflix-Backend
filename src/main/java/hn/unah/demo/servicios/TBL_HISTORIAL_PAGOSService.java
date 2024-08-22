package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_HISTORIALES_PAGORepository;

@Service

public class TBL_HISTORIAL_PAGOSService {

    @Autowired
    private TBL_HISTORIALES_PAGORepository tbl_HISTORIALES_PAGORepository;
    
}
