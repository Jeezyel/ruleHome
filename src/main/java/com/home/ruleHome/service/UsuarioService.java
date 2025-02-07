package com.home.ruleHome.service;

import com.home.ruleHome.DTO.UsuarioResponseDTO;
import com.home.ruleHome.model.Usuario;
import com.home.ruleHome.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioResponseDTO> getAllUsuarios() {
        List<Usuario> usuarioList = usuarioRepository.findAll();
        return usuarioList.stream().map(UsuarioResponseDTO::valueOf).toList();
    }
}
