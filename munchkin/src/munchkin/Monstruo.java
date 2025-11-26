package munchkin;


public class Monstruo extends Carta implements IEfectoCarta {
	// Atributos
	
		protected int nivel;
		protected int recompensaNiveles;
		protected int recompensaTesoro;
		
		// Getter & Setter
		
		public int getNivel() {
			return nivel;
		}

		public void setNivel(int nivel) {
			this.nivel = nivel;
		}

		public int getRecompensaNiveles() {
			return recompensaNiveles;
		}

		public void setRecompensaNiveles(int recompensaNiveles) {
			this.recompensaNiveles = recompensaNiveles;
		}

		public int getRecompensaTesoro() {
			return recompensaTesoro;
		}

		public void setRecompensaTesoro(int recompensaTesoro) {
			this.recompensaTesoro = recompensaTesoro;
		}
		
		// Constructor por parámtros 
		
		public Monstruo(String nombre, int nivel, int recompensaNiveles, int recompensaTesoro) {
			super(nombre);
			this.nivel = nivel;
			this.recompensaNiveles = recompensaNiveles;
			this.recompensaTesoro = recompensaTesoro;
		}
		
		
		// Métodos

		public void ejecutar(String jugador, String juego) {
			// TODO: acción
			
		}
		
		
		@Override
		public void aplicarEfecto(String jugador, String juego) {
			// TODO
			ejecutar(jugador, juego);
			
		}




}