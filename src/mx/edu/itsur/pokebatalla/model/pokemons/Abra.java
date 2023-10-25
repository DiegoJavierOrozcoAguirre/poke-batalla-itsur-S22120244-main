/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author DIEGO JAVIER OROZCO AGUIRRE
 */
public class Abra extends Pokemon {

    public Abra() {
        this.tipo = "PSIQUICO";
        this.hp = 25;
        this.ataque = 20;
        this.defensa = 15;
        this.nivel = 1;
        this.precision = 5;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("TELETRANSPORTE");
        this.habilidades.add("PLACAJE");
    }

    //Constructor alterno 1
    public Abra(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("TELETRANSPORTE")) {
            System.out.println("Realizando TELETRANSPORTE");
        } else if (habilidad.equals("PLACAJE")) {
            System.out.println("Realizando PLACAJE");
        }
        //TODO: otras habilidades...
    }
}
