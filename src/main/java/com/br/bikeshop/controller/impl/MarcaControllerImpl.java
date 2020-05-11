package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.MarcaController;
import com.br.bikeshop.model.Marca;
import com.br.bikeshop.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class MarcaControllerImpl implements MarcaController {

    @Autowired
    private MarcaService marcaService;

    @Override
    public ResponseEntity marcas() {
        List<Marca> marcas = marcaService.returnMarcas();

        return new ResponseEntity(marcas.stream().sorted((o1, o2) -> (int) (o1.getId() - o2.getId())), HttpStatus.OK);
    }

    @Override
    public ResponseEntity marca(Long id) {
        Optional<Marca> marca = marcaService.findMarca(id);
        return new ResponseEntity(marca, HttpStatus.OK);
    }

    @Override
    public ResponseEntity saveMarca(Marca marca) {
        ResponseEntity responseEntity = marcaService.saveMarca(marca);
        return responseEntity;
    }

    @Override
    public ResponseEntity deleteMarca(Long id) {
        ResponseEntity responseEntity = marcaService.deleteMarca(id);
        return responseEntity;
    }

    @Override
    public ResponseEntity updateMarca(Marca marca) {
        ResponseEntity responseEntity = marcaService.updateMarca(marca);
        return responseEntity;
    }
}
