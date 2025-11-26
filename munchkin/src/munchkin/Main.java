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
		
		// Armes
		Tesoro martillo = new Tesoro("Martillo", TipoTesoro.ARMA, 4);
		Tesoro espadaLarga = new Tesoro("Espada Larga", TipoTesoro.ARMA, 5);
		Tesoro hachaDeGuerra = new Tesoro("Hacha de Guerra", TipoTesoro.ARMA, 6);
		Tesoro daga = new Tesoro("Daga", TipoTesoro.ARMA, 2);
		Tesoro mangualDeLaMuerte = new Tesoro("Mangual de la Muerte", TipoTesoro.ARMA, 7);
		Tesoro arcoLargo = new Tesoro("Arco Largo", TipoTesoro.ARMA, 4);
		Tesoro lanzaFiluda = new Tesoro("Lanza Filuda", TipoTesoro.ARMA, 3);
		Tesoro espadaFlamigera = new Tesoro("Espada Flamígera", TipoTesoro.ARMA, 8);

		// Armaduras
		Tesoro armaduraDeCuero = new Tesoro("Armadura de Cuero", TipoTesoro.ARMADURA, 3);
		Tesoro cotaDeMalla = new Tesoro("Cota de Malla", TipoTesoro.ARMADURA, 5);
		Tesoro armaduraCompleta = new Tesoro("Armadura Completa", TipoTesoro.ARMADURA, 6);
		Tesoro escudoDeMadera = new Tesoro("Escudo de Madera", TipoTesoro.ARMADURA, 2);
		Tesoro armaduraMagica = new Tesoro("Armadura Mágica", TipoTesoro.ARMADURA, 7);
		Tesoro yelmoReforzado = new Tesoro("Yelmo Reforzado", TipoTesoro.ARMADURA, 4);

		// Accesorios
		Tesoro botasVeloces = new Tesoro("Botas Veloces", TipoTesoro.ACCESORIO, 3);
		Tesoro anilloDeFuerza = new Tesoro("Anillo de Fuerza", TipoTesoro.ACCESORIO, 4);
		Tesoro capaDeLevitacion = new Tesoro("Capa de Levitación", TipoTesoro.ACCESORIO, 5);
		Tesoro amuletoProtector = new Tesoro("Amuleto Protector", TipoTesoro.ACCESORIO, 3);
		Tesoro guantesDelLadron = new Tesoro("Guantes del Ladrón", TipoTesoro.ACCESORIO, 2);
		Tesoro cinturonDelCampeon = new Tesoro("Cinturón del Campeón", TipoTesoro.ACCESORIO, 6);
		Tesoro pocionCurativa = new Tesoro("Poción Curativa", TipoTesoro.ACCESORIO, 1);
		
		//monstruos
		Monstruo rataGigante = new Monstruo("Rata Gigante", 1, 1, 1);
		Monstruo goblinLadron = new Monstruo("Goblin Ladrón", 2, 1, 1);
		Monstruo esqueletoArmado = new Monstruo("Esqueleto Armado", 3, 1, 2);
		Monstruo orcoGuerrero = new Monstruo("Orco Guerrero", 4, 1, 2);
		Monstruo arañaVenenosa = new Monstruo("Araña Venenosa", 3, 1, 1);
		Monstruo zombiHambriento = new Monstruo("Zombi Hambriento", 4, 1, 2);
		Monstruo trasgoPeleon = new Monstruo("Trasgo Peleón", 2, 1, 1);
		Monstruo loboSalvaje = new Monstruo("Lobo Salvaje", 3, 1, 1);
		Monstruo vampiroNocturno = new Monstruo("Vampiro Nocturno", 6, 2, 3);
		Monstruo trollDeMontaña = new Monstruo("Troll de Montaña", 7, 2, 3);
		Monstruo dragonJoven = new Monstruo("Dragón Joven", 8, 2, 4);
		Monstruo licantropoFeroz = new Monstruo("Licantropo Feroz", 5, 1, 2);
		Monstruo golemDePiedra = new Monstruo("Golem de Piedra", 6, 2, 2);
		Monstruo espectroMaldito = new Monstruo("Espectro Maldito", 5, 1, 3);
		Monstruo hidraMulticabeza = new Monstruo("Hidra Multicabeza", 9, 2, 4);
		Monstruo demonioInfernal = new Monstruo("Demonio Infernal", 10, 2, 5);
		Monstruo minotauroSalvaje = new Monstruo("Minotauro Salvaje", 7, 2, 3);
		Monstruo basiliscoLetal = new Monstruo("Basilisco Letal", 8, 2, 3);
		Monstruo necromante = new Monstruo("Necromante", 6, 2, 3);
		Monstruo dragonAnciano = new Monstruo("Dragón Anciano", 12, 3, 6);
		Monstruo kraken = new Monstruo("Kraken", 11, 2, 5);
		
		Juego juego = new Juego(jugadores);
		juego.jugar();
	}

}
