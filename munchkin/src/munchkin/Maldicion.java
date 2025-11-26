package munchkin;

public class Maldicion extends Carta implements IEfectoCarta {

	// Atributos
	
	protected String descripcion;
	
	// Getter & Setter
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	// Constructor 
	
	public Maldicion(String nombre, String descripcion) {
		super(nombre);
		this.descripcion = descripcion;
	}

	// Métodos
	
	public void ejecutar() {
		// TODO: acción
		
	}
	
	@Override
	
	public void aplicarEfecto(String jugador, String juego) {
		// TODO
		ejecutar(jugador, juego);
	
	}

	@Override
	public void ejecutar(String Jugador, String Juego) {
		// TODO Auto-generated method stub
		
	}

}