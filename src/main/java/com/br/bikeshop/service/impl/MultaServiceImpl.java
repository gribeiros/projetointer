package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Modelo;
import com.br.bikeshop.model.Multa;
import com.br.bikeshop.repository.MultaRepository;
import com.br.bikeshop.service.MultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultaServiceImpl implements MultaService {

    @Autowired
    MultaRepository multaRepository;

    @Override
    public List<Multa> returnMultas() {
        return multaRepository.findAll();
    }

    @Override
    public ResponseEntity saveMulta(Multa multa) {
        return new ResponseEntity(multaRepository.save(multa), HttpStatus.OK);
    }

    @Override
    public Optional<Multa> findMulta(Long id) {
        return multaRepository.findById(id);
    }

    @Override
    public ResponseEntity deleteMulta(Long id) {
        multaRepository.deleteById(id);
        return new ResponseEntity("Deletado", HttpStatus.OK);
    }

    @Override
    public ResponseEntity updateMulta(Multa multa) {
        multaRepository.saveAndFlush(multa);
        return new ResponseEntity("Atualizado", HttpStatus.OK);
    }
}
