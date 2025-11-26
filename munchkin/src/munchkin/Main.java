package munchkin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		
		System.out.println("********");
		System.out.println("Bienvenido! Estas en el mejor Munchkin nunca desarrollado.");
		System.out.println("********");

		System.out.println("\"Cuanto jugadores se van a atrever ?\"");
		int numeroJugadores = scan.nextInt();
		
		for (int i=0; i < numeroJugadores; i++) {
			System.out.println("Cual es el nombre del jugador " + (i + 1) + " ?");
			String nombre = scan.nextLine();
			Jugador jugador = new Jugador(nombre);
			jugadores.add(jugador);
		}
		
		Juego juego = new Juego(jugadores);
		juego.jugar();
	}

}
