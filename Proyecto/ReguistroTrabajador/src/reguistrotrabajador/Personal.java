/*
    La clase Personal se convertirá en la superclase ya que  contiene todo los atributos,
    constructor y métodos para heredar a las subclases.
*/
package reguistrotrabajador;

/**
 *
 * @author SARANGO
 */
public abstract class Personal {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int cedula;
    protected double horasExtra;

    public Personal(String nombre, String apellido, int edad, int cedula, double horasExtra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;

        this.horasExtra = horasExtra;
    }

    //Obtiene el nombre del Personal
    public String getNombre() {
        return nombre;
    }

    //Obtiene el apellido del Personal
    public String getApellido() {
        return apellido;
    }

    //Obtiene el edad del Personal
    public int getEdad() {
        return edad;
    }

    //Obtiene cedula del Personal
    public int getCedula() {
        return cedula;
    }

    //Obtiene horas estras del Personal
    public double gerHorasExtra() {
        return horasExtra;
    }
    //Creación del método abstract CostoSeguro para usar respectivamente en cada clase. 

    public abstract double CostoSeguro();
    //Creación del método abstract Sueldo para usar respectivamente en cada clase.

    public abstract double Sueldo();

    // Metodo toString   
    public String toString() {
        return String.format("Nombre: %s\t Apellido: %s\nEdad: %d\nCedula: %d\n",
                nombre, apellido, edad, cedula);
    }
}
