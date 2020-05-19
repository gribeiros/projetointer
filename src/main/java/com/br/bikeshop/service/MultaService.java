package com.br.bikeshop.service;

import com.br.bikeshop.model.Modelo;
import com.br.bikeshop.model.Multa;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface MultaService {

    List<Multa> returnMultas();

    ResponseEntity saveMulta(Multa multa);

    Optional<Multa> findMulta(Long id);

    ResponseEntity deleteMulta(Long id);

    ResponseEntity updateMulta(Multa multa);
}
