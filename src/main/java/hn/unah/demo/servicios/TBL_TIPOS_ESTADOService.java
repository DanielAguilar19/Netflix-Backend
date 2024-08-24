package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_TIPO_ESTADORepository;

@Service

public class TBL_TIPOS_ESTADOService {
    @Autowired
    private TBL_TIPO_ESTADORepository tbl_TIPO_ESTADORepository;


    //crear metodo que obtenga la decha que se adquiriio un plan y sumarle un mes que es lo que se suele cobrar
    //luegoverificar que la fecha actual no exeda la de vencimineto y si ka exede el esta pasaria de 1 (activo) a cero (0)

    
    
}
