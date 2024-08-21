package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_USUARIOSRepository;

@Service
public class TBL_USARIOSServices {

    @Autowired
    private TBL_USUARIOSRepository TBL_SYSTEM_USUARIOSRepository;
}
