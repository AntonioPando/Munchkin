package munchkin;

public class Maldicion extends Carta implements IEfectoCarta {

	
	// tipo de maldicion
	enum TipoMaldicion {
		QUITANIVELES,
		QUITATESOROS
	}
	
	// Atributos
	
	protected TipoMaldicion tipo;
	protected String descripcion;
	protected int potencia;
	
	// Getter & Setter
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	// Constructor 
	
	public Maldicion(String nombre, String tipo, String descripcion, int potencia) {
		super(nombre);
		this.tipo = tipo == "QUITANIVELES" ? TipoMaldicion.QUITANIVELES: TipoMaldicion.QUITATESOROS;
		this.descripcion = descripcion;
		this.potencia = potencia;
	}

	// Métodos
	
	@Override
	public void aplicarEfecto(Jugador jugador, Juego juego) {
		// TODO
		ejecutar(jugador, juego);
	}

	@Override
	public void ejecutar(Jugador jugador, Juego Juego) {
		if (this.tipo == TipoMaldicion.QUITANIVELES) {
			jugador.bajarNivel(potencia);
		} else if (this.tipo == TipoMaldicion.QUITATESOROS) {
			for (int i = 0; i < this.potencia; i++) {
				jugador.quitarTesoro();
			}
		}
	}

	@Override
	public String toString() {
		return "Maldicion [tipo=" + tipo + ", descripcion=" + descripcion + ", potencia=" + potencia + "]";
	}
}