/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 * Clase padre y abstracta, usada para crear el array de piezas del tablero.
 * @author Alvaro Rame
 */
public abstract class Pieza {
    private String color;
    private String nombre;
    /**
     * Metodo usado para crear piezas.
     * @param color
     * @param nombre 
     */
    public Pieza(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }
    /**
     * Metodo abstracto para que las hijas validen movimientos.
     * @param filaini
     * @param colini
     * @param filafin
     * @param colfin
     * @param tablero
     * @return 
     */
    public abstract boolean validoMovimientoPieza(int filaini, int colini, int filafin, int colfin, Pieza[][] tablero);

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Pieza{" + nombre + color + '}';
    }
    
}
