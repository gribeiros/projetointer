package com.br.bikeshop.service;

import com.br.bikeshop.model.Bicicleta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface BikeService {

    List<Bicicleta> returnBicicletas();

    HttpStatus saveBiciclieta(Bicicleta bicicleta);

    Optional<Bicicleta> findBiciclieta(Long id);

    ResponseEntity deleteBiciclieta(Long id);

    ResponseEntity updateBicicleta(Long id,Bicicleta bicicleta);

}
