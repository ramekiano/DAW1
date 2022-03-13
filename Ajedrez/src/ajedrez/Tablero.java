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
public class Tablero {
    Pieza tablero [][]=new Pieza[8][8];
    
    public Tablero(){
        tablero[0][0]=new Torre("Blanca","\u2656");
        tablero[0][1]=new Caballo("Blanca","\u2658");
        tablero[0][2]=new Alfil("Blanca","\u2657");
        tablero[0][3]=new Reina("Blanca","\u2655");
        tablero[0][4]=new Rey("Blanca","\u2654");
        tablero[0][5]=new Alfil("Blanca","\u2657");
        tablero[0][6]=new Caballo("Blanca","\u2658");
        tablero[0][7]=new Torre("Blanca","\u2656");
        tablero[1][0]=new Peon("Blanca","\u2659");
        tablero[1][1]=new Peon("Blanca","\u2659");
        tablero[1][2]=new Peon("Blanca","\u2659");
        tablero[1][3]=new Peon("Blanca","\u2659");
        tablero[1][4]=new Peon("Blanca","\u2659");
        tablero[1][5]=new Peon("Blanca","\u2659");
        tablero[1][6]=new Peon("Blanca","\u2659");
        tablero[1][7]=new Peon("Blanca","\u2659");
        tablero[7][0]=new Torre("Negra","\u265C");
        tablero[7][1]=new Caballo("Negra","\u265E");
        tablero[7][2]=new Alfil("Negra","\u265D");
        tablero[7][3]=new Reina("Negra","\u265B");
        tablero[7][4]=new Rey("Negra","\u265A");
        tablero[7][5]=new Alfil("Negra","\u265D");
        tablero[7][6]=new Caballo("Negra","\u265E");
        tablero[7][7]=new Torre("Negra","\u265C");
        tablero[6][0]=new Peon("Negra","\u265F");
        tablero[6][1]=new Peon("Negra","\u265F");
        tablero[6][2]=new Peon("Negra","\u265F");
        tablero[6][3]=new Peon("Negra","\u265F");
        tablero[6][4]=new Peon("Negra","\u265F");
        tablero[6][5]=new Peon("Negra","\u265F");
        tablero[6][6]=new Peon("Negra","\u265F");
        tablero[6][7]=new Peon("Negra","\u265F");
    }
    public void pintarTablero(){
        for (int i = tablero.length-1; i >=0; i--) {
           // System.out.println("\u23AF \u23AF \u23AF \u23AF \u23AF \u23AF \u23AF \u26D9 \u26D9");
            for (int j = 0; j < tablero.length; j++) {
                if(tablero[i][j]==null){
                    System.out.print("\u3000");
                }else {
                    System.out.print(tablero[i][j].getNombre());
                    }
            }
            System.out.println();
        }
    }
    public boolean hayPieza(int fila, int columna){
        boolean haypieza = false;
        if (tablero[fila][columna]!=null){
            haypieza=true;
        }
        return haypieza;
    }
    public boolean hayPieza(Posicion pos){
        return true;
    }
    public boolean hayPiezasEntre(Movimiento mov){
        return true;
    }
    public void ponPieza(int filaini, int colini, int filafin, int colfin){//movimiento
        tablero[filafin][colfin]= tablero[filaini][colini];
    }
    public void ponPieza (Pieza figura,int fila, int col ){
        tablero[fila][col]= figura;
    }
    public void ponPieza(Pieza figura, Posicion pos){
        ponPieza(figura, pos.getFila(), pos.getColumna());
    }
    public void quitaPieza(int filaini, int colini){
        tablero[filaini][colini]=null;
    }
    public void quitaPieza(Posicion pos){
    }
    public Pieza DevuelvePieza(int fila, int columna){
        return tablero[fila][columna];
    }
    /*public Pieza DevuelvePieza(Posicion pos){
        return 
    }*/
}
