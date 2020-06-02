package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.MetodoDePagamento;
import com.br.bikeshop.repository.MetodoDePagamentoRepository;
import com.br.bikeshop.service.MetodoDePagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MetodoDePagamentoServiceImpl implements MetodoDePagamentoService {

    @Autowired
    MetodoDePagamentoRepository metodoDePagamentoRepository;



    @Override
    @Transactional
    public List<MetodoDePagamento> returnMetodosDePagamentos() {
        return metodoDePagamentoRepository.findAll();
    }

    @Override
    @Transactional
    public ResponseEntity saveMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
        metodoDePagamentoRepository.save(metodoDePagamento);
        return new ResponseEntity(metodoDePagamento, HttpStatus.OK);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<MetodoDePagamento> findMetodoDePagamento(Long id) {
        Optional<MetodoDePagamento> metodoDePagamento = metodoDePagamentoRepository.findById(id);
        return metodoDePagamento;
    }

    @Override
    @Transactional
    public ResponseEntity deleteMetodoDePagamento(Long id) {
        metodoDePagamentoRepository.deleteById(id);
        return new ResponseEntity("Metodo de pagamento deletado", HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity updateMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
        metodoDePagamentoRepository.save(metodoDePagamento);
        return new ResponseEntity("Metodo de pagamento Atualizado", HttpStatus.OK);
    }

}
