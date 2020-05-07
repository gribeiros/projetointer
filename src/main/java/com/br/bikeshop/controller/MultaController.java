package com.br.bikeshop.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping(path = "/multa")
@Api(value = "Api gerenciamento de Multas")
@CrossOrigin(value = "*")
public interface MultaController {

}
