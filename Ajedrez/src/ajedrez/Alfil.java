/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 * Clase hija de Pieza sin atributos adicionales
 * @author Alvaro Rame
 */
public class Alfil extends Pieza {
    /**
     * Metodo para crear un Alfil
     * @param color
     * @param nombre 
     */
    public Alfil (String color, String nombre){
        super(color,nombre);
    }
    /**
     * Metodo para validar los  movimientos de los alfiles.
     * @param filaini
     * @param colini
     * @param filafin
     * @param colfin
     * @param tablero
     * @return 
     */
    @Override
    public boolean validoMovimientoPieza(int filaini, int colini, int filafin, int colfin, Pieza[][]tablero){
        boolean check=true;
        if ( (colini-colfin)!=(filaini-filafin) && (colini-colfin)!=(filafin-filaini) ){
            check=false;
        }else if(colfin<colini){
                if(filafin<filaini){
                   for (int i = filaini+1, j=colini+1; i < filafin; i++,j++) {
                        if (tablero[i][j]!=null){
                            check=false;
                        }
                  } 
                }else{// filafin>filaini
                    for (int i = filaini-1, j=colini+1; i> filafin; i--,j++) {
                        if (tablero[i][j]!=null){
                            check=false;
                        }
                    }
                }
            }else if(filafin<filaini){//colfin>colini
                    for (int i = filaini+1, j=colini-1; i < filafin; i++,j--) {
                        if (tablero[i][j]!=null){
                            check=false;
                        }
                    } 
                }else{// filafin>filaini
                    for (int i = filaini-1, j=colini-1; i > filafin; i--,j--) {
                        if (tablero[i][j]!=null){
                            check=false;
                        }
                    } 
                }
        return check;
    }
}
