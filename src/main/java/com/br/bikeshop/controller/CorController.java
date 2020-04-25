package com.br.bikeshop.controller;

import com.br.bikeshop.model.Cor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/cor")
@Api("Api gerenciamento de cores")
@CrossOrigin(value = "*")
public interface CorController {

    @GetMapping(path = "")
    @ApiOperation(value = "Retorna uma lista de cores")
    ResponseEntity cores();

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Retorna uma cor por ID")
    ResponseEntity cor(@PathVariable Long id);

    @PostMapping(path = "")
    @ApiOperation(value = "Salva uma nova cor")
    ResponseEntity saveCor(@RequestBody Cor cor);

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta uma cor por ID")
    ResponseEntity deleteCor(@PathVariable Long id);

    @PutMapping(path = "")
    @ApiOperation(value = "Atualiza uma cor por ID")
    ResponseEntity updateCor(@RequestBody Cor cor);
}
