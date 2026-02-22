
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bigpa
 */
public class Juego {

    protected ArrayList<Jugador> jugadores;
    protected Mazo mazoPuerta;
    protected Mazo mazoTesoro;
    protected int turno;
    private boolean terminado;

    Scanner scan = new Scanner(System.in);

    public Juego(ArrayList<Jugador> jugadores, Mazo mazoPuerta, Mazo mazoTesoro, int turno, boolean terminado) {
        this.jugadores = jugadores;
        this.mazoPuerta = mazoPuerta;
        this.mazoTesoro = mazoTesoro;
        this.turno = turno;
        this.terminado = terminado;
    }

    public Juego(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
        this.mazoPuerta = new Mazo();
        this.mazoTesoro = new Mazo();
        this.turno = 0;
        this.terminado = false;

        inicializarCartas(mazoPuerta, mazoTesoro);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Mazo getMazoPuerta() {
        return mazoPuerta;
    }

    public void setMazoPuerta(Mazo mazoPuerta) {
        this.mazoPuerta = mazoPuerta;
    }

    public Mazo getMazoTesoro() {
        return mazoTesoro;
    }

    public void setMazoTesoro(Mazo mazoTesoro) {
        this.mazoTesoro = mazoTesoro;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public void inicializarCartas(Mazo mazoPuertas, Mazo mazoTesoros) {

        // ARMAS
        Tesoro martillo = new Tesoro("Martillo", TipoTesoro.ARMA, 3);
        Tesoro daga = new Tesoro("Daga", TipoTesoro.ARMA, 2);
        Tesoro espadaLarga = new Tesoro("Espada Larga", TipoTesoro.ARMA, 4);
        Tesoro hachaDeGuerra = new Tesoro("Hacha de Guerra", TipoTesoro.ARMA, 5);
        Tesoro arcoLargo = new Tesoro("Arco Largo", TipoTesoro.ARMA, 4);
        Tesoro arcoCorto = new Tesoro("Martillos", TipoTesoro.ARMA, 3);
        Tesoro espadaFlamigera = new Tesoro("Espada Flamigera", TipoTesoro.ARMA, 6);

        mazoTesoros.cartas.addAll(Arrays.asList(martillo, daga, espadaLarga, hachaDeGuerra, arcoLargo, arcoCorto, espadaFlamigera));

        // ARMADURAS
        Tesoro armaduraDeCuero = new Tesoro("Armadura de Cuero", TipoTesoro.ARMADURA, 2);
        Tesoro escudoDeMadera = new Tesoro("Escudo de madera", TipoTesoro.ARMADURA, 1);
        Tesoro yelmoReforzado = new Tesoro("Yelmo Reforzado", TipoTesoro.ARMADURA, 4);

        mazoTesoros.cartas.addAll(Arrays.asList(armaduraDeCuero, escudoDeMadera, yelmoReforzado));

        // ACCESORIOS
        Tesoro botasVeloces = new Tesoro("Botas Veloces", TipoTesoro.ACCESORIO, 3);
        Tesoro anilloDeFuerza = new Tesoro("Anillo de Fuerza", TipoTesoro.ACCESORIO, 4);
        Tesoro capaDeLevitacion = new Tesoro("Capas de Levitación", TipoTesoro.ACCESORIO, 5);
        Tesoro amuletoProtector = new Tesoro("Amuleto Protector", TipoTesoro.ACCESORIO, 3);

        mazoTesoros.cartas.addAll(Arrays.asList(botasVeloces, anilloDeFuerza, capaDeLevitacion, amuletoProtector));

        // MONSTRUOS
        Monstruo rataGigante = new Monstruo("Rata Gigante", 1, 1, 1);
        Monstruo goblinLadron = new Monstruo("Goblin Ladrón", 2, 1, 1);
        Monstruo esqueletoArmado = new Monstruo("Esqueleto Armado", 3, 1, 2);
        Monstruo orcoGuerrero = new Monstruo("Orco Guerrero", 4, 1, 2);
        Monstruo araniaVenenosa = new Monstruo("Araña Venenosa", 3, 1, 1);
        Monstruo zombiHambriento = new Monstruo("Zombi Hambriento", 4, 1, 2);

        mazoPuertas.cartas.addAll(Arrays.asList(rataGigante, goblinLadron, esqueletoArmado, orcoGuerrero, araniaVenenosa, zombiHambriento));

        // MALDICIONES
        Maldicion malaDeSuerte = new Maldicion("Mala de Suerte", Maldicion.TipoMaldicion.QUITANIVELES, "Pierdes 1 nivel", 1);
        Maldicion maldicionDelLadron = new Maldicion("Maldición del Ladrón", Maldicion.TipoMaldicion.QUITATESOROS, "Pierdes 2 tesoros al azar", 2);
        Maldicion amnesia = new Maldicion("Amnesia", Maldicion.TipoMaldicion.QUITANIVELES, "Pierdes 2 niveles", 2);
        Maldicion pobreza = new Maldicion("Pobreza", Maldicion.TipoMaldicion.QUITATESOROS, "Pierdes 1 tesoro", 1);

        mazoPuertas.cartas.addAll(Arrays.asList(malaDeSuerte, maldicionDelLadron, amnesia, pobreza));

        Collections.shuffle(mazoPuertas.cartas);
        Collections.shuffle(mazoTesoros.cartas);
    }

    public Carta robarPuerta() {
        return mazoPuerta.robar();
    }

    public Carta robarTesoro() {
        return mazoTesoro.robar();
    }

    public void jugar() {

        while (!terminado) {

            if (turno == jugadores.size()) {
                turno = 0;
            }

            Jugador actual = jugadores.get(turno);
            System.out.println("======================================");
            System.out.println("Turno del jugador: " + actual.toString());
            System.out.println("======================================");

            turno(actual);

            if (actual.getNivel() >= 5) {
                System.out.println("El jugador " + actual.getNombre() + " HA GANADO!!!");
                terminado = true;
            } else if (this.mazoPuerta.estaVacio() || this.mazoTesoro.estaVacio()) {
                System.out.println("La partida ha acabado en empate!");
                terminado = true;
            } else {
                scan.nextLine();
                turno++;
            }
        }
    }

    public void turno(Jugador jugador) {
        if (jugador.nivel >= 0) {
            Carta carta = robarPuerta();
            if (carta instanceof Monstruo) {
                ((Monstruo) carta).ejecutar(jugador, this);
            } else if (carta instanceof Maldicion) {
                ((Maldicion) carta).aplicarEfecto(jugador, this);
            } else if (carta instanceof Tesoro) {
                ((Tesoro) carta).aplicarEfecto(jugador, this);
            } else {
                System.out.println("Carta no reconocida");
            }
        } else {
            System.out.println("No juegas turno");
        }

        Random random = new Random();
        int puedeRobar = random.nextInt(3);
        System.out.println("The result of You can steal: " + puedeRobar);

        if (puedeRobar == 0) {
            // roba
            System.out.println("Intentemos robar una maravilla por aqui");
            // define quien robar
            int indiceVictima = random.nextInt(this.jugadores.size());
            Jugador victima = this.jugadores.get(indiceVictima);
            while (victima == jugador) {
                indiceVictima = random.nextInt(this.jugadores.size());
                victima = this.jugadores.get(indiceVictima);
            }
            System.out.println(victima.getNombre() + ", da me algo y con prisa !");
            Tesoro tesoro = jugador.robarTesoro(victima);
            System.out.println("Gracias por este " + tesoro.getNombre());
            if (tesoro.tipo != TipoTesoro.INUTIL) {
                jugador.recibirTesoro(tesoro);
            }

        }

    }

}
