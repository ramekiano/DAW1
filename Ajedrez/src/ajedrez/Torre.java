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
public class Torre extends Pieza {
    /**
     * metodo para construir una torre.
     * @param color
     * @param nombre 
     */
    public Torre (String color, String nombre){
        super(color,nombre);
    }
    /**
     * Metodo para validar los movimientos de las torres.
     * @param filaini
     * @param colini
     * @param filafin
     * @param colfin
     * @param tablero
     * @return 
     */
    @Override
    public boolean validoMovimientoPieza(int filaini, int colini, int filafin, int colfin, Pieza[][]tablero) {
        boolean check=true;
        if(colini!=colfin && filaini!=filafin){
            check=false;
        }else if(colini==colfin){
            if (filafin<filaini){
                int aux=filaini;
                filaini=filafin;
                filafin=aux;
            }
            for (int i = filaini+1; i < filafin && check==true; i++) {
                if (tablero[i][colini]!=null){
                    check=false;
                }
            }
            }else{//filaini=filafin
                if(colfin<colini){
                    int aux=colini;
                    colini=colfin;
                    colfin=aux;
                }
                for (int i = colini+1; i < colfin && check==true; i++) {
                    if (tablero[filaini][i]!=null){
                        check=false;
                    }
                }
            }
        return check;
    }
    
}
