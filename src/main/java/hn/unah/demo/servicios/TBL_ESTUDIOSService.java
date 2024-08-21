package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_ESTUDIOSRepository;

@Service

public class TBL_ESTUDIOSService {

    @Autowired

    private TBL_ESTUDIOSRepository tbl_ESTUDIOSRepository;
    
}
