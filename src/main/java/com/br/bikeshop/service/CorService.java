package com.br.bikeshop.service;

import com.br.bikeshop.model.Cor;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CorService {
    List<Cor> returnCores();

    ResponseEntity saveCor(Cor cor);

    Optional<Cor> findCor(Long id);

    ResponseEntity deleteCor(Long id);

    ResponseEntity updateCor(Cor cor);
}
