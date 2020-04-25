package com.br.bikeshop.controller;

import com.br.bikeshop.model.Modelo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/modelo")
public interface ModeloController {

    @GetMapping(path = "")
    ResponseEntity modelos();

    @GetMapping(path = "/{id}")
    ResponseEntity modelo(@PathVariable Long id);

    @PostMapping(path = "")
    ResponseEntity saveModelo(@RequestBody Modelo modelo);

    @DeleteMapping(path = "/{id}")
    ResponseEntity deleteModelo(@PathVariable Long id);

    @PutMapping(path = "")
    ResponseEntity updateModelo(@RequestBody Modelo modelo);
}
