package com.boda.asmmlp.app.service;

import com.boda.asmmlp.app.facade.ConfirmacionFacade;
import com.boda.asmmlp.app.web.model.ConfirmacionModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ConfirmacionService {

    private final ConfirmacionFacade facade;

    public void confirmarAsistencia(ConfirmacionModel mode) {

        var confirmacion = new com.boda.asmmlp.app.domain.entity.Confirmacion();
        confirmacion.setNombre(mode.getNombre());
        confirmacion.setConfirmado(mode.getConfirmacion());
        facade.guardar(confirmacion);

    }
}
