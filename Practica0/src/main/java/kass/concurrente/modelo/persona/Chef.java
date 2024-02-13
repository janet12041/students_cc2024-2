package kass.concurrente.modelo.persona;

import java.util.List;

import kass.concurrente.modelo.cuchillo.Cuchillo;
import kass.concurrente.modelo.producto.Pedido;
import kass.concurrente.modelo.producto.Producto;
import kass.concurrente.modelo.producto.ProductoInventario;

/**
 * Clase que simula un chef
 * @author Illescas Coria Janet
 * @version 1.0
 */
public class Chef extends Persona{
    
    /**
     * Anios de experiencia como chef
     */
    private Integer aniosExperiencia;

    /**
     * Cuchillo asignado al chef para trabajar
     */
    private Cuchillo cuchillo;

    /**
     * Constructor de la clase Chef
     * @param nombre Nombre del chef
     * @param aniosExperiencia Anios de experiencia
     * @param cuchillo Cuchillo asignado
     */
    public Chef(String nombre, Integer aniosExperiencia, Cuchillo cuchillo) {
        super(nombre);
        this.aniosExperiencia = aniosExperiencia;
        this.cuchillo = cuchillo;
    }

    /**
     * Metodo para preparar pedido de acuerdo al tiempo de coccion y cuchillo
     * del chef.
     * @param pedido Pedido que se requiere preparar
     */
    public void prepararPedido(Pedido pedido, Persona persona) throws InterruptedException {
        
        System.out.println("----- Pedido de " + persona.getNombre() + " -----");
        
        System.out.println("Recolectando productos: ");
        List<Producto> productos = pedido.getProductosRequeridos();
        for (Producto producto : productos) {
            if (producto instanceof ProductoInventario) {
                ProductoInventario productoI = (ProductoInventario)producto;
                productoI.usarProducto();
            }
            System.out.println(producto.getNombre());
        }
        System.out.println("Preparando pedido ... ");
        int tiempo = pedido.getTiempoCoccion() - cuchillo.corta();
        if(tiempo < 0)
            tiempo = 0;
        Thread.sleep(1000 * (long)tiempo);
        System.out.println("Platillo " + pedido.getNombre() + " listo\n");
    
    }

    /**
     * Metodo para obtener los anios de experiencia del chef
     * @return Los anios de experiencia del chef
     */
    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    /**
     * Metodo para modificar los anios de experiencia del chef
     * @param aniosExperiencia Anios de experiecia del chef
     */
    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    /**
     * Metodo para obtener el cuchillo del chef
     * @return El cuchillo
     */
    public Cuchillo getCuchillo() {
        return cuchillo;
    }

    /**
     * Metodo para cambiar el cuchillo asignado al chef
     * @param cuchillo El nuevo cuchillo
     */
    public void setCuchillo(Cuchillo cuchillo) {
        this.cuchillo = cuchillo;
    }

}
