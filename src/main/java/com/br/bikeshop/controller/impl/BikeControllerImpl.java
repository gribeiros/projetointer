package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.BikeController;
import com.br.bikeshop.model.Marca;
import com.br.bikeshop.service.BikerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BikeControllerImpl implements BikeController {
    @Autowired
    BikerService bikerService;

    @Override
    public ResponseEntity home() {
        List<Marca> marca = bikerService.retunMarca();
        return new ResponseEntity(marca, HttpStatus.OK);
    }

}
