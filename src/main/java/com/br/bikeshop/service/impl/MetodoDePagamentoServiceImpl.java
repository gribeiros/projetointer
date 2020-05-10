package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.MetodoDePagamento;
import com.br.bikeshop.repository.MetodoDePagamentoRepository;
import com.br.bikeshop.service.MetodoDePagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MetodoDePagamentoServiceImpl implements MetodoDePagamentoService {

    @Autowired
    MetodoDePagamentoRepository metodoDePagamentoRepository;

    @Override
    public List<MetodoDePagamento> returnMetodoDePagamentos() {
        return metodoDePagamentoRepository.findAll().stream().sorted((o1, o2) -> (int) (o1.getId() - o2.getId())).collect(Collectors.toList());
    }

    @Override
    public ResponseEntity saveMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
        metodoDePagamentoRepository.save(metodoDePagamento);
        return new ResponseEntity(metodoDePagamento, HttpStatus.OK);
    }

    @Override
    public Optional<MetodoDePagamento> findMetodoDePagamento(Long id) {
        return metodoDePagamentoRepository.findById(id);
    }

    @Override
    public ResponseEntity deleteMetodoDePagamento(Long id) {
        metodoDePagamentoRepository.deleteById(id);
        return new ResponseEntity("Deletado", HttpStatus.OK);
    }

    @Override
    public ResponseEntity updateMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
        metodoDePagamentoRepository.saveAndFlush(metodoDePagamento);
        return new ResponseEntity("Atualizado", HttpStatus.OK);
    }
}
