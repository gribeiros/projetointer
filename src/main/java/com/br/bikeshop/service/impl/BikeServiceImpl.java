package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Bicicleta;
import com.br.bikeshop.model.Marca;
import com.br.bikeshop.repository.BicicletaRepository;
import com.br.bikeshop.repository.MarcaRepository;
import com.br.bikeshop.service.BikerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class BikeServiceImpl implements BikerService {

    private static final Logger log = LoggerFactory.getLogger(BikeServiceImpl.class);

    @Autowired
    private MarcaRepository marcaRepository;

    @Autowired
    private BicicletaRepository bicicletaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Marca> retunMarca() {
        return marcaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Bicicleta> returnBicicletas() {
        List<Bicicleta> bicicletas = bicicletaRepository.returnAll();

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
