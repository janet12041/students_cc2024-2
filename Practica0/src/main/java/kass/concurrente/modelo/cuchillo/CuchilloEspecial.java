package kass.concurrente.modelo.cuchillo;

/**
 * Clase que simula un cuchillo especial
 * @author Illescas Coria Janet
 * @version 1.0
 */
public class CuchilloEspecial implements Cuchillo{

    /**
     * Metodo que hace que cocine mas rapido al usar el cuchillo
     * basico
     * @return El tiempo que reduce al usar dicho item
     */
    @Override
    public int corta(){
        return 5;
    }

}
