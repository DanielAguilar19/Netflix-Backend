package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_PERFILESRepository;

@Service

public class TBL_PERFILEService {

    @Autowired TBL_PERFILESRepository tbl_PERFILESRepository;
    
}
