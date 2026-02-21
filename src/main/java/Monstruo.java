/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 
 */
public class Monstruo extends Carta implemetns IEfectoCarta {
    
    protected int nivel;
    protected int recompensaNiveles;
    protected int recompensaTesoro;

    public Monstruo(int nivel, int recompensaNiveles, int recompensaTesoro, String nombre) {
        super(nombre);
        this.nivel = nivel;
        this.recompensaNiveles = recompensaNiveles;
        this.recompensaTesoro = recompensaTesoro;
    }
    
    public Monstruo(){
        super();
        this.nivel = 0;
        this.recompensaNiveles = 0;
        this.recompensaTesoro = 0;
    }

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
    
    public void ejecutar (Jugador jugador, Juego juego){
        System.out.println(jugador.getNombre() + " se enfrenta al monstruo " + nombre);
        
        if (jugador.getFuerza() >= this.nivel){
            System.out.println("¡VICTORIA!");
            //TODO añadir sysout con the los tesoros y niveles ganados
            int nivel = jugador.getNivel();
            nivel += this.recompensaNiveles;
            jugador.setNivel(nivel);
            
            for (int i=0; i < this.recompensaTesoro; i++){
                Carta carta = juego.robarTesoro();
                if (carta instanceof Tesoro){
                    jugador.recibirTesoro((Tesoro) carta);
                }
            }
        } else {
            System.out.println("¡Has perdido! Bajas de nivel");
            jugador.bajarNivel(1);
        }
    }

    @Override
    public void aplicarEfecto(Jugador jugador, Juego juego) {
        ejecutar(jugador, juego);
    }

    @Override
    public String toString() {
        return "Monstruo[" + "nivel=" + nivel + ", recompensaNiveles=" + recompensaNiveles + ", recompensaTesoro=" + recompensaTesoro + ']';
    }
    
    
    
}
