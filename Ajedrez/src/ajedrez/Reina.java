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
public class Reina extends Pieza {
    public Reina (String color){
        super(color,"\u265B");
    }
    
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}