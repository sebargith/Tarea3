package org.example;

import java.util.ArrayList;

/**
 * Almacena productos, pueden ser bebidas o dulces
 * */
class Deposito<T>{
    /** Parametro que declara un arreglo al*/
    private ArrayList<T> al ;

    /** Constructor que crea el arreglo de productos*/
    public Deposito(){
        al = new ArrayList<T>();
    }

    /** Agrega productos al arreglo
     * @param producto de tipo generico, usado para almacenar elementos productos
     * */
    public void addProducto(T producto){
        al.add(producto);
    }

    /** Saca productos del arreglo
     * @return remueve el primero elemento del arreglo si los hay
     * */
    public T getProducto(){
        if( al.size() != 0){
            return al.remove(0);
        }else{
            return null;
        }
    }
}