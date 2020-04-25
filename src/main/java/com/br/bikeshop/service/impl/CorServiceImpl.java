package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Cor;
import com.br.bikeshop.repository.CorRepository;
import com.br.bikeshop.service.CorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CorServiceImpl implements CorService {

    @Autowired
    private CorRepository corRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cor> returnCores() {
        List<Cor> cores = corRepository.findAll();
        return cores;
    }

    @Override
    @Transactional
    public ResponseEntity saveCor(Cor cor) {
        corRepository.save(cor);
        return new ResponseEntity(cor, HttpStatus.OK);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Cor> findCor(Long id) {
        Optional<Cor> cor = corRepository.findById(id);
        return cor;
    }

    @Override
    @Transactional
    public ResponseEntity deleteCor(Long id) {
        corRepository.deleteById(id);
        return new ResponseEntity("Cor deletada",HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity updateCor(Cor cor) {
        corRepository.save(cor);
        return new ResponseEntity("Cor atualizada",HttpStatus.OK);
    }
}
