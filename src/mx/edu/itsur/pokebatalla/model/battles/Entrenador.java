/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author DIEGO JAVIER OROZCO AGUIRRE
 */
public class Entrenador implements Serializable {

    //Atributos
    protected String nombre;
    protected List<Pokemon> pokemonsCapturados;
    protected Pokemon pokemonActual;

    //constructor
    public Entrenador(String nombre) {
        this.nombre = nombre;
        pokemonsCapturados = new ArrayList<>();

    }

    //metodos
    public void capturarPokemon(Pokemon pk) {
        pokemonsCapturados.add(pk);
    }

     public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordinalMovimiento)
    {
        if(ordinalMovimiento>=0)
        this.pokemonActual.atacar(oponente, ordinalMovimiento);
    }

    public boolean estaDerrotado() {
    for (Pokemon pokemon : pokemonsCapturados) {
        if (pokemon.getHP() > 0) {
            // Si al menos un Pokémon tiene HP mayor que 0, el entrenador no está derrotado
            return false;
        }else{
            pokemon.setHp(0);
        }
    }
    // Si ningún Pokémon tiene HP mayor que 0, el entrenador está derrotado
    return true;
}


    //GYS
    public String getNombre() {
        
        return nombre;
    }

    public List<Pokemon> getPokemonsCapturados() {
        return pokemonsCapturados;
    }

    public Pokemon getPokemonActual() {
        return pokemonActual;
    }

    public void setPokemonActual(Pokemon pokemonActual) {
        this.pokemonActual = pokemonActual;
    }

}
