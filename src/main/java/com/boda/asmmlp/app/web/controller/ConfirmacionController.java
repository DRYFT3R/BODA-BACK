package com.boda.asmmlp.app.web.controller;

import com.boda.asmmlp.app.service.ConfirmacionService;
import com.boda.asmmlp.app.web.model.ConfirmacionModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping
public class ConfirmacionController {

    private final ConfirmacionService service;

    @PostMapping("confirmacion")
    public ResponseEntity<?> post(@RequestBody ConfirmacionModel model) {
        service.confirmarAsistencia(model);
        return ResponseEntity.ok().build();
    }
}
