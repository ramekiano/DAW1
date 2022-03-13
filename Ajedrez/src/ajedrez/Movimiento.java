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
public class Movimiento {
    private Posicion posInicial;
    private Posicion posFinal;

    public Movimiento() {
    }

    public Movimiento(int filaini,int colini,int filafin,int colfin) {
    }
    
    public boolean isVertical(){
        return true;
    }
    public boolean isHorizontal(){
        return true;
    }
    public boolean isDiagonal(){
        return true;
    }
    
    public int saltoVertical(){
        return 3;
    }
    public int saltoHorizontal(){
        return 3;
    }
}
