package com.br.bikeshop.service;

import com.br.bikeshop.model.Pessoa;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PessoaService {

    List<Pessoa> returnPessoas();

    ResponseEntity savePessoa(Pessoa pessoa);

    ResponseEntity findPessoa(Long id);

    ResponseEntity deletePessoa(Long id);

    ResponseEntity updatePessoa(Pessoa pessoa);

    ResponseEntity findByName(String cpf);

}
