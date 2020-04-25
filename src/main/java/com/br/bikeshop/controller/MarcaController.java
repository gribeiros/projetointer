package com.br.bikeshop.controller;

import com.br.bikeshop.model.Marca;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/marca")
public interface MarcaController {

    @GetMapping(path = "")
    ResponseEntity marcas();

    @GetMapping(path = "/{id}")
    ResponseEntity marca(@PathVariable Long id);

    @PostMapping(path = "")
    ResponseEntity saveMarca(@RequestBody Marca marca);

    @DeleteMapping(path = "/{id}")
    ResponseEntity deleteMarca(@PathVariable Long id);

    @PutMapping(path = "")
    ResponseEntity updateMarca(@RequestBody Marca marca);
}
