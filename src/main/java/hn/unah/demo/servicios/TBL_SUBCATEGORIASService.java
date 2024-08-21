package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_SUBCATEGORIASRepository;

@Service

public class TBL_SUBCATEGORIASService {

    @Autowired
    private TBL_SUBCATEGORIASRepository tbl_SUBCATEGORIASRepository;
    
}
