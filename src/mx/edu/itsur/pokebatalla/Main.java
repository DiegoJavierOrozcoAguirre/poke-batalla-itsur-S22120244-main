/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import java.io.IOException;
import mx.edu.itsur.pokebatalla.model.ControlArchivos.FileManager;
import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Machop;
import mx.edu.itsur.pokebatalla.model.pokemons.Gengar;
import mx.edu.itsur.pokebatalla.model.pokemons.Abra;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;

/**
 *
 * @author DIEGO JAVIER OROZCO AGUIRRE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HOLA POKEMONES");
        System.out.println("--------------------------------------------");

        // Instanciar pokemons
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();
        Abra abra = new Abra();
        Machop mach = new Machop();
        Gengar geng = new Gengar();

        // Instanciar entrenadores y que capturen pokemons
        Entrenador ent1 = new Entrenador("Alan");
        ent1.capturarPokemon(pika);
        ent1.capturarPokemon(abra);

        Entrenador ent2 = new Entrenador("Chucho");
        ent2.capturarPokemon(charm);
        ent2.capturarPokemon(geng);

        // Verificar si hay una partida guardada
        System.out.println("¿Deseas cargar una partida guardada? (Y/N)");
        char respuestaCargar = obtenerRespuestaUsuario();

        Batalla examen;
        if (respuestaCargar == 'Y' || respuestaCargar == 'y') {
            // Cargar la partida guardada
            examen = FileManager.cargarPartida();
            if (examen == null) {
                // No se pudo cargar la partida, iniciar nueva batalla
                examen = new Batalla(ent1, ent2);
            }
        } else {
            // Iniciar nueva batalla
            examen = new Batalla(ent1, ent2);
        }

        // Iniciar o cargar la batalla
        examen.desarrollarBatalla();
    }

    private static char obtenerRespuestaUsuario() {
        try {
            char respuesta = (char) System.in.read();
            System.in.read(new byte[System.in.available()]); // Limpiar buffer
            return respuesta;
        } catch (IOException ex) {
            ex.printStackTrace();
            return 'N'; // Por defecto, no cargar partida en caso de error
        }
    }
}
