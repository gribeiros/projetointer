package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.BicicletaController;
import com.br.bikeshop.model.Bicicleta;
import com.br.bikeshop.service.BicicletaService;
import com.br.bikeshop.view.BicicletaSaveAndUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class BicicletaControllerImpl implements BicicletaController {

    @Autowired
    private BicicletaService bicicletaService;


    @Override
    public ResponseEntity bicicletas() {

        return new ResponseEntity(bicicletaService.returnBicicletas(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity bicicleta(Long id) {
        Optional<Bicicleta> bicicleta = bicicletaService.findBiciclieta(id);
        return new ResponseEntity(bicicleta, HttpStatus.OK);
    }

    @Override
    public ResponseEntity saveBicicleta(BicicletaSaveAndUpdate bicicletaSaveAndUpdate) {
        ResponseEntity responseEntity = bicicletaService.saveBiciclieta(bicicletaSaveAndUpdate.getMarca(), bicicletaSaveAndUpdate.getCor(), bicicletaSaveAndUpdate.getModelo());
        return responseEntity;
    }


    @Override
    public ResponseEntity deleteBicicleta(Long id) {
        ResponseEntity responseEntity = bicicletaService.deleteBiciclieta(id);
        return responseEntity;
    }

    @Override
    public ResponseEntity updateBicicleta(Long id, BicicletaSaveAndUpdate bicicletaSaveAndUpdate) {
        ResponseEntity responseEntity = bicicletaService.updateBicicleta(id, bicicletaSaveAndUpdate.getMarca(), bicicletaSaveAndUpdate.getCor(), bicicletaSaveAndUpdate.getModelo());
        return responseEntity;
    }


}
