package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_PERMISOS_X_ROLLESRepository;

@Service

public class TBL_PERMISOS_X_ROLLESService {

    @Autowired
    private TBL_PERMISOS_X_ROLLESRepository tbl_ROLES_PERMISOSRepository;
    
}
