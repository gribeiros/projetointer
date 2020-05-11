package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.MultaController;
import com.br.bikeshop.model.Multa;
import com.br.bikeshop.service.MultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class MultaControllerImpl implements MultaController {
    @Autowired
    MultaService multaService;

    @Override
    public ResponseEntity multas() {
        return null;
    }

    @Override
    public ResponseEntity multa(Long id) {
        return null;
    }

    @Override
    public ResponseEntity saveMulta(Multa multa) {
        return null;
    }

    @Override
    public ResponseEntity deleteMulta(Long id) {
        return null;
    }

    @Override
    public ResponseEntity updateMulta(Multa multa) {
        return null;
    }
}
