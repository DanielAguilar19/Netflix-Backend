package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_EPISODIO_IDIOMA_URLRepository;

@Service

public class TBL_EPISODIO_IDIOMAS_URLService {

    @Autowired
    private TBL_EPISODIO_IDIOMA_URLRepository tbl_EPISODIO_IDIOMA_URLRepository;
    
}
