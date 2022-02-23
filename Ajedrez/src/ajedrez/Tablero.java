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
        tablero[0][0]=new Torre("Blanca");
        tablero[0][1]=new Caballo("Blanca");
        tablero[0][2]=new Alfil("Blanca");
        tablero[0][3]=new Reina("Blanca");
        tablero[0][4]=new Rey("Blanca");
        tablero[0][5]=new Alfil("Blanca");
        tablero[0][6]=new Caballo("Blanca");
        tablero[0][7]=new Torre("Blanca");
        tablero[1][0]=new Peon("Blanca");
        tablero[1][1]=new Peon("Blanca");
        tablero[1][2]=new Peon("Blanca");
        tablero[1][3]=new Peon("Blanca");
        tablero[1][4]=new Peon("Blanca");
        tablero[1][5]=new Peon("Blanca");
        tablero[1][6]=new Peon("Blanca");
        tablero[1][7]=new Peon("Blanca");
        tablero[7][0]=new Torre("Negra");
        tablero[7][1]=new Caballo("Negra");
        tablero[7][2]=new Alfil("Negra");
        tablero[7][3]=new Reina("Negra");
        tablero[7][4]=new Rey("Negra");
        tablero[7][5]=new Alfil("Negra");
        tablero[7][6]=new Caballo("Negra");
        tablero[7][7]=new Torre("Negra");
        tablero[6][0]=new Peon("Negra");
        tablero[6][1]=new Peon("Negra");
        tablero[6][2]=new Peon("Negra");
        tablero[6][3]=new Peon("Negra");
        tablero[6][4]=new Peon("Negra");
        tablero[6][5]=new Peon("Negra");
        tablero[6][6]=new Peon("Negra");
        tablero[6][7]=new Peon("Negra");
    }
    public void pintarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if(tablero[i][j]==null){
                    System.out.print("  ");
                }else if(j==8){
                    System.out.print(tablero[i][j].getNombre());
                    }else{
                        System.out.print(tablero[i][j].getNombre()+" ");
                    }
            }
            System.out.println();
        }
    }
    public boolean hayPieza(int fila, int columna){
        return true;
    }
    public boolean hayPieza(Posicion pos){
        return true;
    }
    public boolean hayPiezasEntre(Movimiento mov){
        return true;
    }
    public void ponPieza(Pieza figura, int fila, int columna){
    }
    public void ponPieza(Pieza figura, Posicion pos){
    }
    public void quitaPieza(int fila, int columna){
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
