/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_15;

/**
 *
 * @author SARANGO
 */
public class Fecha {
    
    //Variables de Instancia
    public int mes;
    public int dia;
    public int anio;
    //  Constructor para inicializar cada variable de instancia inicializada
    public Fecha(int dia, int mes, int anio) {
        //Verifica que el mes sea correcto.
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
           
        }
        //Verifica que el dia sea correcto.
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        }
        //Verifica que el año sea correcto.
        if (anio > 0) {
            this.anio = anio;
        }
    }
//Obtiene el mes 
    public int getMes() {
        return mes;
    }
//Establece el mes
    public void setMes(int mes) {
        this.mes = mes;
    }
//Obtiene el dia 
    public int getDia() {
        return dia;
    }
//Establece el dia 
    public void setDia(int dia) {
        this.dia = dia;
    }
//Obtiene el año 
    public int getAnio() {
        return anio;
    }
//Establece el año
    public void setAnio(int anio) {
        this.anio = anio;
    }
//muestra la fecha separada por barras diagonales
    public String toString() {
        return String.format("%d / %d /%d ", dia, mes, anio);
    }
   
}