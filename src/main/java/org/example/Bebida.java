package org.example;
/**
 * Clase Bebida que hereda de Producto
 * */
abstract class Bebida extends Producto{
    /** Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie de la bebida (int)
     * */
    public Bebida(int serie){
        super(serie);
    }
}


/**
 * Clase Sprite que hereda de Bebida
 * */
class Sprite extends Bebida {
    /**
     * Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie de la bebida (int)
     */
    public Sprite(int serie) {
        super(serie);
    }

    /** Metodo que retorna una bebida de tipo Sprite
     * @return retorna una bebida de tipo Sprite
     * */
    public String getName(){
        return "Sprite";
    }
}


/**
 * Clase CocaCola que hereda de Bebida
 * */
class CocaCola extends Bebida{
    /** Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie de la bebida (int)
     * */

    public CocaCola(int serie){
        super(serie);
    }

    /** Metodo que retorna una bebida de tipo Coca cola
     * @return retorna una bebida de tipo Coca-Cola
     * */

    public String getName(){
        return "Coca-Cola";
    }
}