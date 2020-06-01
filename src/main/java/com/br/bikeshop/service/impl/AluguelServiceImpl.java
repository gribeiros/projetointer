package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Aluguel;
import com.br.bikeshop.repository.*;
import com.br.bikeshop.service.AluguelService;
import com.br.bikeshop.view.AluguelSaveAndUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AluguelServiceImpl implements AluguelService {

    @Autowired
    AluguelRepository aluguelRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    StatusRepository statusRepository;

    @Autowired
    MultaRepository multaRepository;

    @Autowired
    MetodoDePagamentoRepository metodoDePagamentoRepository;

    @Autowired
    BicicletaRepository bicicletaRepository;

    @Override
    public ResponseEntity returnAlugueis() {
        return new ResponseEntity(aluguelRepository.returnAll().stream().sorted((o1, o2) -> (int) (o1.getId() - o2.getId())), HttpStatus.OK);
    }

    @Override
    public ResponseEntity saveAluguel(AluguelSaveAndUpdate aluguelSaveAndUpdate) {
        Aluguel aluguel = new Aluguel(aluguelSaveAndUpdate.getTempo_inicio(), aluguelSaveAndUpdate.getTempo_final(), usuarioRepository.findById(aluguelSaveAndUpdate.getUsuario()).get(), statusRepository.findById(aluguelSaveAndUpdate.getStatus()).get(), multaRepository.findById(aluguelSaveAndUpdate.getMulta()).get(), metodoDePagamentoRepository.findById(aluguelSaveAndUpdate.getMetodoDePagamento()).get(), bicicletaRepository.findById(aluguelSaveAndUpdate.getBicicleta()).get());
        aluguelRepository.save(aluguel);
        return new ResponseEntity(aluguel, HttpStatus.OK);
    }

    @Override
    public ResponseEntity findAluguel(Long id) {
        Aluguel aluguel = aluguelRepository.returnById(id);
        if (aluguel != null) {
            return new ResponseEntity(aluguel, HttpStatus.OK);
        } else {
            return new ResponseEntity("Not Found!", HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity deleteBiciclieta(Long id) {
        aluguelRepository.deleteById(id);
        return new ResponseEntity("Deletado", HttpStatus.OK);
    }

    @Override
    public ResponseEntity updateAlguel(AluguelSaveAndUpdate aluguelSaveAndUpdate) {
        Aluguel aluguel = new Aluguel(aluguelSaveAndUpdate.getId(), aluguelSaveAndUpdate.getTempo_inicio(), aluguelSaveAndUpdate.getTempo_final(), usuarioRepository.findById(aluguelSaveAndUpdate.getUsuario()).get(), statusRepository.findById(aluguelSaveAndUpdate.getStatus()).get(), multaRepository.findById(aluguelSaveAndUpdate.getMulta()).get(), metodoDePagamentoRepository.findById(aluguelSaveAndUpdate.getMetodoDePagamento()).get(), bicicletaRepository.findById(aluguelSaveAndUpdate.getBicicleta()).get());
        aluguelRepository.saveAndFlush(aluguel);
        return new ResponseEntity("Atualizado", HttpStatus.OK);
    }

    @Override
    public ResponseEntity findByName(String name) {
        Aluguel aluguel = aluguelRepository.findByName(name);
        if (aluguel != null) {
            return new ResponseEntity(aluguel, HttpStatus.OK);
        } else {
            return new ResponseEntity("Not Found!", HttpStatus.BAD_REQUEST);
        }
    }
}
