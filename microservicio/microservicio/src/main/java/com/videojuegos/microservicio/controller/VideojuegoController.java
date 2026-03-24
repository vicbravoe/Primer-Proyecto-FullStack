package com.videojuegos.microservicio.controller;

import com.videojuegos.microservicio.service.VideojuegoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/juegos")
public class VideojuegoController {

    private final VideojuegoService service;

    public VideojuegoController(VideojuegoService service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public List<String> listar() {
        return service.listar();
    }

    @PostMapping("/agregar")
    public String agregar(@RequestBody java.util.Map<String, String> body) {
        String nombre = body.get("nombre");
        service.agregar(nombre);
        return "Juego agregado";
    }
    
}
