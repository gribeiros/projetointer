package com.br.bikeshop.repository;

import com.br.bikeshop.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
    @Query(value = "select * from Marca",nativeQuery = true)
    Marca returnMarca();

}
