package org.example;

/**
 * Clase que crea la excepcion personalizada PagoIncorrectoException, hereda de la excepcion NullPointerException, lanza cuando la moneda es null
 * */
public class PagoIncorrectoException extends NullPointerException {
    /** Constructor con el super que permite la herencia*/
    public PagoIncorrectoException(String monedanull) {
        super(monedanull);
    }
}