package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_EPISODIORepository;

@Service

public class TBL_EPISODIOService {

    @Autowired
    private TBL_EPISODIORepository tbl_EPISODIORepository;
    
}
