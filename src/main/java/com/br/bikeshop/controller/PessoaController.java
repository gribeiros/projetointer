package com.br.bikeshop.controller;

import com.br.bikeshop.model.Pessoa;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/pessoa")
@Api(value = "Api gerenciamento de Pessoas")
@CrossOrigin(value = "*")
public interface PessoaController {

    ResponseEntity findAll();

    ResponseEntity findById(@PathVariable Long id);

    ResponseEntity save(@RequestBody Pessoa pessoa);

    ResponseEntity update(@RequestBody Pessoa pessoa);

    ResponseEntity delete(@PathVariable Long id);

}
