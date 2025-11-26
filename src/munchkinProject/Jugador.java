package munchkinProject;

import java.util.ArrayList;
import java.util.Random;

public class Jugador {
	
	private String nombre;
	private int nivel;
	private ArrayList<Tesoro> tesoros;
	
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.nivel = 1;
		this.tesoros = new ArrayList<Tesoro>();
	}


	public Jugador() {
		this.nombre = "No tengo nombre !";
		this.nivel = 1;
		this.tesoros = new ArrayList<Tesoro>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public ArrayList<Tesoro> getTesoros() {
		return tesoros;
	}


	public void setTesoros(ArrayList<Tesoro> tesoros) {
		this.tesoros = tesoros;
	}
	
	public int getFuerza() {
		// TODO integrar Juego para llamar a aplicarEfecto
		int bonus;
		for (Tesoro tesoro:tesoros) {
			bonus += tesoro.aplicarEfecto(nombre, juego);
		}
		return this.nivel + bonus;
	}
	
	public void subirNivel(int subida) {
		this.nivel += subida;
	}
	
	public void bajarNivel(int baja) {
		this.nivel -= baja;
	}
	
	public void recibirTesoro(Tesoro tesoro) {
		this.tesoros.add(tesoro);
	}
	
	public void removerTesoroAleatorio() {
		Random random = new Random();
		int randomIndice = random.nextInt(this.tesoros.size());
		this.tesoros.remove(randomIndice);
	}
	
	public boolean haGanado() {
		return this.nivel >= 5;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", nivel=" + nivel + ", tesoros=" + tesoros + "]";
	}	
	
	

}
