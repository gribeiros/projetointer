package com.br.bikeshop.service;

import com.br.bikeshop.model.MetodoDePagamento;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface MetodoDePagamentoService {

    List<MetodoDePagamento> returnMetodoDePagamentos();

    ResponseEntity saveMetodoDePagamento(MetodoDePagamento metodoDePagamento);

    Optional<MetodoDePagamento> findMetodoDePagamento(Long id);

    ResponseEntity deleteMetodoDePagamento(Long id);

    ResponseEntity updateMetodoDePagamento(MetodoDePagamento metodoDePagamento);
}
