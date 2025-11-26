package munchkin;

public class Monstruo extends Carta implements IEfectoCarta {

	// Atributos
	protected int nivel;
	protected int recompensaNiveles;
	protected int recompensaTesoro;

	// Constructor por parámetros

	public Monstruo(String nombre, int nivel, int recompensaNiveles, int recompensaTesoro) {
		super(nombre);
		this.nivel = nivel;
		this.recompensaNiveles = recompensaNiveles;
		this.recompensaTesoro = recompensaTesoro;
	}

	// Constructor por defecto
	public Monstruo() {
		super();
		this.nivel = 0;
		this.recompensaNiveles = 0;
		this.recompensaTesoro = 0;
	}

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

	// Métodos

	public void ejecutar(Jugador jugador, Juego juego) {
		System.out.println(jugador.getNombre() + " se enfrenta al monstruo " + nombre);

		if (jugador.getFuerza() >= this.nivel) {
			System.out.println("¡Victoria!");
			int nivel = jugador.getNivel();
			nivel += this.recompensaNiveles;
			jugador.setNivel(nivel);

			for (int i = 0; i < this.recompensaTesoro; i++) {
				Carta t = juego.robarTesoro();
				if (t instanceof Tesoro)
					jugador.recibirTesoro((Tesoro) t);
			}
		} else {
			System.out.println("¡Has perdido! Bajas de nivel");
			jugador.bajarNivel(1);
		}
	}

	@Override
	public void aplicarEfecto(Jugador jugador, Juego juego) {
		// TODO Auto-generated method stub
		ejecutar(jugador, juego);
	}

	@Override
	public String toString() {
		return "Monstruo [nivel=" + nivel + ", recompensaNiveles=" + recompensaNiveles + ", recompensaTesoro="
				+ recompensaTesoro + "]";
	}
	
	

}
