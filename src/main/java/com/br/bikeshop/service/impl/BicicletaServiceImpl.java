package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Bicicleta;
import com.br.bikeshop.repository.BicicletaRepository;
import com.br.bikeshop.repository.CorRepository;
import com.br.bikeshop.repository.MarcaRepository;
import com.br.bikeshop.repository.ModeloRepository;
import com.br.bikeshop.service.BicicletaService;
import com.br.bikeshop.view.BicicletaSaveAndUpdate;
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
public class BicicletaServiceImpl implements BicicletaService {

    private static final Logger log = LoggerFactory.getLogger(BicicletaServiceImpl.class);

    @Autowired
    private BicicletaRepository bicicletaRepository;

    @Autowired
    private MarcaRepository marcaRepository;

    @Autowired
    private CorRepository corRepository;

    @Autowired
    private ModeloRepository modeloRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Bicicleta> returnBicicletas() {
        List<Bicicleta> bicicletas = bicicletaRepository.returnAll();
        return bicicletas;
    }

    @Override
    @Transactional
    public ResponseEntity saveBiciclieta(Long marca, Long cor, Long modelo) {
        Bicicleta bicicleta = new Bicicleta(marcaRepository.findById(marca).get(), corRepository.findById(cor).get(), modeloRepository.findById(modelo).get());
        bicicletaRepository.save(bicicleta);
        return new ResponseEntity(bicicleta, HttpStatus.OK);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Bicicleta> findBiciclieta(Long id) {

        Optional<Bicicleta> bicicleta = bicicletaRepository.findById(id);

        return bicicleta;
    }

    @Override
    @Transactional
    public ResponseEntity deleteBiciclieta(Long id) {

        if (bicicletaRepository.findById(id) == null) {
            return new ResponseEntity("Bicicleta não encontrada", HttpStatus.NOT_FOUND);
        } else {
            bicicletaRepository.deleteById(id);
        }
        return new ResponseEntity("Bicicleta deletada", HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity updateBicicleta(BicicletaSaveAndUpdate bicicletaSaveAndUpdate) {
        Bicicleta bicicleta = new Bicicleta(marcaRepository.findById(bicicletaSaveAndUpdate.getMarca()).get(), corRepository.findById(bicicletaSaveAndUpdate.getCor()).get(), modeloRepository.findById(bicicletaSaveAndUpdate.getModelo()).get());
        bicicleta.setId(bicicletaSaveAndUpdate.getId());
        bicicletaRepository.save(bicicleta);
        return new ResponseEntity("Bicileta atualizada", HttpStatus.OK);
    }


}
