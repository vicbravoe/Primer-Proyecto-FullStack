package com.videojuegos.microservicio.controller;

import com.videojuegos.microservicio.service.VideojuegoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;


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

    @DeleteMapping("/eliminar/{nombre}")
    public String eliminar(@PathVariable String nombre) {
        service.eliminar(nombre);
        return "Juego eliminado";
    }

    @PutMapping("modificar")
    public String modificar(@RequestBody Map<String, String> body) {
        String antiguo = body.get("antiguo");
        String nuevo = body.get("nuevo");

        service.modificar(antiguo, nuevo);
        return "Juego modificado";
    }

    @GetMapping("buscar/{nombre}")
    public String buscar(@PathVariable String nombre) {
        return service.buscar(nombre);
    }
    
    
}
