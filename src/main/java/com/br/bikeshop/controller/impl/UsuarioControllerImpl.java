package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.UsuarioController;
import com.br.bikeshop.service.UsuarioService;
import com.br.bikeshop.view.UsuarioSaveAndUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UsuarioControllerImpl implements UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Override
    public ResponseEntity modelos() {
        return new ResponseEntity(usuarioService.returnUsuarios(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity modelo(Long id) {
        return usuarioService.findUsuario(id);
    }

    @Override
    public ResponseEntity saveModelo(UsuarioSaveAndUpdate usuarioSaveAndUpdate) {
        return usuarioService.saveUsuario(usuarioSaveAndUpdate);
    }

    @Override
    public ResponseEntity deleteModelo(Long id) {
        return usuarioService.deleteUsuario(id);
    }

    @Override
    public ResponseEntity updateModelo(UsuarioSaveAndUpdate usuarioSaveAndUpdate) {
        return usuarioService.updateUsuario(usuarioSaveAndUpdate);
    }
}
