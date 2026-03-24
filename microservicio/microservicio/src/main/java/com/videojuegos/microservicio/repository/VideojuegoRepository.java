package com.videojuegos.microservicio.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VideojuegoRepository {

        private List<String> juegos = new ArrayList<>();

        public VideojuegoRepository() {
            juegos.add("FIFA");
            juegos.add("Minecraft");
            juegos.add("Mario Kart");
            juegos.add("Mortal Combat");
        }

        public List<String> obtenerJuegos() {
            return juegos;
        }

        // METODO AGREGADO (POST)
        public void agregarJuego(String nombre) {
            juegos.add(nombre);
        }
}
