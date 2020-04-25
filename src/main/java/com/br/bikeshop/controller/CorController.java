package com.br.bikeshop.controller;

import com.br.bikeshop.model.Cor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/cor")
public interface CorController {

    @GetMapping(path = "")
    ResponseEntity cores();

    @GetMapping(path = "/{id}")
    ResponseEntity cor(@PathVariable Long id);

    @PostMapping(path = "")
    ResponseEntity saveCor(@RequestBody Cor cor);

    @DeleteMapping(path = "/{id}")
    ResponseEntity deleteCor(@PathVariable Long id);

    @PutMapping(path = "")
    ResponseEntity updateCor(@RequestBody Cor cor);
}
