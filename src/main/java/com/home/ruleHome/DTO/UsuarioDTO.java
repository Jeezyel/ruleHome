package com.home.ruleHome.DTO;

import jakarta.validation.constraints.NotBlank;

public record UsuarioDTO(
        @NotBlank(message = "o name/nome deve ser informdo ")
        String name,
        @NotBlank(message = "o login deve ser informdo ")
        String login,
        @NotBlank(message = "o password/senha deve ser informdo ")
        String password
) {
}
