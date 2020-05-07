package com.br.bikeshop.service.impl;

import com.br.bikeshop.repository.AluguelRepository;
import com.br.bikeshop.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AluguelServiceImpl implements AluguelService {

    @Autowired
    AluguelRepository aluguelRepository;
}
