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
public class Alfil extends Pieza {
    public Alfil (String color){
        super(color,"\u265D");
    }
    
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}