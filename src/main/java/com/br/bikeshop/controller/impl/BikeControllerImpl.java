package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.BikeController;
import com.br.bikeshop.model.Bicicleta;
import com.br.bikeshop.service.BikeService;
import com.br.bikeshop.util.BicicletaSaveAndUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class BikeControllerImpl implements BikeController {

    @Autowired
    private BikeService bikeService;


    @Override
    public ResponseEntity bicicletas() {

        return new ResponseEntity(bikeService.returnBicicletas(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity bicicleta(Long id) {
        Optional<Bicicleta> bicicleta = bikeService.findBiciclieta(id);
        return new ResponseEntity(bicicleta, HttpStatus.OK);
    }

    @Override
    public ResponseEntity saveBicicleta(BicicletaSaveAndUpdate bicicletaSaveAndUpdate) {
        ResponseEntity responseEntity = bikeService.saveBiciclieta(bicicletaSaveAndUpdate.getMarca(), bicicletaSaveAndUpdate.getCor(), bicicletaSaveAndUpdate.getModelo());
        return responseEntity;
    }


    @Override
    public ResponseEntity deleteBicicleta(Long id) {
        ResponseEntity responseEntity = bikeService.deleteBiciclieta(id);
        return responseEntity;
    }

    @Override
    public ResponseEntity updateBicicleta(Long id, BicicletaSaveAndUpdate bicicletaSaveAndUpdate) {
        ResponseEntity responseEntity = bikeService.updateBicicleta(id, bicicletaSaveAndUpdate.getMarca(), bicicletaSaveAndUpdate.getCor(), bicicletaSaveAndUpdate.getModelo());
        return responseEntity;
    }


}
