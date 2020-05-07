package com.br.bikeshop.controller;

import com.br.bikeshop.view.BicicletaSaveAndUpdate;
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
    @ApiOperation(value = "Retorna uma lista de bicicletas")
    ResponseEntity alugueis();

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Retorna uma bicicleta por ID")
    ResponseEntity aluguel(@PathVariable Long id);

    @PostMapping(path = "")
    @ApiOperation(value = "Salva uma nova bicicleta")
    ResponseEntity saveAluguel(@RequestBody BicicletaSaveAndUpdate bicicletaSaveAndUpdate);

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta uma bicicleta por ID")
    ResponseEntity deleteAluguel(@PathVariable Long id);

    @PutMapping(path = "/{id}")
    @ApiOperation(value = "Atualiza um bicicleta por ID")
    ResponseEntity updateAluguel(@PathVariable Long id, @RequestBody BicicletaSaveAndUpdate bicicletaSaveAndUpdate);

}
