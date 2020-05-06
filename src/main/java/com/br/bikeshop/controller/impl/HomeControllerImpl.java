package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.HomeController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class HomeControllerImpl implements HomeController {

    @Override
    public ResponseEntity home() {
        return new ResponseEntity("Servidor on!", HttpStatus.OK);
    }
}
