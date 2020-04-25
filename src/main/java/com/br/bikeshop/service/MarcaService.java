package com.br.bikeshop.service;


import com.br.bikeshop.model.Marca;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface MarcaService {
    List<Marca> returnMarcas();

    ResponseEntity saveMarca(Marca marca);

    Optional<Marca> findMarca(Long id);

    ResponseEntity deleteMarca(Long id);

    ResponseEntity updateMarca(Marca marca);
}
