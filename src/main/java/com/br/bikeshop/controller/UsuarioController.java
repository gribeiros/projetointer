package com.br.bikeshop.controller;

import com.br.bikeshop.view.UsuarioSaveAndUpdate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/usuario")
@Api(value = "Api gerenciamento de Usuários")
@CrossOrigin(value = "*")
public interface UsuarioController {

    @GetMapping(path = "")
    @ApiOperation(value = "Retorna uma lista de usuários")
    ResponseEntity modelos();

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Retorna um usuário por ID")
    ResponseEntity modelo(@PathVariable Long id);

    @PostMapping(path = "")
    @ApiOperation(value = "Salva um novo usuário")
    ResponseEntity saveModelo(@RequestBody UsuarioSaveAndUpdate usuarioSaveAndUpdate);

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta usuário por ID")
    ResponseEntity deleteModelo(@PathVariable Long id);

    @PutMapping(path = "")
    @ApiOperation(value = "Atualiza um usuário por ID")
    ResponseEntity updateModelo(@RequestBody UsuarioSaveAndUpdate usuarioSaveAndUpdate);

}
