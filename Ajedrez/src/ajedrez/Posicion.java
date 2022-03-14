/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 * Clase que serviria todos los metodos que usan fila y columna, en este caso no utilizado por no querer ser redundante.
 * @author Alvaro Rame
 */
public class Posicion {
    private int fila;
    private int columna;

    public Posicion() {
    }
    
    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Posicion{" + "fila=" + fila + ", columna=" + columna + '}';
    }

    
    
}
