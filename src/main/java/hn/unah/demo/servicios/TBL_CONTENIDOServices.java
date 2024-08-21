package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTENIDORepository;

@Service

public class TBL_CONTENIDOServices {
        @Autowired

        private TBL_CONTENIDORepository tblContenidoRepository;
    
}