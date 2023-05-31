package org.example;

/**
 * Clase que crea la excepcion personalizada PagoInsuficienteException, lanza cuando el pago es insuficiente para el producto seleccionado
 * */
public class PagoInsuficienteException extends Exception{
    /** Constructor con el super que permite la herencia*/
    public PagoInsuficienteException(String pagoinsuf){
        super(pagoinsuf);
    }
}