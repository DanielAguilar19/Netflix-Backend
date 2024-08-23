package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_EPISODIOS_X_TEMPORADARepository;

@Service

public class TBL_EPISODIOS_X_TEMPORADAService {

    @Autowired
    private TBL_EPISODIOS_X_TEMPORADARepository tbl_EPISODIOS_POR_TEMPORADARepository;
    
}
