package com.br.bikeshop.service;

import com.br.bikeshop.model.Bicicleta;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface BikeService {

    List<Bicicleta> returnBicicletas();

    ResponseEntity saveBiciclieta(Long marca, Long cor, Long modelo);

    Optional<Bicicleta> findBiciclieta(Long id);

    ResponseEntity deleteBiciclieta(Long id);

    ResponseEntity updateBicicleta(Long id, Long marca, Long cor, Long modelo);

}
