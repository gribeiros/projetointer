package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.MetodoDePagamentoController;
import com.br.bikeshop.model.MetodoDePagamento;
import com.br.bikeshop.service.MetodoDePagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class MetodoDePagamentoControllerImpl implements MetodoDePagamentoController {

    @Autowired
    MetodoDePagamentoService metodoDePagamentoService;

    @Override
    public ResponseEntity MmtodoDePagamentos() {
        List<MetodoDePagamento> metodoDePagamentos = metodoDePagamentoService.returnMetodosDePagamentos();
        return new ResponseEntity(metodoDePagamentos.stream().sorted((o1, o2) -> (int) (o1.getId() - o1.getId())).collect(Collectors.toList()), HttpStatus.OK);
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
        return null;
    }
}
