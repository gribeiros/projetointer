package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Bicicleta;
import com.br.bikeshop.model.Marca;
import com.br.bikeshop.repository.BicicletaRepository;
import com.br.bikeshop.repository.MarcaRepository;
import com.br.bikeshop.service.BikerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class BikeServiceImpl implements BikerService {

    @Autowired
    MarcaRepository marcaRepository;

    @Autowired
    BicicletaRepository bicicletaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Marca> retunMarca() {
        List<Marca> marca = marcaRepository.findAll();
        return marca;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Bicicleta> returnBicicletas() {
        List<Bicicleta> bicicletas = bicicletaRepository.findAll();

        return bicicletas;
    }

    @Override
    @Transactional
    public Bicicleta saveBiciclieta(Bicicleta bicicleta) {

        bicicletaRepository.saveAndFlush(bicicleta);
        return bicicleta;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Bicicleta> findBiciclieta(Long id) {

        Optional<Bicicleta> bicicleta = bicicletaRepository.findById(id);

        return bicicleta;
    }


}
