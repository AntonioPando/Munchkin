/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AntonioPando
 */

import java.util.ArrayList;
import java.util.Random;

public class Jugador {
    
    private String nombre;
    protected int nivel;
    private ArrayList<Tesoro> tesoros;
    
    public Jugador(String nombre){
        this.nombre = nombre;
        this.nivel = 1;
        this.tesoros = new ArrayList<Tesoro>();
    }
    
    public Jugador(){
        this.nombre = "No tengo nombre!";
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
    
    //TODO hacer metodo getfuerza()
    public int getFuerza() {
        return 0;
    }
    
    public void subirNivel(int subida){
        this.nivel += subida;
    }
    
    public void bajarNivel(int bajada){
        this.nivel -= bajada;
    }
    
    public void recibirTesoro (Tesoro tesoro){
        this.tesoros.add(tesoro);
    }
    
    public boolean removerTesoroAleatorio(){
        if (this.tesoros.size() > 0){
            Random random = new Random();
            int randomIndice = random.nextInt(this.tesoros.size());
            System.out.println("Pues tendras que continuar sin ese maravillo " + this.tesoros.get(randomIndice).getNombre());
            this.tesoros.remove(randomIndice);
            return true;
        } else{
            System.out.println("¡Ya no tengo ningun tesoro!");
            return false;
        }
    }
    
    public Tesoro robarTesoro(Jugador victima){
        if (victima.tesoros.size()>0){
            Random random = new Random();
            int randomIndice = random.nextInt(victima.tesoros.size());
            Tesoro tesoro = victima.tesoros.get(randomIndice);
            victima.tesoros.remove(randomIndice);
            return tesoro;
        } else {
            System.out.println("¡No tengo nada mas que un pañuelo!");
            Tesoro tesoro = new Tesoro("Pañuelo", TipoTesoro.INUTIL, 0);
            return tesoro;
        }
    }
    
    public boolean haGanado() {
        return this.nivel >= 5;
    }

    @Override
    public String toString() {
        return "Jugador [" + "nombre=" + nombre + ", nivel=" + nivel + ", tesoros=" + tesoros.toString() + ']';
    }
    
    
    
}
