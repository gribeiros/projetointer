package com.br.bikeshop.controller;

import com.br.bikeshop.model.Bicicleta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/")
public interface BikeController {

    @GetMapping(path = "/bicicletas")
    ResponseEntity bicicletas();

    @GetMapping(path = "/bicicleta/{id}")
    ResponseEntity bicicleta(@PathVariable Long id);

    @PostMapping(path = "/bicicleta")
    ResponseEntity saveBicicleta(@RequestBody Bicicleta bicicleta);

    @DeleteMapping(path = "/bicicleta/{id}")
    ResponseEntity deleteBicicleta(@PathVariable Long id);

    @PutMapping(path = "bicicleta")
    ResponseEntity updateBicicleta(@RequestBody Bicicleta bicicleta);
}
