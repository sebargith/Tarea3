package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositoVueltoTest {

    @Test
    @DisplayName("Test agregar una moneda")
    public void testaddUnaMoneda(){
        System.out.println("AgregaUnaMonedaAlDeposito");
        DepositoVuelto<Moneda> deposito = new DepositoVuelto<>();
        Moneda100 moneda100 = new Moneda100();

        deposito.addMoneda(moneda100);  //agrega productos

        assertEquals(moneda100, deposito.getMoneda());  //compara si lo que se saca es lo que agrego

    }

    @Test
    @DisplayName("Test agregar una moneda null y no obtener nada del deposito")
    public void testaddMonedaNull(){
        System.out.println("AgregaUnaMonedaNull");
        DepositoVuelto<Moneda> deposito = new DepositoVuelto<>();
        deposito.addMoneda(null);
        assertNull(deposito.getMoneda());

    }


    @Test
    @DisplayName("Test agregar y sacar monedas varias monedas hasta vaciar el deposito")
    public void testAddandGetMonedas(){
        System.out.println("Agregaysacamonedas");
        DepositoVuelto<Moneda> deposito = new DepositoVuelto<>();
        Moneda100 moneda100a = new Moneda100();
        Moneda100 moneda100b = new Moneda100();
        Moneda100 moneda100c = new Moneda100();



        deposito.addMoneda(moneda100a);
        deposito.addMoneda(moneda100b);
        deposito.addMoneda(moneda100c);

        assertEquals(moneda100a, deposito.getMoneda());
        assertEquals(moneda100b, deposito.getMoneda());
        assertEquals(moneda100c, deposito.getMoneda());
        assertNull(deposito.getMoneda());
    }

}