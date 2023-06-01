package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositoTest {


    @Test
    @DisplayName("Test agregar una bebida de cada una")
    public void testaddBebida(){
        System.out.println("AgregaBebidasAlDeposito");
        Deposito<Bebida> deposito = new Deposito<>();
        CocaCola cocaCola = new CocaCola(1);
        Sprite sprite = new Sprite(2);

        deposito.addProducto(cocaCola);  //agrega productos
        deposito.addProducto(sprite);

        assertEquals(cocaCola, deposito.getProducto());  //compara si lo que se saca es lo que agrego
        assertEquals(sprite, deposito.getProducto());
    }

    @Test
    @DisplayName("Test agregar un dulce de cada uno")
    public void testaddDulce(){
        System.out.println("AgregaDulcesAlDeposito");
        Deposito<Dulce> deposito = new Deposito<>();
        Snickers snickers = new Snickers(3);
        Super8 super8 = new Super8(4);

        deposito.addProducto(snickers);
        deposito.addProducto(super8);

        assertEquals(snickers, deposito.getProducto());
        assertEquals(super8, deposito.getProducto());
    }

    @Test
    @DisplayName("Test sacar productos hasta vaciar el deposito")
    public void testGetProductos(){
        System.out.println("AgregaYSacaDulces");
        Deposito<Dulce> deposito = new Deposito<>();
        Snickers snickers = new Snickers(3);
        Snickers snickers2 = new Snickers(5);
        Super8 super8 = new Super8(4);


        deposito.addProducto(snickers);
        deposito.addProducto(snickers2);
        deposito.addProducto(super8);

        assertEquals(snickers, deposito.getProducto());
        assertEquals(snickers2, deposito.getProducto());
        assertEquals(super8, deposito.getProducto());
        assertNull(deposito.getProducto());         //comprueba que no hayan mas productos
    }

}