
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author AntonioPando
 */
public class Munchkin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        System.out.println("#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#");
        System.out.println("# Bienvenido! Estas en el mejor Munchkin nunca desarrollado #");
        System.out.println("#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#·#");

        System.out.println("\"Cuantos jugadores se van a atrever?\"");
        int numeroJugadores = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i < numeroJugadores + 1; i++) {
            System.out.println("Cual es el nombre del jugador " + (i) + "?");
            String nombre = scan.nextLine();
            Jugador jugador = new Jugador(nombre);
            jugadores.add(jugador);
        }

        Juego juego = new Juego(jugadores);
        juego.jugar();
        scan.close();
    }
}
