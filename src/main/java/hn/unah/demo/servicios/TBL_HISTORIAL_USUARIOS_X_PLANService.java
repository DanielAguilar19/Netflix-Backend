package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.modelos.TBL_HISTORIAL_PAGOS;
import hn.unah.demo.modelos.TBL_HISTORIAL_USUARIOS_X_PLAN;
import hn.unah.demo.modelos.TBL_TIPO_ESTADO;
import hn.unah.demo.repositorios.TBL_HISTORIAL_USUARIOS_X_PLANRepository;
import hn.unah.demo.repositorios.TBL_TIPO_ESTADORepository;

@Service

public class TBL_HISTORIAL_USUARIOS_X_PLANService {

    @Autowired
    private TBL_HISTORIAL_USUARIOS_X_PLANRepository tbl_HISTORIALES_PAGORepository;

    @Autowired
    private TBL_TIPO_ESTADORepository tbl_TIPO_ESTADORepository;

    @Autowired
    private TBL_HISTORIAL_PAGOSService tbl_HISTORIAL_PAGOSService;

    // metodo para crear un nuevo registro de la seleccion de un plan de cuenta
    // netflix
    public TBL_HISTORIAL_USUARIOS_X_PLAN crearNvoRegistroDeAdquisicion(long codigoUsuario, long codigoTipoPlan,
            long codigoTarjeta, long codigoTipoPago) {

        // date fechaVencimineto =
        TBL_HISTORIAL_USUARIOS_X_PLAN nvoRegistro = new TBL_HISTORIAL_USUARIOS_X_PLAN();

        nvoRegistro.setCodigoUsuario(codigoUsuario);
        nvoRegistro.setCodigoPlan(codigoTipoPlan);
        // siempre al pagar un nuevo plan el estado inicial sera 1 luego cuando vensa se
        // editara a 0
        long codigoEstado = 1;
        TBL_TIPO_ESTADO objEstado = this.tbl_TIPO_ESTADORepository.findById(codigoEstado).get();
        nvoRegistro.setEstado(objEstado);

        this.tbl_HISTORIALES_PAGORepository.save((nvoRegistro));
        // inmediatamente despues de guardado plan , se debe registrar en la tabla de
        // historiales_pagos
        TBL_HISTORIAL_PAGOS generarNuevo = this.tbl_HISTORIAL_PAGOSService.registroNuevoPagoEfectuado(codigoTarjeta,
                codigoTipoPago, nvoRegistro.getCodigoRegistro());
        nvoRegistro.setHistorialPagos(generarNuevo);

        // metodo para tomar la fecha de inicio de cuando se guardo y de laguna manera
        // clacular la fecha dentro de un mes
        // if(<fechaactual><= fechavencimiento){codigoestado.set(0)} algo asi la logica
        // s

        return this.tbl_HISTORIALES_PAGORepository.save((nvoRegistro));

    }

}
