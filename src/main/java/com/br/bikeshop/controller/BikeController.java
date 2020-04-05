package com.br.bikeshop.controller;

import com.br.bikeshop.model.Bicicleta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(path="/")
public interface BikeController {
	
	@GetMapping(path="/marcas")
	ResponseEntity marcas();

	@GetMapping(path="/bicicletas")
	ResponseEntity bicicletas();

	@GetMapping(path="/bicicleta/{id}")
	ResponseEntity bicicleta(@PathVariable Long id);

	@PostMapping(path="/bicicletas")
	ResponseEntity saveBicicletas(@RequestBody Bicicleta bicicleta);
}
