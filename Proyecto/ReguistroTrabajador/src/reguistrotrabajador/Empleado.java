/*
    La clase Empleado hereda de Personal y
    accede a los datos portected de la superclase, para formar objetos.
 */
package reguistrotrabajador;

public class Empleado extends Personal {
    
// constructor con cinco argumentos
    public Empleado(String nombre, String apellido, int edad, int cedula, double horasExtra) {
        super(nombre, apellido, edad, cedula, horasExtra);
    }

//Calcula Sueldo a pagar, obteniendo las horas extra de trabajo.   
    public double Sueldo() {
        double sueldofin;
        double costExtra = 2.50;

        if (horasExtra == 0) {
            sueldofin = 380.00;
        } else {
            sueldofin = (horasExtra * costExtra) + 380.00;
        }
        return sueldofin;

    }
//Calcula el costo del seguro a pagar obteniendo el sueldo final.    

    public double CostoSeguro() {
        return Sueldo() * 0.30;

    }
    //devuelve representación String del objeto Empleado   
    @Override//indica que este método sobrescribe el método de la superclase
    public String toString() {
        return String.format("----------REPORTE EMPLEADO----------\n%sSu sueldo es de: %.2f$\nValor a descontar de seguros: %.2f",
                 super.toString(), Sueldo(), CostoSeguro());
    }
}
