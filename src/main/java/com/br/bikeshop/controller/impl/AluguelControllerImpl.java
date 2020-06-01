package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.AluguelController;
import com.br.bikeshop.service.AluguelService;
import com.br.bikeshop.view.AluguelSaveAndUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class AluguelControllerImpl implements AluguelController {

    @Autowired
    AluguelService aluguelService;

    @Override
    public ResponseEntity alugueis() {
        return aluguelService.returnAlugueis();
    }

    @Override
    public ResponseEntity aluguel(Long id) {
        return aluguelService.findAluguel(id);
    }

    @Override
    public ResponseEntity aluguelFindByName(String name) {
        return aluguelService.findByName(name);
    }

    @Override
    public ResponseEntity saveAluguel(AluguelSaveAndUpdate aluguelSaveAndUpdate) {
        return aluguelService.saveAluguel(aluguelSaveAndUpdate);
    }

    @Override
    public ResponseEntity deleteAluguel(Long id) {
        return aluguelService.deleteBiciclieta(id);
    }

    @Override
    public ResponseEntity updateAluguel(AluguelSaveAndUpdate aluguelSaveAndUpdate) {
        return aluguelService.updateAlguel(aluguelSaveAndUpdate);
    }
}
