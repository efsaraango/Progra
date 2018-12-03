/*
    La clase Ejecutivo hereda de Personal y
    accede a los datos portected de la superclase, para formando objetos 

 */
package reguistrotrabajador;

/**
 *
 * @author SARANGO
 */
public class Ejecutivo extends Personal {

//Costructor con cinco elementos 
    public Ejecutivo(String nombre, String apellido, int edad, int cedula, double horasExtra) {
        super(nombre, apellido, edad, cedula, horasExtra);

    }
//Calcula Sueldo a pagar, obteniendo las horas extra de trabajo.   
    public double Sueldo() {
        double sueldofin;
        double costExtra = 3.25;

        if (horasExtra == 0) {
            sueldofin = 500.00;
        } else {
            sueldofin = (horasExtra * costExtra) + 500.00;
        }
        return sueldofin;

    }

    //Utimetodo abstract se calcula el costo del seguro a pagar obteniendo el sueldo final. 
    public double CostoSeguro() {
        return Sueldo() * 0.30;

    }
    //devuelve representación String del objeto Ejecuvito.
    @Override//indica que este método sobrescribe el método de la superclase
    public String toString() {
        return String.format("----------REPORTE EJECUTIVO----------\n%sSu sueldo es de: %.2f$\nValor a descontar de seguros: %.2f",
                 super.toString(), Sueldo(), CostoSeguro());
    }

}
