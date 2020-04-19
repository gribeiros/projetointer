package com.br.bikeshop.repository;

import com.br.bikeshop.model.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {

    @Query("Select b from Bicicleta b,Cor c,Modelo mo,Marca m JOIN FETCH b.marca mf JOIN FETCH b.cor cf JOIN FETCH b.modelo mof where cf=c.id and mf = m.id and mof = mo.id")
    List<Bicicleta> returnAll();

}
