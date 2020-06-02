package com.br.bikeshop.repository;

import com.br.bikeshop.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    @Query("Select p from Pessoa p where p.cpf=?1")
    Pessoa findByName(String cpf);


}
