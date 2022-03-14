/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author Alvaro Rame
 * 
 * clase donde definiremos los movimientos y la creación del tablero.
 */
public class Tablero {
    Pieza tablero [][]=new Pieza[8][8];
    private int elTurno;//0-->Blancas, 1-->Negras
    /**
     *Metodo que crea un tablero estándar de ajedrez
     */
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
    /**
     * Metodo que nos imprime por pantalla el estado actual del tablero
     */
    public void pintarTablero(){
        for (int i = tablero.length-1; i >=0; i--) {
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
    /**
     * Metodo que nos dice si hay una pieza en una casilla concreta del tablero
     * @param fila
     * @param columna
     * @return boolean
     */
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
    /**
     * Metodo que nos permite poner una pieza en una casilla concreta.
     * @param filaini
     * @param colini
     * @param filafin
     * @param colfin 
     */
    public void ponPieza(int filaini, int colini, int filafin, int colfin){//movimiento
        tablero[filafin][colfin]= tablero[filaini][colini];
    }

    public void ponPieza (Pieza figura,int fila, int col ){
        tablero[fila][col]= figura;
    }
    public void ponPieza(Pieza figura, Posicion pos){
        ponPieza(figura, pos.getFila(), pos.getColumna());
    }
    /**
     * Metodo que nos permite retirar una pieza del tablero.
     * @param filaini
     * @param colini 
     */
    public void quitaPieza(int filaini, int colini){
        tablero[filaini][colini]=null;
    }
    public void quitaPieza(Posicion pos){
    }
    /**
     * Metodo que nos permite ver la pieza que hay en una posición concreta
     * @param fila
     * @param columna
     * @return pieza concreta
     */
    public Pieza DevuelvePieza(int fila, int columna){
        return tablero[fila][columna];
    }

    public int getTurno(){
        return elTurno;
    }
    /**
     * Nos permite dar dos valores distintos al turno en función de su valor actual.
     */
    public void SetTurno(){
        if (elTurno==0){
            elTurno=1;
        }else
            elTurno=0;
    }
    /**
     * Metodo que nos "canta" de quién es el turno.
     * @param elTurno 
     */
    public void elTurno(int elTurno){
        if (elTurno==0){
            this.elTurno=0;
                System.out.println("Mueven Blancas");
            } else {
            this.elTurno=1;
                System.out.println("Mueven Negras");
            }
    }
    /**
     * Metodo que nos sirve para checkear algunas de las restricciones básicas del juego a la hora de mover las pieza y que a su vez llama a los métodos de las piezas en concreto para checkear todo.
     * @param filaini
     * @param colini
     * @param filafin
     * @param colfin
     * @return boolean
     */
    public boolean validarMovimiento(int filaini, int colini, int filafin, int colfin){
        boolean check = false;
        if(colini>7 || filaini >7 || colfin>7 || filafin>7){
            System.out.println("Quizás deberías elegir una de las posiciones del tablero y no fuera de este =P");
        }else if (tablero[filaini][colini]!=null && colini==colfin && filaini==filafin){
            System.out.println("Está intentando dejar la pieza en el mismo lugar!!!");
        }else if (tablero[filaini][colini]!=null && elTurno==0 && (tablero[filafin][colfin]==null || "Negra".equals(tablero[filafin][colfin].getColor())) ){
            switch(tablero[filaini][colini].getNombre()){
                case "\u2654":
                case "\u2655":
                case "\u2656":
                case "\u2657":
                case "\u2658":
                case "\u2659":
                    if((tablero[filaini][colini].validoMovimientoPieza(filaini, colini, filafin, colfin,tablero))==false){
                        System.out.println("No es posible realizar ese movimiento con "+tablero[filaini][colini].getNombre());
                    }else{
                        check=true;
                    }
                    break;
                case "\u265A":
                case "\u265B":
                case "\u265C":
                case "\u265D":
                case "\u265E":
                case "\u265F":
                    System.out.println("Esa pieza es negra, no puedes moverla");
                    break;
           }
            }else if (tablero[filaini][colini]!=null && elTurno==1 && (tablero[filafin][colfin]==null || "Blanca".equals(tablero[filafin][colfin].getColor())) ){
                switch(tablero[filaini][colini].getNombre()){
                    case "\u265A":
                    case "\u265B":
                    case "\u265C":
                    case "\u265D":
                    case "\u265E":
                    case "\u265F":
                        if((tablero[filaini][colini].validoMovimientoPieza(filaini, colini, filafin, colfin,tablero))==false){
                            System.out.println("No es posible realizar ese movimiento con "+tablero[filaini][colini].getNombre());
                        }else{
                            check=true;
                        }
                        break;
                    case "\u2654":
                    case "\u2655":
                    case "\u2656":
                    case "\u2657":
                    case "\u2658":
                    case "\u2659":
                        System.out.println("Esa pieza es blanca no puedes moverla");
                        break;
            }
                }else{
                    System.out.println("No es posible realizar ese movimiento");
        }
        return check; 
    }
    /**
     * Metodo que nos dice si el rey ha sido comido y por lo tanto acaba la partida.
     * @param filafin
     * @param colfin
     * @return boolean
     */   
    public boolean mate(int filafin, int colfin){
        boolean mate=false;
        if(tablero[filafin][colfin].getNombre()=="\u2654"){
                    System.out.println("Jaque Mate, las negras ganan!!!");
                    mate=true;
                }else if (tablero[filafin][colfin].getNombre()=="\u265A"){
                    System.out.println("Jaque Mate, las blancas ganan!!!");
                    mate=true;
                    }
        return mate;
    }
}
