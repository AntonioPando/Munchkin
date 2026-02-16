/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AntonioPando
 */

public class Tesoro extends Carta{
    
   protected TipoTesoro tipo;
   protected int bonus;
   
   public Tesoro(String nombre, TipoTesoro tipo, int bonus){
       super(nombre);
       this.tipo = tipo;
       this.bonus = bonus;
   }
   
   public Tesoro(){
       super();
       this.tipo = TipoTesoro.ACCESORIO;
       this.bonus = 0;
   }

    public TipoTesoro getTipo() {
        return tipo;
    }

    public void setTipo(TipoTesoro tipo) {
        this.tipo = tipo;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void aplicarEfecto(Jugador jugador, Juego juego) {
        jugador.recibirTesoro(this);
    }

    @Override
    public String toString() {
        return "Tesoro {" + "tipo=" + tipo + ", bonus=" + bonus + '}';
    }
   
    
           
}
