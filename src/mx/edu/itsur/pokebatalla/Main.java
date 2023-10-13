/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pikachu;
import mx.edu.itsur.pokebatalla.model.Charmander;
import mx.edu.itsur.pokebatalla.model.Pokemon;
import mx.edu.itsur.pokebatalla.model.Machop;
import mx.edu.itsur.pokebatalla.model.Abra;
import mx.edu.itsur.pokebatalla.model.Gengar;


/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PokeBatalla!");

        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander();

//        Exeggcute exeggcuteSalvaje = new Exeggcute();
//        Butterfree butterfreeSalvaje = new Butterfree();
//        Jigglypuff jigglypuffSalvaje = new Jigglypuff();
//
//        Exeggcute exeggcuteEntrenador = new Exeggcute();
//        Butterfree butterfreeEntrenador = new Butterfree();
//        Jigglypuff jigglypuffEntrenador = new Jigglypuff();
        Gengar gengarSalvaje = new Gengar();
        Machop machopSalvaje = new Machop();
        Abra abraSalvaje = new Abra();

        Gengar gengarEntrenador = new Gengar();
        Machop machopEntrenador = new Machop();
        Abra abraEntrenador = new Abra();

        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("pedro");
        Pikachu miPikachu = pikachuSalvaje;

        miPikachu.atacar(charmanderSalvaje);

        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");

        //batalla
        machopEntrenador.setNombre("Machop");
        machopEntrenador.atacar(gengarSalvaje);
        machopEntrenador.atacar(gengarSalvaje, "ULTRAPUÑO");

        abraEntrenador.setNombre("Abra");
        abraEntrenador.atacar(machopSalvaje);
        abraEntrenador.atacar(machopSalvaje, "PLACAJE");

        gengarEntrenador.setNombre("Gengar");
        gengarEntrenador.atacar(abraSalvaje);
        gengarEntrenador.atacar(abraSalvaje, "PUÑO SOMBRA");

    }

}
