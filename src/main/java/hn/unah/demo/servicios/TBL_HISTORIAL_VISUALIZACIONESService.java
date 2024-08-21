package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_HISTORIAL_VISUALIZACIONESRepository;

@Service

public class TBL_HISTORIAL_VISUALIZACIONESService {
    @Autowired

    private TBL_HISTORIAL_VISUALIZACIONESRepository tbl_HISTORIAL_VISUALIZACIONESRepository;
    
}
