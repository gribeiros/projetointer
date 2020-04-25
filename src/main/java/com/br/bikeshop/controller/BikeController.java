package com.br.bikeshop.controller;

import com.br.bikeshop.util.BicicletaSaveAndUpdate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path = "/bicicleta")
public interface BikeController {

    @GetMapping(path = "")
    ResponseEntity bicicletas();

    @GetMapping(path = "/{id}")
    ResponseEntity bicicleta(@PathVariable Long id);

    @PostMapping(path = "")
    ResponseEntity saveBicicleta(@RequestBody BicicletaSaveAndUpdate bicicletaSaveAndUpdate);

    @DeleteMapping(path = "/{id}")
    ResponseEntity deleteBicicleta(@PathVariable Long id);

    @PutMapping(path = "/{id}")
    ResponseEntity updateBicicleta(@PathVariable Long id, @RequestBody BicicletaSaveAndUpdate bicicletaSaveAndUpdate);
}
