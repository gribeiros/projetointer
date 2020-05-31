package com.br.bikeshop.repository;

import com.br.bikeshop.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
    @Query("Select a from Aluguel a,Usuario u,Status s, MetodoDePagamento mdp,Bicicleta b JOIN FETCH a.usuario uf JOIN FETCH a.status sf JOIN FETCH a.metodoDePagamento mdpf JOIN FETCH a.bicicleta bf where uf=u.id and sf=s.id and mdpf=mdp.id and bf=b.id")
    List<Aluguel> returnAll();

    @Query("Select a from Aluguel a,Usuario u,Status s, MetodoDePagamento mdp,Bicicleta b JOIN FETCH a.usuario uf JOIN FETCH a.status sf JOIN FETCH a.metodoDePagamento mdpf JOIN FETCH a.bicicleta bf where uf=u.id and sf=s.id and mdpf=mdp.id and bf=b.id and a.id=?1")
    Aluguel returnById(Long id);
}
