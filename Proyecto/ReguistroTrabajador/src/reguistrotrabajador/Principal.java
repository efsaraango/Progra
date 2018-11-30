/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reguistrotrabajador;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    
    static int cont =0;
    static int cont2 =0;
    
    static ArrayList<Persona> registro= new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);
    
    public static void LLenarPersonal(){
        String respuesta;
        int opcion;
        
        do {
            do {
                System.out.println("Digite\n[1]. Para Ejecutivo:\n[2]. Para Trabajador:");
                opcion=entrada.nextInt();
                entrada.nextLine();               
            } while (opcion>2 || opcion<1);
            switch(opcion){
                case 1:
                    
                    Ejecutivo();
                    cont = cont + 1;
                    break;
                case 2 : 
                    Trabajador();
                    cont2 = cont2 + 1;
                    break;
            }
            entrada.nextLine();
            System.out.println("Desea ingresar más personal: [Si] [No] ");
            respuesta=entrada.nextLine();
            
        } while (respuesta.equals("Si")||respuesta.equals("si"));
    }
 //Creacion de Ejecutivo con todas las variables.   
    public static void Ejecutivo(){
        String nombre;
        String apellido;
        int edad;
        int cedula;
        int horasTrab;
        System.out.println("Ingrese su Nombre: ");
        nombre=entrada.nextLine();
        System.out.println("Ingrese su Apellido: ");
        apellido=entrada.nextLine();
        System.out.println("Ingrese su Edad: ");
        edad=entrada.nextInt();
        System.out.println("Ingrese su Cedula: ");
        cedula=entrada.nextInt();
        System.out.println("Ingrese las horas de trabajo: ");
        horasTrab=entrada.nextInt();
 //Creacion de objeto
        Ejecutivo eje1= new Ejecutivo( nombre, apellido, edad, cedula, horasTrab);
        registro.add(eje1);    
   }
    
   public static void Trabajador(){
        String nombre;
        String apellido;
        int edad;
        int cedula;
        int horasTrab;
        System.out.println("Ingrese su Nombre: ");
        nombre=entrada.nextLine();
        System.out.println("Ingrese su Apellido: ");
        apellido=entrada.nextLine();
        System.out.println("Ingrese su Edad: ");
        edad=entrada.nextInt();
        System.out.println("Ingrese su Cedula: ");
        cedula=entrada.nextInt();
        System.out.println("Ingrese las horas de trabajo: ");
        horasTrab=entrada.nextInt();
        
 //Creacion de objeto
        Empleado emple1= new Empleado(nombre, apellido, edad, cedula, horasTrab);
        registro.add(emple1);    
   }
   
   public static void MostrarResultados(){
       
       for(Persona persona1: registro){
           System.out.println(persona1.getClass());
           System.out.print(persona1);
           System.out.println("\n---------------------------------");
       }
   }
   public static void CalcularTotPer(){
       
       System.out.println("");
       System.out.println("Numero de Ejecutivos "+ cont);
       System.out.println("Numero de Trabajadores "+ cont2);
       
   }
 
    
    public static void main(String[] args) {
       
        LLenarPersonal();
        MostrarResultados();
        CalcularTotPer();
        
    }
    
    
}
