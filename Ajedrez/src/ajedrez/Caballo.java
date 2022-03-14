/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 * Clase hija de Pieza sin atributos adicionales.
 * @author Alvaro Rame
 */
public class Caballo extends Pieza {
    /**
     * Metodo para construir un caballo
     * @param color
     * @param nombre 
     */
    public Caballo (String color, String nombre){
        super(color,nombre);
    }
    /**
     * Metodo para validar los movimientos de los caballos.
     * @param filaini
     * @param colini
     * @param filafin
     * @param colfin
     * @param tablero
     * @return 
     */
    @Override
    public boolean validoMovimientoPieza(int filaini, int colini, int filafin, int colfin, Pieza[][]tablero){
        boolean check=false;
        if( ((colini-colfin==2) || (colini-colfin==-2)) && ((filaini-filafin==1) || (filaini-filafin==-1))  ){
            check=true;
        }else if(((colini-colfin==1) || (colini-colfin==-1)) && ((filaini-filafin==2) || (filaini-filafin==-2)) ){
            check=true;
        }
        return check;
    }
}
