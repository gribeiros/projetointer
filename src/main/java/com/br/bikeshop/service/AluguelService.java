package com.br.bikeshop.service;

import com.br.bikeshop.view.AluguelSaveAndUpdate;
import org.springframework.http.ResponseEntity;

public interface AluguelService {

    ResponseEntity returnAlugueis();

    ResponseEntity saveAluguel(AluguelSaveAndUpdate aluguelSaveAndUpdate);

    ResponseEntity findAluguel(Long id);

    ResponseEntity deleteBiciclieta(Long id);

    ResponseEntity updateAlguel(AluguelSaveAndUpdate aluguelSaveAndUpdate);

    ResponseEntity findByName(String name);

}
