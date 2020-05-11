package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.ModeloController;
import com.br.bikeshop.model.Modelo;
import com.br.bikeshop.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class ModeloControllerImpl implements ModeloController {

    @Autowired
    private ModeloService modeloService;


    @Override
    public ResponseEntity modelos() {
        List<Modelo> modelos = modeloService.returnModelos();
        return new ResponseEntity(modelos.stream().sorted((o1, o2) -> (int) (o1.getId() - o1.getId())), HttpStatus.OK);
    }

    @Override
    public ResponseEntity modelo(Long id) {
        Optional<Modelo> modelo = modeloService.findModelo(id);
        return new ResponseEntity(modelo, HttpStatus.OK);
    }

    @Override
    public ResponseEntity saveModelo(Modelo modelo) {
        ResponseEntity responseEntity = modeloService.saveModelo(modelo);
        return responseEntity;
    }

    @Override
    public ResponseEntity deleteModelo(Long id) {
        ResponseEntity responseEntity = modeloService.deleteModelo(id);
        return responseEntity;
    }

    @Override
    public ResponseEntity updateModelo(Modelo modelo) {
        ResponseEntity responseEntity = modeloService.updateModelo(modelo);
        return responseEntity;
    }
}
