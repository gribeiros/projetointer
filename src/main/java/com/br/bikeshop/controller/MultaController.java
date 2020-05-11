package com.br.bikeshop.controller;

import com.br.bikeshop.model.Multa;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/multa")
@Api(value = "Api gerenciamento de Multas")
@CrossOrigin(value = "*")
public interface MultaController {
    @GetMapping(path = "")
    @ApiOperation(value = "Retorna uma lista de Multas")
    ResponseEntity multas();

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Retorna uma Multa por ID")
    ResponseEntity multa(@PathVariable Long id);

    @PostMapping(path = "")
    @ApiOperation(value = "Salva uma nova Multa")
    ResponseEntity saveMulta(@RequestBody Multa multa);

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta uma marca por ID")
    ResponseEntity deleteMulta(@PathVariable Long id);

    @PutMapping(path = "")
    @ApiOperation(value = "Atualiza uma marca por ID")
    ResponseEntity updateMulta(@RequestBody Multa multa);
}
