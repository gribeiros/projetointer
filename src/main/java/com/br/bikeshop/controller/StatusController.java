package com.br.bikeshop.controller;

import com.br.bikeshop.model.Modelo;
import com.br.bikeshop.model.Status;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/status")
@Api(value = "Api gerenciamento de Status")
@CrossOrigin(value = "*")
public interface StatusController {

    @GetMapping(path = "")
    @ApiOperation(value = "Retorna uma lista de Status")
    ResponseEntity status();

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Retorna um Status por ID")
    ResponseEntity statu(@PathVariable Long id);

    @PostMapping(path = "")
    @ApiOperation(value = "Salva um novo Status")
    ResponseEntity saveStatu(@RequestBody Status status);

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta Status por ID")
    ResponseEntity deleteStatu(@PathVariable Long id);

    @PutMapping(path = "")
    @ApiOperation(value = "Atualiza um Status por ID")
    ResponseEntity updateStatu(@RequestBody Status status);
}
