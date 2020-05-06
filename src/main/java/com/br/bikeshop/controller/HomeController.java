package com.br.bikeshop.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping(path = "/")
@Api("Api gerenciamento de cores")
@CrossOrigin(value = "*")
public interface HomeController {

    @GetMapping(path = "")
    @ApiOperation(value = "Estatus do servidor.")
    ResponseEntity home();
}
