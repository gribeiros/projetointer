package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Status;
import com.br.bikeshop.repository.StatusRepository;
import com.br.bikeshop.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    StatusRepository statusRepository;

    @Override
    public ResponseEntity returnAll() {
        return new ResponseEntity(statusRepository.findAll().stream().sorted((o1, o2) -> (int) (o1.getId() - o2.getId())).collect(Collectors.toList()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity findById(Long id) {
        return new ResponseEntity(statusRepository.findById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity deleteStatus(Long id) {
        statusRepository.deleteById(id);
        return new ResponseEntity("Deletado", HttpStatus.OK);
    }

    @Override
    public ResponseEntity updateStatus(Status status) {
        statusRepository.saveAndFlush(status);
        return new ResponseEntity("Atualizado", HttpStatus.OK);
    }

    @Override
    public ResponseEntity saveStatus(Status status) {
        statusRepository.save(status);
        return new ResponseEntity(status, HttpStatus.OK);
    }


}
