package com.br.bikeshop.service.impl;

import com.br.bikeshop.model.Usuario;
import com.br.bikeshop.repository.PessoaRepository;
import com.br.bikeshop.repository.UsuarioRepository;
import com.br.bikeshop.service.UsuarioService;
import com.br.bikeshop.view.UsuarioSaveAndUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PessoaRepository pessoaRepository;

    @Override
    public List<Usuario> returnUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public ResponseEntity saveUsuario(UsuarioSaveAndUpdate usuarioSaveAndUpdate) {
        Usuario usuario = new Usuario(usuarioSaveAndUpdate.getLogin(), usuarioSaveAndUpdate.getSenha(), pessoaRepository.findById(usuarioSaveAndUpdate.getPessoa()).get());

        usuarioRepository.save(usuario);
        return new ResponseEntity(usuarioSaveAndUpdate, HttpStatus.OK);
    }

    @Override
    public ResponseEntity findUsuario(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        if (usuario != null) {
            return new ResponseEntity(usuario, HttpStatus.OK);
        } else {
            return new ResponseEntity("Not Found!", HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
        return new ResponseEntity("Deletado!", HttpStatus.OK);
    }

    @Override
    public ResponseEntity updateUsuario(UsuarioSaveAndUpdate usuarioSaveAndUpdate) {
        Usuario usuario = new Usuario(usuarioSaveAndUpdate.getLogin(), usuarioSaveAndUpdate.getSenha(), pessoaRepository.findById(usuarioSaveAndUpdate.getPessoa()).get());
        usuario.setId(usuarioSaveAndUpdate.getId());
        usuarioRepository.saveAndFlush(usuario);
        return new ResponseEntity("Atualizado!", HttpStatus.OK);
    }
}
