package com.br.bikeshop.service;

import com.br.bikeshop.model.Usuario;
import com.br.bikeshop.view.UsuarioSaveAndUpdate;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsuarioService {

    List<Usuario> returnUsuarios();

    ResponseEntity saveUsuario(UsuarioSaveAndUpdate usuarioSaveAndUpdate);

    ResponseEntity findUsuario(Long id);

    ResponseEntity deleteUsuario(Long id);

    ResponseEntity updateUsuario(UsuarioSaveAndUpdate usuarioSaveAndUpdate);

    ResponseEntity findByName(String name);

}
