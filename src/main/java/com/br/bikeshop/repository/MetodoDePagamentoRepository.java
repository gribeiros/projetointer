package com.br.bikeshop.repository;


import com.br.bikeshop.model.MetodoDePagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoDePagamentoRepository extends JpaRepository<MetodoDePagamento, Long> {
}
