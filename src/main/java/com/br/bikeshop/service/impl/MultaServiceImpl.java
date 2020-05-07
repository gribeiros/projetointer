package com.br.bikeshop.service.impl;

import com.br.bikeshop.repository.MultaRepository;
import com.br.bikeshop.service.MultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultaServiceImpl implements MultaService {

    @Autowired
    MultaRepository multaRepository;
}
