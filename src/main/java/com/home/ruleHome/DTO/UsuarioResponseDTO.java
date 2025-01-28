package com.home.ruleHome.DTO;

import com.home.ruleHome.model.Usuario;
import jakarta.validation.constraints.NotBlank;

public record UsuarioResponseDTO(
        Long id,
        String name,
        String login,
        String password
) {
        public static UsuarioResponseDTO valueOf(Usuario usuario){
                return new UsuarioResponseDTO(
                        usuario.getId(),
                        usuario.getName(),
                        usuario.getLogin(),
                        usuario.getPassword()
                );
        }

}
