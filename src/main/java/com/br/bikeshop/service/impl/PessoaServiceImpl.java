package com.br.bikeshop.service.impl;

import com.br.bikeshop.repository.PessoaRepository;
import com.br.bikeshop.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

}
