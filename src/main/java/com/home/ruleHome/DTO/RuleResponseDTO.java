package com.home.ruleHome.DTO;

import com.home.ruleHome.model.Rule;
import com.home.ruleHome.model.Usuario;

public record RuleResponseDTO(
        Long id,
        String name,
        String description,
        Usuario usuario
) {
    public static RuleResponseDTO valueOf(Rule rule){
        return new RuleResponseDTO(
                rule.getId(),
                rule.getName(),
                rule.getDescription(),
                rule.getUsuario()
        );
    }
}
