package kass.concurrente.modelo.producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que modela el pedido de un producto
 * @author Illescas Coria Janet
 */
public class AdapterPedido implements Pedido {

    /**
     * Nombre del producto
     */
    private Producto producto;

    /**
     * Constructor de la clase AdapterPedido
     * @param producto El producto pedido
     */
    public AdapterPedido(Producto producto) {
        this.producto = producto;
    }

    /**
     * Metodo para obtener el nombre del producto pedido
     * @return El nombre del producto pedido
     */
    @Override
    public String getNombre() {
        return producto.getNombre();
    }

    /**
     * Este metodo calcula el precio del pedido
     * @return El precio del producto
     */
    @Override 
    public double calculaPrecio(){
        return producto.getPrecio();
    }

    /**
     * Metodo para obtener el tiempo de coccion del platillo
     * @return Al no tratarse de un platillo se regresa 0
     */
    @Override
    public Integer getTiempoCoccion() {
        return 0;
    }

    /**
     * Metodo que obtiene la lista de productos requeridos para el platillo
     * @return La lista de productos requeridos para el platillo
     */
    @Override
    public List<Producto> getProductosRequeridos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(producto);
        return productos;
    }

}