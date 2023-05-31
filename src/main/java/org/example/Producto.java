package org.example;

/**
 * Clase padre de Bebida y Dulce, se la usa para llamar a estas clases
 * */
abstract class Producto{
    /** Parametro int que almacena la serie del producto*/
    private int serie;

    /** Constructor que recibe la serie del producto y lo guarda
     * @param serie recibe la serie para usarla como producto (int)
     * */
    public Producto(int serie){
        this.serie=serie;
    }

    /** Metodo que retorna la serie con un getter
     * @return retorna la serie del producto
     * */
    public int getSerie(){
        return serie;
    }

    /** Metodo abstracto que toma el nombre del producto especifico con un getter*/
    public abstract String getName();
}