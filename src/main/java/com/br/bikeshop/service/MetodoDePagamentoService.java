package com.br.bikeshop.service;

import com.br.bikeshop.model.MetodoDePagamento;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface MetodoDePagamentoService {

<<<<<<< HEAD
    List<MetodoDePagamento> returnMetodosDePagamentos();
=======
    List<MetodoDePagamento> returnMetodoDePagamentos();
>>>>>>> d1c752dd58611b8e8156c656067100007a34251c

    ResponseEntity saveMetodoDePagamento(MetodoDePagamento metodoDePagamento);

    Optional<MetodoDePagamento> findMetodoDePagamento(Long id);

    ResponseEntity deleteMetodoDePagamento(Long id);

    ResponseEntity updateMetodoDePagamento(MetodoDePagamento metodoDePagamento);
<<<<<<< HEAD

=======
>>>>>>> d1c752dd58611b8e8156c656067100007a34251c
}
