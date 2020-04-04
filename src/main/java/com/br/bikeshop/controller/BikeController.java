package com.br.bikeshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping(path="/")
public interface BikeController {
	
	@GetMapping(path="/")
	ResponseEntity home();
}
