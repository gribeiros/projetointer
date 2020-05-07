package com.br.bikeshop.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping(path = "/pessoa")
@Api(value = "Api gerenciamento de Pessoas")
@CrossOrigin(value = "*")
public interface PessoaController {

}
