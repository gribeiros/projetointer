package com.br.bikeshop.controller;

import com.br.bikeshop.model.Modelo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/modelo")
@Api(value = "Api gerenciamento de modelos")
@CrossOrigin(value = "*")
public interface ModeloController {

    @GetMapping(path = "")
    @ApiOperation(value = "Retorna uma lista de modelos")
    ResponseEntity modelos();

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Retorna um modelo por ID")
    ResponseEntity modelo(@PathVariable Long id);

    @PostMapping(path = "")
    @ApiOperation(value = "Salva um novo modelo")
    ResponseEntity saveModelo(@RequestBody Modelo modelo);

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta modelo por ID")
    ResponseEntity deleteModelo(@PathVariable Long id);

    @PutMapping(path = "")
    @ApiOperation(value = "Atualiza um modelo por ID")
    ResponseEntity updateModelo(@RequestBody Modelo modelo);
}
