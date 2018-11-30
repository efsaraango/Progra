/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_17;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class PruebaPerfilMedico {
    public static void main(String[] args) {
        String nombre, apellido, sexo;
        int anio, mes, dia;
        float altura, peso;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = teclado.nextLine();
        System.out.println("Ingrese sexo masculino o femenino");
        sexo = teclado.nextLine();
        System.out.println("Ingrese el año de nacimiento");
        anio = teclado.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        mes = teclado.nextInt();
        System.out.println("Ingrese el dia de nacimiento");
        dia = teclado.nextInt();
        System.out.println("Ingrese su altura en centímetros");
        altura = teclado.nextFloat();
        System.out.println("Ingrese su peso en Kilogramos");
        peso = teclado.nextFloat();
        PerfilMedico perfilMedico = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);
        System.out.println("*-*-*    DATOS DE PACIENTE    *-*-*");
        System.out.println("Nombre: " + perfilMedico.getNombre() + ", Apellido: " + perfilMedico.getApellido() + ", Sexo: "
                + perfilMedico.getSexo() + ", Fecha Nac. " + perfilMedico.getDia_nac() + "/" + perfilMedico.getMes_nac()
                + "/" + perfilMedico.getAnio_nac() + ", Estatura(cm): " + perfilMedico.getEstatura() + ", Peso(Kg): "
                + perfilMedico.getPeso());
        System.out.println("Su edad en años es: " + perfilMedico.Calcular_edad());
        System.out.println("Su frecuencia cardiaca máxima es :" + perfilMedico.Frecuancia_Maxima());
        System.out.println("Su rango cardiaco esperado esta entre :" + perfilMedico.Rango_cardiaco());
        System.out.println("Su BMI es: " + perfilMedico.Masa_Corporal());
        perfilMedico.Tabla_BMI();
        
    }
}
