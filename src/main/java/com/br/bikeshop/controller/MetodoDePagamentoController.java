package com.br.bikeshop.controller;

import com.br.bikeshop.model.MetodoDePagamento;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/metodoDePagamento")
@Api(value = "Api gerenciamento de Metodos de Pagamentos")
@CrossOrigin(value = "*")
public interface MetodoDePagamentoController {


    @GetMapping(path = "")
    @ApiOperation(value = "Retorna uma lista de Metodo De Pagamentos")
    ResponseEntity MmtodoDePagamentos();

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Retorna uma Metodo De Pagamento por ID")
    ResponseEntity metodoDePagamento(@PathVariable Long id);

    @PostMapping(path = "")
    @ApiOperation(value = "Salva um novo Metodo De Pagamento")
    ResponseEntity saveMetodoDePagamento(@RequestBody MetodoDePagamento metodoDePagamento);

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta um Metodo De Pagamento por ID")
    ResponseEntity deleteMetodoDePagamento(@PathVariable Long id);

    @PutMapping(path = "")
    @ApiOperation(value = "Atualiza um Metodo De Pagamento por ID")
    ResponseEntity updateMetodoDePagamento(@RequestBody MetodoDePagamento metodoDePagamento);

}
