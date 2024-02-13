package kass.concurrente.modelo.cuchillo;

/**
 * Clase que simula un cuchillo afilado
 * @author Illescas Coria Janet
 * @version 1.0
 */
public class CuchilloAfilado implements Cuchillo {
    
    /**
     * Metodo que hace que cocine mas rapido al usar el cuchillo
     * afilado
     * @return El tiempo que reduce al usar dicho item
     */
    @Override
    public int corta(){
        return 3;
    }

}