/*
 * Clase Principal donde ingresaremos los valores respectivos para crear nuevos
   objetos utilizando la superclase y las subclases.
 */
package reguistrotrabajador;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static int cont = 0;
    static int cont2 = 0;
    //Creación del Arraylist de tipo Personal

    static ArrayList<Personal> registro = new ArrayList<Personal>();
    static Scanner entrada = new Scanner(System.in);

    //Creación del método LLemarPersonal para poder interactuar con el usuario.
    public static void LLenarPersonal() {
        String respuesta;
        int opcion;

        do {
            do {
                System.out.println("Digite\n[1]. Para Ejecutivo:\n[2]. Para Trabajador:");
                opcion = entrada.nextInt();
                entrada.nextLine();
            } while (opcion > 2 || opcion < 1);
            //Selecciona opción para la creación de un objeto Ejecutivo o Trabajador.
            switch (opcion) {
                case 1:

                    Ejecutivo();
                    cont++;
                    break;
                case 2:
                    Trabajador();
                    cont2++;
                    break;
            }
            entrada.nextLine();
            System.out.println("Desea ingresar más personal: [Si] [No] ");
            respuesta = entrada.nextLine();

        } while (respuesta.equals("Si") || respuesta.equals("si"));
    }
    
    //Creacion de Ejecutivo con todas las variables.   

    public static void Ejecutivo() {
        String nombre;
        String apellido;
        int edad;
        int cedula;
        int horasExtra;
        System.out.println("Ingrese su Nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su Apellido: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su Edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese su Cedula: ");
        cedula = entrada.nextInt();
        System.out.println("Ingrese las horas de trabajo Extra: ");
        horasExtra = entrada.nextInt();
        //Creacion de objeto
        Ejecutivo eje1 = new Ejecutivo(nombre, apellido, edad, cedula, horasExtra);
        registro.add(eje1);
    }
    //Creacion de Trabajador con todas las variables. 
    public static void Trabajador() {
        String nombre;
        String apellido;
        int edad;
        int cedula;
        int horasTrab;
        System.out.println("Ingrese su Nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su Apellido: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su Edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese su Cedula: ");
        cedula = entrada.nextInt();
        System.out.println("Ingrese las horas de trabajo Extra: ");
        horasTrab = entrada.nextInt();

        //Creacion de objeto
        Empleado emple1 = new Empleado(nombre, apellido, edad, cedula, horasTrab);
        registro.add(emple1);
    }
    //Metodo para poder imprimir los valores 
    public static void MostrarResultados() {
        //Nos permite recorrer nuestro ArrayList de tipo Personal para poder mostrar los valores
        for (Personal persona1 : registro) {
            System.out.print(persona1);
            System.out.println("\n/////////////////////////////////");
        }
    }

    public static void CalcularTotPer() {
        //Se muestra las cantidad de trabajadores que hay.
        System.out.println("");
        System.out.println("Numero de Ejecutivos " + cont);
        System.out.println("Numero de Trabajadores " + cont2);

    }

    public static void main(String[] args) {
        //
        LLenarPersonal();
        MostrarResultados();
        CalcularTotPer();

    }

}
