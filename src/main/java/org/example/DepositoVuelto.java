package org.example;

import java.util.ArrayList;

/**
 * Almacena monedas para el vuelto
 * */
class DepositoVuelto<T>{
    /** Parametro que declara un arreglo alm*/
    private ArrayList<T> alm ;

    /** Constructor que crea un arreglo con monedas para el vuelto*/
    public DepositoVuelto(){
        alm = new ArrayList<T>();
    }

    /** Metodo que agrega monedas al deposito
     * @param moneda de tipo generico, recibe monedas para ser almacenadas
     * */
    public void addMoneda(T moneda){
        alm.add(moneda);
    }

    /** Metodo que saca monedas del deposito
     * @return retorna la primera moneda del arreglo, si las hay
     * */
    public T getMoneda(){
        if( alm.size() != 0){
            return alm.remove(0);
        }else{
            return null;
        }
    }
}