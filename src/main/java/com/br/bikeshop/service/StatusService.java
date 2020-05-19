package com.br.bikeshop.service;

import com.br.bikeshop.model.Status;
import org.springframework.http.ResponseEntity;

public interface StatusService {

    ResponseEntity returnAll();

    ResponseEntity findById(Long id);

    ResponseEntity deleteStatus(Long id);

    ResponseEntity updateStatus(Status status);

    ResponseEntity saveStatus(Status status);


}
