/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_17;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SARANGO
 */
public class TresRaya {

    private String juego[][]= new String [3][3];
    String mensaje;

    public TresRaya() {
        mensaje="";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                juego[i][j] = "";
            }
        }
    }

    public void Jugar(String valor, int fila, int columna,int contador) {
        juego[fila][columna] = valor;
        //Scanner scanner = new Scanner(System.in);
   

        if (juego[0][0].equals("X") && juego[1][1].equals("X") && juego[2][2].equals("X")) {
            mensaje = "El ganador es el jugador 'X'";
        }
        if (juego[0][0].equals("O") && juego[1][1].equals("O") && juego[2][2].equals("O")) {
            mensaje = "El ganador es el jugador 'O'";
        }
        if (juego[0][2].equals("X") && juego[1][1].equals("X") && juego[2][0].equals("X")) {
            mensaje = "El ganador es el jugador 'X'";
        }
        if (juego[0][2].equals("O") && juego[1][1].equals("O") && juego[2][0].equals("O")) {
            mensaje = "El ganador es el jugador 'O'";
        }
        for (int i = 0; i < 3; i++) {
            if (juego[i][0].equals("X") && juego[i][1].equals("X") && juego[i][2].equals("X")) {
                mensaje = "El ganador es el jugador 'X'";
            }
            if (juego[i][0].equals("O") && juego[i][1].equals("O") && juego[i][2].equals("O")) {
                mensaje = "El ganador es el jugador 'O'";
            }
            if (juego[0][i].equals("X") && juego[1][i].equals("X") && juego[2][i].equals("X")) {
                mensaje = "El ganador es el jugador 'X'";
            }
            if (juego[0][i].equals("O") && juego[1][i].equals("O") && juego[2][i].equals("O")) {
                mensaje = "El ganador es el jugador 'O'";
            }
        }
        if(contador==9 && mensaje==""){
            mensaje = "EMPATE";
        }
        if(mensaje!=""){
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
 
}
