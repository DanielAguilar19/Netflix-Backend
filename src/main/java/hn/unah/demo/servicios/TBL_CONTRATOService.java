package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTRATOSRepository;

@Service

public class TBL_CONTRATOService {

    @Autowired
    private TBL_CONTRATOSRepository tbl_CONTRATOSRepository;
    
}
