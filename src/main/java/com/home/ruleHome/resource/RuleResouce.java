package com.home.ruleHome.resource;

import com.home.ruleHome.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rules")
public class RuleResouce {

    @Autowired
    private RuleService ruleService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }


    @PostMapping( consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<String> retorno(@RequestBody String request){
        return ResponseEntity.ok(request.toUpperCase());
    }
}
