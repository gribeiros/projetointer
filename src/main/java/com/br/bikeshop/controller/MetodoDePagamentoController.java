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
    @ApiOperation(value = "Retorna uma lista dod metodos de pagamento")
    ResponseEntity metodosDePagamentos();

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Retorna o metodo de pagamento por id")
    ResponseEntity metodoDePagamento(@PathVariable Long id);

    @PostMapping(path = "")
    @ApiOperation(value = "Salva um novo metodo de pagamento")
    ResponseEntity saveMetodoDePagamento(@RequestBody MetodoDePagamento metodoDePagamento);

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta metodo de pagamento por id")
    ResponseEntity deleteMarca(@PathVariable Long id);

    @PutMapping(path = "")
    @ApiOperation(value = "Atualiza metodo de pagamento por ID")
    ResponseEntity updateMetodoDePagamento(@RequestBody MetodoDePagamento metodoDePagamento);

}
