package kass.concurrente.modelo.producto;

/**
 * Clase que modela un producto de un inventario
 * @author Kassandra Mirael
 */
public class ProductoInventario extends Producto{
    
    /**
     * Cantidad de producto existente
     */
    private Integer cantidad;

    /**
     * Constructor de la clase ProductoInventario con cantidad default de 0
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     */
    public ProductoInventario(String nombre, double precio) {
        super(nombre, precio);
        cantidad = 0;
    }

    /**
     * Constructor de la clase ProductoInventario con cantidad default de 0
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param cantidad Cantidad de producto existente
     */
    public ProductoInventario(String nombre, double precio, Integer cantidad) {
        super(nombre, precio);
        this.cantidad = cantidad;
    }

    /**
     * Metodo para obtener la cantidad de producto existente
     * @return La cantidad de producto existente
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Metodo para aumentar la cantidad de producto existente
     * @param cantidad La cantidad de producto que sera agregada
     */
    public void aumentarCantidad(Integer cantidad) throws InterruptedException {
        Thread.sleep(1000 * 2L);
        this.cantidad += cantidad;
    }

    /**
     * Metodo que simula el uso de un producto disminuyendo la cantidad en 1. 
     * Si ya no hay producto se aumenta la cantidad en 10 unidades previamente.
     */
    public void usarProducto() throws InterruptedException {
        if(cantidad == 0) 
            aumentarCantidad(10);
        cantidad -= 1;
    }

}
