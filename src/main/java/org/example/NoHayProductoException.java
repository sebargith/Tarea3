package org.example;

/**
 * Clase que crea la excepcion personalizada NoHayProductoException, lanza cuando no quedan productos o no existen
 * */
public class NoHayProductoException extends Exception{
    /** Constructor con el super que permite la herencia*/
    public NoHayProductoException(String productoinvalido){
        super(productoinvalido);
    }
}