package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Modelo;
import com.br.bikeshop.repository.ModeloRepository;
import com.br.bikeshop.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloServiceImpl implements ModeloService {

    @Autowired
    private ModeloRepository modeloRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Modelo> returnModelos() {
        List<Modelo> modelos = modeloRepository.findAll();
        return modelos;
    }

    @Override
    @Transactional
    public ResponseEntity saveModelo(Modelo modelo) {
        modeloRepository.save(modelo);
        return new ResponseEntity(modelo, HttpStatus.OK);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Modelo> findModelo(Long id) {
        Optional<Modelo> modelo = modeloRepository.findById(id);
        return modelo;
    }

    @Override
    @Transactional
    public ResponseEntity deleteModelo(Long id) {
        modeloRepository.deleteById(id);
        return new ResponseEntity("Modelo deletado.", HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity updateModelo(Modelo modelo) {
        modeloRepository.save(modelo);
        return new ResponseEntity("Modelo atualizado", HttpStatus.OK);
    }
}
