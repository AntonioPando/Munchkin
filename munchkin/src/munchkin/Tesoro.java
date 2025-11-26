package munchkin;

public class Tesoro extends Carta {

	// Atributos

	protected TipoTesoro tipo;
	protected int bonus;

	// Getter & Setter
	public TipoTesoro getTipo() {
		return tipo;
	}

	public void setTipo(TipoTesoro tipo) {
		this.tipo = tipo;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	// Constructor

	public Tesoro(String nombre, TipoTesoro tipo, int bonus) {
		super(nombre);
		this.tipo = tipo;
		this.bonus = bonus;
	}

	// Métodos

	@Override
	public void aplicarEfecto(String jugador, String juego) {
		// TODO Auto-generated method stub

	}

}
