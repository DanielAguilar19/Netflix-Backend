package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CATEGORIASRepository;

@Service

public class TBL_CATEGORIASService {

    @Autowired

    private TBL_CATEGORIASRepository tbl_CATEGORIASRepository;
    
}
