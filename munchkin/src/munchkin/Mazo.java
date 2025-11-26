package munchkin;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
	
	// Atributos
	
	protected ArrayList <Carta> cartas = new ArrayList<>();
	
	// Getter & Setter
	
	public ArrayList <Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	
	// Constructor
	
	public Mazo( ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	// Métodos
	
	public void addCarta(Carta carta) {
		
		this.cartas.add(carta);
		
	}
	
	public void mezclar() {
		Collections.shuffle(cartas); 
		
// método de la clase Collections que 
//desordena aleatoriamente los elementos de una lista.
		
	}
	
	public Carta robar() {
	    if (cartas.isEmpty()) return null; // comprueba si hay cartas
	    return cartas.remove(0);  // devuelve y elimina a la vez

			
	}
	
	public boolean estaVacio() {
		return cartas.isEmpty();
	}

}
