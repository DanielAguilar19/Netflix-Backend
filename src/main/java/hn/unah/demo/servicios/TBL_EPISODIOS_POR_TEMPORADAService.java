package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_EPISODIOS_POR_TEMPORADARepository;

@Service

public class TBL_EPISODIOS_POR_TEMPORADAService {

    @Autowired
    private TBL_EPISODIOS_POR_TEMPORADARepository tbl_EPISODIOS_POR_TEMPORADARepository;
    
}
