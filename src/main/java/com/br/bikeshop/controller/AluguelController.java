package com.br.bikeshop.controller;

import com.br.bikeshop.view.AluguelSaveAndUpdate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/aluguel")
@Api(value = "Api gerenciamento de alugueis")
@CrossOrigin(value = "*")
public interface AluguelController {

    @GetMapping(path = "")
    @ApiOperation(value = "Retorna uma lista de alugueis")
    ResponseEntity alugueis();

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Retorna uma aluguel por ID")
    ResponseEntity aluguel(@PathVariable Long id);

    @PostMapping(path = "")
    @ApiOperation(value = "Salva uma nova aluguel")
    ResponseEntity saveAluguel(@RequestBody AluguelSaveAndUpdate aluguelSaveAndUpdate);

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta uma aluguel por ID")
    ResponseEntity deleteAluguel(@PathVariable Long id);

    @PutMapping(path = "/{id}")
    @ApiOperation(value = "Atualiza um aluguel por ID")
    ResponseEntity updateAluguel(@RequestBody AluguelSaveAndUpdate aluguelSaveAndUpdate);


}
