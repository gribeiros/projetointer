package com.br.bikeshop.controller;

import com.br.bikeshop.model.Marca;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/marca")
@Api(value = "Api gerenciamento de marcas")
@CrossOrigin(value = "*")
public interface MarcaController {

    @GetMapping(path = "")
    @ApiOperation(value = "Retorna uma lista de marcas")
    ResponseEntity marcas();

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Retorna uma marca por ID")
    ResponseEntity marca(@PathVariable Long id);

    @PostMapping(path = "")
    @ApiOperation(value = "Salava uma nova marca")
    ResponseEntity saveMarca(@RequestBody Marca marca);

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta uma marca por ID")
    ResponseEntity deleteMarca(@PathVariable Long id);

    @PutMapping(path = "")
    @ApiOperation(value = "Atualiza uma marca por ID")
    ResponseEntity updateMarca(@RequestBody Marca marca);
}
