package com.br.bikeshop.service.impl;

import com.br.bikeshop.repository.UsuarioRepository;
import com.br.bikeshop.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
}
