package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_EPISODIO_TEMPORADARepository;

@Service

public class TBL_EPISODIOS_TEMPORADAService {

    @Autowired
    private TBL_EPISODIO_TEMPORADARepository tbl_EPISODIO_TEMPORADARepository;
    
}
