package kass.concurrente;

import java.util.ArrayList;

import kass.concurrente.modelo.cuchillo.Cuchillo;
import kass.concurrente.modelo.cuchillo.CuchilloAfilado;
import kass.concurrente.modelo.cuchillo.CuchilloEspecial;
import kass.concurrente.modelo.persona.Chef;
import kass.concurrente.modelo.persona.Persona;
import kass.concurrente.modelo.producto.AdapterPedido;
import kass.concurrente.modelo.producto.Platillo;
import kass.concurrente.modelo.producto.Producto;
import kass.concurrente.modelo.producto.ProductoInventario;

/**
 * Clase Main
 * Aqui va toda tu simulacion
 * Genera un par de clientes para que los atienda el chef
 * @author Kassandra Mirael
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        int total = 0;

        Cuchillo cuchillo = new CuchilloAfilado();
        Chef chef = new Chef("Manuel", 10, cuchillo);

        Persona cliente1 = new Persona("Andrea");
        Persona cliente2 = new Persona("Rafa");
        Persona cliente3 = new Persona("Ana");

        ProductoInventario p1 = new ProductoInventario("Pollo", 30., 1);
        ProductoInventario p2 = new ProductoInventario("Espinacas", 2., 2);
        ProductoInventario p3 = new ProductoInventario("Limon", 1, 5);
        Producto p4 = new Producto("Pescado", 40.);

        ArrayList<Producto> l1 = new ArrayList<>();
        l1.add(p1);
        l1.add(p2);
        Platillo pl1 = new Platillo(l1, 10, "Pollo con espinacas");
        pl1.agregarProducto(p3);

        total += pl1.calculaPrecio();
        chef.prepararPedido(pl1, cliente1);


        cuchillo = new CuchilloEspecial();
        chef.setCuchillo(cuchillo);

        ArrayList<Producto> l2 = new ArrayList<>();
        l1.add(p4);
        Platillo pl2 = new Platillo(l2, 13, "Pescado a la plancha");
        pl2.agregarProducto(p3);

        total += pl2.calculaPrecio();
        chef.prepararPedido(pl2, cliente2);

        AdapterPedido ap1 = new AdapterPedido(p1);

        total += ap1.calculaPrecio();
        chef.prepararPedido(ap1, cliente3);

        System.out.println("------- CERRRADO --------");
        System.out.println("Ganancia total del dia: $" + total + "\n");
        System.out.println("------- INVENTARIO ------");
        System.out.println(p1.getNombre() + ": " + p1.getCantidad());
        System.out.println(p2.getNombre() + ": " + p2.getCantidad());
        System.out.println(p3.getNombre() + ": " + p3.getCantidad());

    }
}