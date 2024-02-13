package kass.concurrente.modelo.producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que modela un platillo
 * @author Kassandra Mirael
 */
public class Platillo implements Pedido {

    /**
     * Nombre del platillo
     */
    private String nombre;

    /**
     * Tiempo de coccion del platillo
     */
    private Integer tiempoCoccion;

    /**
     * Lista de productos del platillo
     */
    private List<Producto> productos;

    /**
     * Constructor de la clase Platillo que inicializa los atributos con un valor default.
     */
    public Platillo() {
        nombre = "Sin nombre";
        tiempoCoccion = 0;
        productos = new ArrayList<>();
    }

    /**
     * Constructor de la clase Platillo sin productos y con precio base 0.0
     * @param nombre Nombre del platillo
     * @param tiempoCoccion Tiempo de coccion del platillo
     */
    public Platillo(String nombre, Integer tiempoCoccion) {
        this.nombre = nombre;
        this.tiempoCoccion = tiempoCoccion;
        productos = new ArrayList<>();
    }

    /**
     * Constructor de la clase Platillo
     * @param nombre Nombre del platillo
     * @param precioBase Precio base del platillo
     * @param tiempoCoccion Tiempo de coccion del platillo
     * @param productos Productos del platillo
     */
    public Platillo(List<Producto> productos, Integer tiempoCoccion, String nombre) {

        this.nombre = nombre;
        this.tiempoCoccion = tiempoCoccion;
        this.productos = productos;

    }

    /**
     * Metodo que agrega un nuevo producto al platillo
     * @param producto El producto a agregar
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Este metodo calcula el precio sobre el precio de los items, se ignora
     * el precio base
     * @return El precio de la suma de cada item utilizado
     */
    @Override 
    public double calculaPrecio(){
        double precio = 0;
        for(Producto producto : productos) {
            precio += producto.getPrecio();
        }
        return precio;
    }

    /**
     * Metodo para obtener el nombre del platillo
     * @return El nombre del platillo
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para cambiar el nombre del platillo
     * @param nombre El nuevo nombre del platillo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el tiempo de coccion del platillo
     * @return El tiempo de coccion del platillo
     */
    @Override
    public Integer getTiempoCoccion() {
        return tiempoCoccion;
    }

    /**
     * Metodo para cambiar el tiempo de coccion del platillo
     * @param tiempoCoccion El nuevo tiempo de coccion del platillo
     */
    public void setTiempoCoccion(Integer tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    /**
     * Metodo que obtiene la lista de productos requeridos para el platillo
     * @return La lista de productos requeridos para el platillo
     */
    @Override
    public List<Producto> getProductosRequeridos() {
        return productos;
    }
    
}
