package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.PessoaController;
import com.br.bikeshop.model.Pessoa;
import com.br.bikeshop.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PessoaControllerImpl implements PessoaController {

    @Autowired
    PessoaService pessoaService;


    @Override
    public ResponseEntity findAll() {
        return new ResponseEntity(pessoaService.returnPessoas(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity findById(Long id) {
        return pessoaService.findPessoa(id);
    }

    @Override
    public ResponseEntity save(Pessoa pessoa) {
        return pessoaService.savePessoa(pessoa);
    }

    @Override
    public ResponseEntity update(Pessoa pessoa) {
        return pessoaService.updatePessoa(pessoa);
    }

    @Override
    public ResponseEntity delete(Long id) {
        return pessoaService.deletePessoa(id);
    }
}
