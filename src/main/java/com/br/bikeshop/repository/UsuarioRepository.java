package com.br.bikeshop.repository;

import com.br.bikeshop.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("Select u from Usuario u,Pessoa p JOIN FETCH u.pessoa pf where pf=p.id")
    List<Usuario> returnAll();

    @Query("Select u from Usuario u,Pessoa p JOIN FETCH u.pessoa pf where pf=p.id and u.login=?1")
    Usuario returnByName(String name);

}
