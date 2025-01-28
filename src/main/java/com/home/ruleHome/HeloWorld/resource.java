package com.home.ruleHome.HeloWorld;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rules")
public class resource {

    //@Autowired e equivalnte a @Inject
    //private EditoraService editoraService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }
    @PostMapping( consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<String> retorno(@RequestBody String request){
        return ResponseEntity.ok(request.toUpperCase());
    }
}
