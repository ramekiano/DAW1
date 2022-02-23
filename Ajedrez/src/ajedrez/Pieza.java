/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author Alvaro Rame
 */
public abstract class Pieza {
    private String color;
    private String nombre;

    public Pieza(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }
    public abstract boolean validoMovimiento(Movimiento mov);
    
    public void pintarPieza(){
        switch(nombre){
            case "Torre":
                if (color.equalsIgnoreCase("negra")){
                    System.out.print("\u2656");
                }
            case "Caballo":
            case "Alfil":
            case "Reina":
            case "Rey":
            case "Peon":
                
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Pieza{" + "color=" + color + ", nombre=" + nombre + '}';
    }
    
}
