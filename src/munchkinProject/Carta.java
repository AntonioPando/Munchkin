package munchkinProject;

public abstract class Carta {
	
	//Atributos
	
	protected String nombre;
	
	// Setter & Getter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	// Constructor por parámetros
	
	public Carta(String nombre) {
		this.nombre = nombre;
	}
	
	// Constructor por defecto
	
	public Carta() {
		this.nombre = " ";
	}
	
	
	// Método abstracto
	
	public abstract void aplicarEfecto (String jugador, String juego);
	
}