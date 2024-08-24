package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.modelos.TBL_USUARIOS_TARJETAS;
import hn.unah.demo.repositorios.TBL_USUARIOSRepository;
import hn.unah.demo.repositorios.TBL_USUARIOS_TARJETASRepository;

@Service

public class TBL_USUARIOS_TARJETASService {

    @Autowired
    private TBL_USUARIOS_TARJETASRepository tbl_USUARIOS_TARJETARepository;

    @Autowired
    private TBL_USUARIOSRepository tbl_USUARIOSRepository;

    // metodo para crear una nueva tarjeta
    public TBL_USUARIOS_TARJETAS guardarNuevaTarjetaAsiadaAUsuario(TBL_USUARIOS_TARJETAS nvaTarjeta,
            long codigoUsuario) {

        if (!this.tbl_USUARIOS_TARJETARepository.existsByNumeroTarjeta(nvaTarjeta.getNumeroTarjeta())) {

            if (nvaTarjeta != null) {

                nvaTarjeta.setUsuario(this.tbl_USUARIOSRepository.findById(codigoUsuario).get());
                return this.tbl_USUARIOS_TARJETARepository.save(nvaTarjeta);

            }

        }

        return null;
    }

}
