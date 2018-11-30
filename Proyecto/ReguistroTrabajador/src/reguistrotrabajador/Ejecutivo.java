/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reguistrotrabajador;

/**
 *
 * @author SARANGO
 */
public class Ejecutivo extends Persona{
    private double costoHora = 2.80;
    
    

    public Ejecutivo( String nombre, String apellido,int edad, int cedula, int horasTrabajo) {
        super(nombre, apellido, edad, cedula, horasTrabajo);
        this.costoHora = costoHora;
        
    }

    public double getCostoHora() {
        return costoHora;
    }

    public double Sueldo(){
        double sueldofin;
        if (horasTrabajo<=240) 
            sueldofin= 500.00;          
        else
            sueldofin = costoHora*horasTrabajo;
        return sueldofin;
       
    }
    public double CostoSeguro(){
        return Sueldo()*0.30;
    
    }
    
    public String toString(){
    return String.format("----------REPORTE EJECUTIVO----------\n%sSu sueldo es de: %.2f$\nValor a descontar de seguros: %.2f"
                                                                        , super.toString(),Sueldo(),CostoSeguro());
    }
    
}
