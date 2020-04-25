package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Marca;
import com.br.bikeshop.repository.MarcaRepository;
import com.br.bikeshop.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Marca> returnMarcas() {
        List<Marca> marcas = marcaRepository.findAll();

        return marcas;
    }

    @Override
    @Transactional
    public ResponseEntity saveMarca(Marca marca) {
        marcaRepository.save(marca);
        return new ResponseEntity(marca, HttpStatus.OK);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Marca> findMarca(Long id) {
        Optional<Marca> marca = marcaRepository.findById(id);
        return marca;
    }

    @Override
    @Transactional
    public ResponseEntity deleteMarca(Long id) {
        marcaRepository.deleteById(id);
        return new ResponseEntity("Marca deletada", HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity updateMarca(Marca marca) {
        marcaRepository.save(marca);
        return new ResponseEntity("Marca Atualizada", HttpStatus.OK);
    }
}
