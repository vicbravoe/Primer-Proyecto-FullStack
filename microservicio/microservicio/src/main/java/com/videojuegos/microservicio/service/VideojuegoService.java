package com.videojuegos.microservicio.service;

import com.videojuegos.microservicio.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoService {

    private final VideojuegoRepository repository;

    public VideojuegoService(VideojuegoRepository repository) {
        this.repository = repository;
    }

    public List<String> listar() {
        return repository.obtenerJuegos();
    }

    public void agregar(String nombre) {
        repository.agregarJuego(nombre);
    }
}
