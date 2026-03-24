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

        // METODO PARA ELIMINAR (DELETE)
        public void eliminarJuego(String nombre) {
            juegos.remove(nombre);
        }

        // METODO PARA MODIFICAR (PUT)
        public void modificarJuego(String antiguo, String nuevo) {
            int index = juegos.indexOf(antiguo);
            if (index != -1) {
                juegos.set(index, nuevo);
            }
        }

        // METODO BUSCA POR NOMBRE (GET)
        public String buscarJuego(String nombre) {
            if (juegos.contains(nombre)) {
                return nombre;
            }
            return "No encontrado";
        }
}
