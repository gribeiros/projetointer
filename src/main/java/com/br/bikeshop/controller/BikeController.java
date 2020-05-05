package com.br.bikeshop.controller;

import com.br.bikeshop.view.BicicletaSaveAndUpdate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/bicicleta")
@Api(value = "Api gerenciamento de bicicletas")
@CrossOrigin(value = "*")
public interface BikeController {

    @GetMapping(path = "")
    @ApiOperation(value = "Retorna uma lista de bicicletas")
    ResponseEntity bicicletas();

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Retorna uma bicicleta por ID")
    ResponseEntity bicicleta(@PathVariable Long id);

    @PostMapping(path = "")
    @ApiOperation(value = "Salva uma nova bicicleta")
    ResponseEntity saveBicicleta(@RequestBody BicicletaSaveAndUpdate bicicletaSaveAndUpdate);

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta uma bicicleta por ID")
    ResponseEntity deleteBicicleta(@PathVariable Long id);

    @PutMapping(path = "/{id}")
    @ApiOperation(value = "Atualiza um bicicleta por ID")
    ResponseEntity updateBicicleta(@PathVariable Long id, @RequestBody BicicletaSaveAndUpdate bicicletaSaveAndUpdate);
}
