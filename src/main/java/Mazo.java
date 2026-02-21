/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AntonioPando
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Mazo {
    
    protected ArrayList<Carta> cartas;

    public Mazo() {
        this.cartas = new ArrayList<>();
    }
    
    public void Mezclar(){
        Collections.shuffle(cartas);
    }
    
    public Carta robar(){
        if (cartas.isEmpty()){
            return null;
        }
        return cartas.remove(0);
    }
    
    public boolean estaVacio(){
        return cartas.isEmpty();
    }
    
    public int size(){
        return cartas.size();
    }
    
    
    
}
