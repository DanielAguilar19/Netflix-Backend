package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_DESCRIPCIONESRepository;

@Service

public class TBL_DESCRIPCIONESService {

    @Autowired 
    private TBL_DESCRIPCIONESRepository tbl_DESCRIPCIONESRepository;
    
}
