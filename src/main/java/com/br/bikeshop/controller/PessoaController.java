package com.br.bikeshop.controller;

import com.br.bikeshop.model.Pessoa;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/pessoa")
@Api(value = "Api gerenciamento de Pessoas")
@CrossOrigin(value = "*")
public interface PessoaController {
    @ApiOperation(value = "Retorna uma lista de pessoas")
    ResponseEntity findAll();

    @ApiOperation(value = "Procura uma pessoa pelo id")
    ResponseEntity findById(@PathVariable Long id);

    @ApiOperation(value = "Salva uma pessoa nova")
    ResponseEntity save(@RequestBody Pessoa pessoa);

    @ApiOperation(value = "Atualiza uma pessoa")
    ResponseEntity update(@RequestBody Pessoa pessoa);

    @ApiOperation(value = "Deleta uma pessoa pelo id")
    ResponseEntity delete(@PathVariable Long id);

}
