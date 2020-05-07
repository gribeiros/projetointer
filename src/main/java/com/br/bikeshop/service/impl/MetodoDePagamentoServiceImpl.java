package com.br.bikeshop.service.impl;

import com.br.bikeshop.repository.MetodoDePagamentoRepository;
import com.br.bikeshop.service.MetodoDePagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetodoDePagamentoServiceImpl implements MetodoDePagamentoService {

    @Autowired
    MetodoDePagamentoRepository metodoDePagamentoRepository;
}
