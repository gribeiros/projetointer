package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Cor;
import com.br.bikeshop.model.Pessoa;
import com.br.bikeshop.repository.PessoaRepository;
import com.br.bikeshop.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    @Override
    public List<Pessoa> returnPessoas() {
        return pessoaRepository.findAll();
    }

    @Override
    public ResponseEntity savePessoa(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        return new ResponseEntity(pessoa, HttpStatus.OK);
    }

    @Override
    public ResponseEntity findPessoa(Long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        if (pessoa != null) {
            return new ResponseEntity(pessoa, HttpStatus.OK);
        } else {
            return new ResponseEntity("Not Found!", HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity deletePessoa(Long id) {
        pessoaRepository.deleteById(id);

        return new ResponseEntity("Deletado!", HttpStatus.OK);
    }

    @Override
    public ResponseEntity updatePessoa(Pessoa pessoa) {
        pessoaRepository.saveAndFlush(pessoa);
        return new ResponseEntity(pessoa, HttpStatus.OK);
    }
}
