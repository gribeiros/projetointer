package com.br.bikeshop.repository;

import com.br.bikeshop.model.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {
//https://www.guj.com.br/t/erro-em-hql-path-expected-for-join/359875
    @Query("select b from Bicicleta as b inner ")
    List<Bicicleta> returnAll();

}
