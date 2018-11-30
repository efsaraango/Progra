/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_15;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class PruebaFecha {
    
    //metodo main
    public static void main(String[] args) {
         //Variables de Instancia
        int dias,meses,anios;
        //Creacion de objeto
        Scanner teclado = new Scanner(System.in);
        //lectura de valores por teclado
        System.out.println("Ingrese dia:");
        dias=teclado.nextInt();
        System.out.println("Ingrese mes:");
        meses=teclado.nextInt();
        System.out.println("Ingrese año:");
        anios=teclado.nextInt();
        Fecha ObjFecha = new Fecha(dias,meses,anios); 
        //Se llama a toString para presentar los valores del objeto
        System.out.println("La fecha ingresada es: "+ObjFecha.toString());
    
}
}