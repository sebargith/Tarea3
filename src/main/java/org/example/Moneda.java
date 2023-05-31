package org.example;

/**
 * Clase que recibe el valor de los distintos tipos de monedas
 * */
abstract class Moneda{
    /** Parametro int que se lo llama cuando se referencia al valor de una moneda*/
    protected int valor;

    /** Constructor por defecto*/
    public Moneda(){
    }

    /** Metodo que le da serie a una moneda*/
    public Moneda getSerie(){
        return this;
    }

    /** Metodo abstracto que recibe el valor especifico de cada clase de moneda*/
    public abstract int getValor();
}


/**
 * Clase de monedas de valor 1500, hereda de moneda
 * */
class Moneda1500 extends Moneda{
    /** Constructor, le da valor a la moneda*/
    public Moneda1500(){
        valor=1500;
    }

    /** Metodo que sirve como getter para el valor de la moneda*/
    public int getValor(){
        return valor;
    }
}


/**
 * Clase de monedas de valor 1000, hereda de moneda
 * */
class Moneda1000 extends Moneda{
    /** Constructor, le da valor a la moneda*/
    public Moneda1000(){
        valor=1000;
    }

    /** Metodo que sirve como getter para el valor de la moneda*/
    public int getValor(){
        return valor;
    }
}

/**
 * Clase de monedas de valor 500, hereda de moneda
 * */
class Moneda500 extends Moneda{
    /** Constructor, le da valor a la moneda*/
    public Moneda500(){
        valor=500;
    }

    /** Metodo que sirve como getter para el valor de la moneda*/
    public int getValor(){
        return valor;
    }
}

/**
 * Clase de monedas de valor 100, hereda de moneda
 * */
class Moneda100 extends Moneda{
    /** Constructor, le da valor a la moneda*/
    public Moneda100(){
        valor=100;
    }

    /** Metodo que sirve como getter para el valor de la moneda*/
    public int getValor(){
        return valor;
    }
}