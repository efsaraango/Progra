/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_17;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author SARANGO
 */
public class PerfilMedico {
 String nombre;
    String apellido;
    String sexo;
    int dia_nac;
    int mes_nac;
    int anio_nac;
    float estatura;
    float peso;
    
    public PerfilMedico(String nombre, String apellido, String sexo, int dia_nac, int mes_nac, int anio_nac, float estatura, float peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia_nac = dia_nac;
        this.mes_nac = mes_nac;
        this.anio_nac = anio_nac;
        this.estatura = estatura;
        this.peso = peso;
    }
    public float Calcular_edad() {
        Calendar fecha = new GregorianCalendar();
        float edad_anios = (fecha.get(Calendar.YEAR) - anio_nac) + ((fecha.get(Calendar.MONTH) - mes_nac) / 12) + (fecha.get(Calendar.DAY_OF_MONTH) - dia_nac) / 365;
        return edad_anios;
    }
    public float Frecuancia_Maxima() {
        float cardiaca_maxima = 220 - Calcular_edad();
        return cardiaca_maxima;
    }
    public String Rango_cardiaco() {
        float min = Frecuancia_Maxima() / 2;
        float max = (Frecuancia_Maxima() * 85) / 100;
        return +min + " , " + max; 
    }
    public float Masa_Corporal() {
        float BMI = peso / ((estatura / 100) * (estatura / 100));
        return BMI;
    }
    public void Tabla_BMI() {
        System.out.println(".............................");
        System.out.println("    VALORES DE BMI       ");
        System.out.println("BAJO PESO= menos de 18.5");
        System.out.println("NORMAL   = entre 18.5 y 24.9");
        System.out.println("SOBREPESO= entre 25 y 29.9");
        System.out.println("OBESO    = 30 o más");
        System.out.println(".............................");
    }
  
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getDia_nac() {
        return dia_nac;
    }
    public void setDia_nac(int dia_nac) {
        this.dia_nac = dia_nac;
    }
    public int getMes_nac() {
        return mes_nac;
    }
    public void setMes_nac(int mes_nac) {
        this.mes_nac = mes_nac;
    }
    public int getAnio_nac() {
        return anio_nac;
    }
    public void setAnio_nac(int anio_nac) {
        this.anio_nac = anio_nac;
    }
    public float getEstatura() {
        return estatura;
    }
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
}
