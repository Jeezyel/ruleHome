package com.home.ruleHome.repository;


import com.home.ruleHome.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioRepositoryPrincipal {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> buscarUsuariosPorNome(String nome) {
        if (nome == null || nome.isBlank()) {
            return List.of(); // Retorna lista vazia em vez de null
        }
        return usuarioRepository.findByListaName(nome);
    }
}
