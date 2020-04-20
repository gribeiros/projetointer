package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Bicicleta;
import com.br.bikeshop.repository.BicicletaRepository;
import com.br.bikeshop.service.BikeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class BikeServiceImpl implements BikeService {

    private static final Logger log = LoggerFactory.getLogger(BikeServiceImpl.class);

    @Autowired
    private BicicletaRepository bicicletaRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Bicicleta> returnBicicletas() {
        List<Bicicleta> bicicletas = bicicletaRepository.returnAll();
        return bicicletas;
    }

    @Override
    @Transactional
    public HttpStatus saveBiciclieta(Bicicleta bicicleta) {
        bicicletaRepository.save(bicicleta);

        if (bicicletaRepository.findById(bicicleta.getId()) == null) {
            return HttpStatus.I_AM_A_TEAPOT;
        }
        return HttpStatus.CREATED;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Bicicleta> findBiciclieta(Long id) {

        Optional<Bicicleta> bicicleta = bicicletaRepository.findById(id);

        return bicicleta;
    }

    @Override
    public ResponseEntity deleteBiciclieta(Long id) {

        if (bicicletaRepository.findById(id) == null) {
            return new ResponseEntity("Bicicleta não encontrada", HttpStatus.NOT_FOUND);
        } else {
            bicicletaRepository.deleteById(id);
        }
        return new ResponseEntity("Bicicleta deletada", HttpStatus.OK);
    }

    @Override
    public ResponseEntity updateBicicleta(Long id, Bicicleta bicicleta) {
        if (bicicletaRepository.findById(id) == null) {
            return new ResponseEntity("Bicicleta não existe", HttpStatus.NOT_FOUND);
        }
        bicicletaRepository.save(bicicleta);
        return new ResponseEntity("Bicicleta atualizada", HttpStatus.OK);
    }


}
