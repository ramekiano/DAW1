/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *Clase hija de Pieza sin atributos adicionales.
 * @author Alvaro Rame
 */
public class Peon extends Pieza {
    /**
     * Metodo para construir un peón.
     * @param color
     * @param nombre 
     */
    public Peon (String color, String nombre){
        super(color,nombre);
    }
    /**
     * Metodo para validar los movimientos de los peones.
     * @param filaini
     * @param colini
     * @param filafin
     * @param colfin
     * @param tablero
     * @return boolean
     */
    @Override
    public boolean validoMovimientoPieza(int filaini, int colini, int filafin, int colfin, Pieza[][]tablero){
        boolean check=true;
        if (colini!=colfin){
            if ((colini-colfin>1) || (colini-colfin)<-1 || tablero[filafin][colfin]==null ){
                check=false;
            }else if ("Blanca".equals(tablero[filaini][colini].getColor())){
                    if (filafin-filaini!=1){
                        check=false;
                    }
                }else{
                    if (filaini-filafin!=1){
                        check=false;
                    }
                }
        }else if ( (filaini-filafin>2) || (filaini-filafin<-2) ){//filaini!=filafin
            check=false;
            }else if (filaini-filafin==-2){
                    if("Negra".equals(tablero[filaini][colini].getColor()) || filaini!=1){
                    check=false;
                    }
                }else if (filaini-filafin==2){
                        if("Blanca".equals(tablero[filaini][colini].getColor()) || filaini!=6){
                        check=false;
                        }
                    }else if (filaini-filafin==-1){// la resta vale 1 o -1 ya que descarté el 0 en el método de validarMovimiento()
                            if("Negra".equals(tablero[filaini][colini].getColor())){
                            check=false;
                            }
                        }else{
                            if("Blanca".equals(tablero[filaini][colini].getColor())){
                            check=false;
                            }
                        }
        return check;
    }
}
