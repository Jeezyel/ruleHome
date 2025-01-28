package com.home.ruleHome.DTO;

import com.home.ruleHome.model.Usuario;

public record RuleDTO(
        String name,
        String description,
        Usuario usuario
) {
}
