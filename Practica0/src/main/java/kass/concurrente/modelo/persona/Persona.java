package kass.concurrente.modelo.persona;

/**
 * Clase que modela una persona
 * @author Kassandra Mirael
 */
public class Persona {

    /**
     * Nombre de la persona
     */
    protected String nombre;

    /**
     * Constructor de la clase Persona
     * @param nombre getNombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el nombre de la persona
     * @return El nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar el nombre de la persona
     * @param nombre Nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
