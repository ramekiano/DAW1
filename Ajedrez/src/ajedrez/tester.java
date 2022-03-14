/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alvaro Rame
 */
public class tester {

    /**
     * @param args the command line arguments
     * main tester donde se hacen todas las llamadas a los métodos para ejecutar el juego.
     */
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int filaini;
        int filafin;
        int colini;
        int colfin;
        Scanner s= new Scanner (System.in);
        Tablero tablero = new Tablero();
        boolean mate = false;
        for (int i = 0; mate==false; i++) {
            tablero.pintarTablero();
            int elTurno= tablero.getTurno();
            do{
                tablero.elTurno(elTurno);
                colini=System.in.read()-65;
                filaini= s.nextInt()-1;
                s.nextLine();
                colfin= System.in.read()-65;
                filafin= s.nextInt()-1;
            }while (tablero.validarMovimiento(filaini,colini,filafin,colfin)==false);
            if(tablero.hayPieza(filafin,colfin)==true){
                System.out.println("La "+tablero.tablero[filafin][colfin]+" ha sido comida");
                mate=tablero.mate(filafin,colfin);
                tablero.quitaPieza(filafin,colfin);
            }
            tablero.ponPieza(filaini, colini, filafin, colfin);
            tablero.quitaPieza(filaini, colini);
            tablero.SetTurno();
        }
    }
    
}
