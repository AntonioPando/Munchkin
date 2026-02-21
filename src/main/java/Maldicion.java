/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bigpa
 */
public class Maldicion extends Carta implements IEfectoCarta{
    
    enum TipoMaldicion {
        QUITANIVELES,
        QUITATESOROS
    }
    
    protected TipoMaldicion tipo;
    protected String descripcion;
    protected int potencia;

    public Maldicion(TipoMaldicion tipo, String descripcion, int potencia, String nombre) {
        super(nombre);
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.potencia = potencia;
    }

    public TipoMaldicion getTipo() {
        return tipo;
    }

    public void setTipo(TipoMaldicion tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void aplicarEfecto(Jugador jugador, Juego juego) {
        ejecutar (jugador, juego);
    }

    @Override
    public void ejecutar(Jugador jugador, Juego juego) {
        if (this.tipo == TipoMaldicion.QUITANIVELES){
            jugador.bajarNivel(potencia);
            System.out.println("¡MALDICION!");
            System.out.println("¡Has peridido " + potencia + " niveles!");
        } else if (this.tipo == TipoMaldicion.QUITATESOROS){
            System.out.println("¡MALDICION!");
            System.out.println("Vas ha perder " + potencia + " tesoros");
            boolean intentoRobar = true;
            int quedanPorRobar = this.potencia;
            int tesorosRobados = 0;
            while (tesorosRobados < quedanPorRobar && intentoRobar == true){
                intentoRobar = jugador.removerTesoroAleatorio();
                if (intentoRobar){
                    tesorosRobados += 1;
                }
            }
        }
    }
    
    
    
    
}
