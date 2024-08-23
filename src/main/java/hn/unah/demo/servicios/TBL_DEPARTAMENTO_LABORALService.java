package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.unah.demo.repositorios.TBL_DEPARTAMENTO_LABORALRepository;


@Service

public class TBL_DEPARTAMENTO_LABORALService  {

    @Autowired
    private TBL_DEPARTAMENTO_LABORALRepository tbl_DEPARTAMENTO_LABORALRepository;
}
