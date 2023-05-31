package org.example;
/**
 * Clase Dulce que hereda de Producto
 * */
abstract class Dulce extends Producto{
    /** Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie del dulce (int)
     * */
    public Dulce(int serie){
        super(serie);
    }
}


/**
 * Clase Snickers que hereda de Dulce
 * */
class Snickers extends Dulce{
    /** Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie del dulce (int)
     * */
    public Snickers(int serie){
        super(serie);
    }

    /** Metodo que retorna un dulce de tipo Snickers
     * @return retorna un dulce del tipo Snickers
     * */
    public String getName(){
        return "Snickers";
    }
}

/**
 * Clase Super8 que hereda de Dulce
 * */
class Super8 extends Dulce{
    /** Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie del dulce (int)
     * */
    public Super8(int serie){
        super(serie);
    }

    /** Metodo que retorna un dulce de tipo Super 8
     * @return retorna un dulce del tipo Super 8
     * */
    public String getName(){
        return "Super 8";
    }
}