package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Marca;
import com.br.bikeshop.repository.MarcaRepository;
import com.br.bikeshop.service.BikerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class BikeServiceImpl implements BikerService {

    @Autowired
    MarcaRepository marcaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Marca> retunMarca() {
        List<Marca> marca = marcaRepository.findAll();
        return marca;
    }

}
