package com.home.ruleHome.resource;

import com.home.ruleHome.DTO.UsuarioResponseDTO;
import com.home.ruleHome.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResouce {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UsuarioResponseDTO>> helloWorld(){
        return ResponseEntity.ok(usuarioService.getAllUsuarios());
    }

    @PostMapping( consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<String> retorno(@RequestBody String request){
        return ResponseEntity.ok(request.toUpperCase());
    }
}
