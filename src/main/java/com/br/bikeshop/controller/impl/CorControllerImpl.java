package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.CorController;
import com.br.bikeshop.model.Cor;
import com.br.bikeshop.service.CorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class CorControllerImpl implements CorController {

    @Autowired
    private CorService corService;

    @Override
    public ResponseEntity cores() {

        return new ResponseEntity(corService.returnCores(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity cor(Long id) {
        Optional<Cor> cor = corService.findCor(id);
        return new ResponseEntity(cor, HttpStatus.OK);
    }

    @Override
    public ResponseEntity saveCor(Cor cor) {
        ResponseEntity responseEntity = corService.saveCor(cor);
        return responseEntity;
    }

    @Override
    public ResponseEntity deleteCor(Long id) {
        ResponseEntity responseEntity = corService.deleteCor(id);
        return responseEntity;
    }

    @Override
    public ResponseEntity updateCor(Cor cor) {
        ResponseEntity responseEntity = corService.updateCor(cor);
        return responseEntity;
    }
}
