package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.BikeController;
import com.br.bikeshop.model.Bicicleta;
import com.br.bikeshop.model.Marca;
import com.br.bikeshop.service.BikerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class BikeControllerImpl implements BikeController {
    @Autowired
    BikerService bikerService;

    @Override
    public ResponseEntity marcas() {

        List<Marca> marca = bikerService.retunMarca();

        return new ResponseEntity(marca, HttpStatus.OK);
    }

    @Override
    public ResponseEntity bicicletas() {
        List<Bicicleta> bicicletas = bikerService.returnBicicletas();

        return new ResponseEntity(bicicletas, HttpStatus.OK);
    }

    @Override
    public ResponseEntity bicicleta(Long id) {
        Optional<Bicicleta> bicicleta = bikerService.findBiciclieta(id);
        return new ResponseEntity(bicicleta, HttpStatus.OK);
    }

    @Override
    public ResponseEntity saveBicicletas(Bicicleta bicicleta) {
        Bicicleta bi = bikerService.saveBiciclieta(bicicleta);
        return new ResponseEntity(bi, HttpStatus.CREATED);
    }

}
