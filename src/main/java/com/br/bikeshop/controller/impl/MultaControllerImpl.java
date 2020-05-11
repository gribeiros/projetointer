package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.MultaController;
import com.br.bikeshop.model.Multa;
import com.br.bikeshop.service.MultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.stream.Collectors;

@Controller
public class MultaControllerImpl implements MultaController {
    @Autowired
    MultaService multaService;

    @Override
    public ResponseEntity multas() {
        return new ResponseEntity(multaService.returnMultas().stream().sorted((o1, o2) -> (int) (o1.getId() - o2.getId())).collect(Collectors.toList()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity multa(Long id) {
        return new ResponseEntity(multaService.findMulta(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity saveMulta(Multa multa) {
        return multaService.saveMulta(multa);
    }

    @Override
    public ResponseEntity deleteMulta(Long id) {
        return multaService.deleteMulta(id);
    }

    @Override
    public ResponseEntity updateMulta(Multa multa) {
        return multaService.updateMulta(multa);
    }
}
