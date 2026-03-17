package com.MarioBros.Mario.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/luigi")
    public String MarioBros() {
        return "Mario y Luigi son mejores versiones de Phineas y Ferb :)";
    }
    
}
