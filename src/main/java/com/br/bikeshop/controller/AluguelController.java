package com.br.bikeshop.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping(path = "/aluguel")
@Api(value = "Api gerenciamento de alugueis")
@CrossOrigin(value = "*")
public interface AluguelController {

}
