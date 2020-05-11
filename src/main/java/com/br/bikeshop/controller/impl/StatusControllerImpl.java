package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.StatusController;
import com.br.bikeshop.model.Status;
import com.br.bikeshop.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class StatusControllerImpl implements StatusController {

    @Autowired
    StatusService statusService;

    @Override
    public ResponseEntity status() {
        return statusService.returnAll();
    }

    @Override
    public ResponseEntity statu(Long id) {
        return statusService.findById(id);
    }

    @Override
    public ResponseEntity saveStatu(Status status) {
        return statusService.saveStatus(status);
    }

    @Override
    public ResponseEntity deleteStatu(Long id) {
        return statusService.deleteStatus(id);
    }

    @Override
    public ResponseEntity updateStatu(Status status) {
        return statusService.updateStatus(status);
    }
}
