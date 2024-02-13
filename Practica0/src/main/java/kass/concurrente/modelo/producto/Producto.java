package kass.concurrente.modelo.producto;

/**
 * Clase que modela un producto
 * @author Kassandra Mirael
 */
public class Producto {
    
    /**
     * Nombre del producto
     */
    private String nombre;

    /**
     * Precio del producto
     */
    private double precio;


    /**
     * Constructor de la clase Producto con valores default
     */
    public Producto() {
        nombre = "Sin nombre";
        precio = 0.;
    }

    /**
     * Constructor de la clase Producto
     * @param nombre Nombre del platillo
     * @param tiempoCoccion Tiempo de coccion del platillo
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Metodo para obtener el nombre del producto
     * @return El nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para cambiar el nombre del producto
     * @param nombre El nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el precio del producto
     * @return El precio del producto
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Metodo para cmbiar el precio del producto
     * @param precio El nuevo precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
