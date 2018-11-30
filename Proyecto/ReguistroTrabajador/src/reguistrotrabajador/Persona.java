
package reguistrotrabajador;

/**
 *
 * @author SARANGO
 */
public abstract  class  Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int cedula;
    protected int horasTrabajo ;

    public Persona(String nombre, String apellido,int edad, int cedula, int horasTrabajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.horasTrabajo = horasTrabajo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public int getCedula() {
        return cedula;
    }
    public int getHorasTrabajo() {
        return horasTrabajo;
    }  
    public abstract double CostoSeguro(); 
    public abstract double Sueldo();
    
    public String toString(){
    return String.format("Nombre: %s\t Apellido: %s\nEdad: %d\nCedula: %d\n"
                            , nombre, apellido, edad, cedula);
    }
}
