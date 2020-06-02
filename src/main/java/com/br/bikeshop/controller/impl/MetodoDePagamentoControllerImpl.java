package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.MetodoDePagamentoController;
import com.br.bikeshop.model.MetodoDePagamento;
import com.br.bikeshop.service.MetodoDePagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.Optional;


@Controller
public class MetodoDePagamentoControllerImpl implements MetodoDePagamentoController {

    @Autowired
    MetodoDePagamentoService metodoDePagamentoService;

    @Override
    public ResponseEntity metodosDePagamentos() {
        return new ResponseEntity(metodoDePagamentoService.returnMetodosDePagamentos(), HttpStatus.OK);

    }

    @Override
    public ResponseEntity metodoDePagamento(Long id) {
        Optional<MetodoDePagamento> metodoDePagamento = metodoDePagamentoService.findMetodoDePagamento(id);
        return new ResponseEntity(metodoDePagamento, HttpStatus.OK);
    }

    @Override
    public ResponseEntity saveMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
        ResponseEntity responseEntity = metodoDePagamentoService.saveMetodoDePagamento(metodoDePagamento);
        return responseEntity;
    }

    @Override

    public ResponseEntity deleteMetodoDePagamento(Long id) {

        ResponseEntity responseEntity = metodoDePagamentoService.deleteMetodoDePagamento(id);
        return responseEntity;
    }

    @Override
    public ResponseEntity updateMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
        ResponseEntity responseEntity = metodoDePagamentoService.updateMetodoDePagamento(metodoDePagamento);

        return responseEntity;

    }
}
