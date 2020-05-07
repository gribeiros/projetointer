package com.br.bikeshop.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping(path = "/metodoDePagamento")
@Api(value = "Api gerenciamento de Metodos de Pagamentos")
@CrossOrigin(value = "*")
public interface MetodoDePagamentoController {

}
