package munchkin;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
	protected ArrayList<Carta> cartas;

	public Mazo() {
		cartas = new ArrayList<>();
	}

	public void addCarta(Carta carta) {
		if (carta != null) {
			cartas.add(carta);
		}
	}

	public void Mezclar() {
		Collections.shuffle(cartas);
	}

	public Carta robar() {
		if (cartas.isEmpty()) {
			return null;
		}
		return cartas.remove(0);
	}

	public boolean estaVacio() {
		return cartas.isEmpty();
	}

	public int size() {
		return cartas.size();
	}

}
