package com.br.bikeshop.service;

import com.br.bikeshop.model.Modelo;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ModeloService {
    List<Modelo> returnModelos();

    ResponseEntity saveModelo(Modelo modelo);

    Optional<Modelo> findModelo(Long id);

    ResponseEntity deleteModelo(Long id);

    ResponseEntity updateModelo(Modelo modelo);
}
