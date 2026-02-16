/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AntonioPando
 */

public abstract class Carta {
    
    protected String nombre;
    
    public Carta(String nombre){
        this.nombre = nombre;
    }
    
    public Carta(){
        this.nombre = "";
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public abstract void aplicarEfecto(Jugador jugador, Juego juego);
}
