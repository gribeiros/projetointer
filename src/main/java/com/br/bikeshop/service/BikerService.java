package com.br.bikeshop.service;

import com.br.bikeshop.model.Bicicleta;
import com.br.bikeshop.model.Marca;

import java.util.List;
import java.util.Optional;

public interface BikerService {

    List<Marca> retunMarca();

    List<Bicicleta> returnBicicletas();

    Bicicleta saveBiciclieta(Bicicleta bicicleta);

    Optional<Bicicleta> findBiciclieta(Long id);
}
