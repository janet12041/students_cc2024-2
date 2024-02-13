package kass.concurrente.modelo.producto;

import java.util.List;

/**
 * Interfaz que simulara un pedido
 * @author Illescas Coria Janet
 */
public interface Pedido {

    /**
     * Metodo que calcula el precio total del pedido
     * @return El precio del platillo
     */
    public double calculaPrecio();

    /**
     * Metodo que obtiene el nombre del platillo pedido
     * @return El nombre del platillo
     */
    public String getNombre();

    /**
     * Metodo que obtiene el tiempo de coccion del platillo
     * @return El tiempo de coccion del platillo
     */
    public Integer getTiempoCoccion();

    /**
     * Metodo que obtiene la lista de productos requeridos para el platillo
     * @return La lista de productos requeridos para el platillo
     */
    public List<Producto> getProductosRequeridos();
    
}