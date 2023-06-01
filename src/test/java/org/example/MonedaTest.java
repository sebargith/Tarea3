package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonedaTest {


    @Test
    @DisplayName("Test valor de monedas de 100")
    public void getValorMonedas100() throws Exception{
        System.out.println("ComprobarValorDeMonedasDe100");
        Moneda moneda100 = new Moneda100();
        assertEquals(100, moneda100.getValor());
    }

    @Test
    @DisplayName("Test valor de monedas de 500")
    public void getValorMonedas500() throws Exception{
        System.out.println("ComprobarValorDeMonedasDe500");
        Moneda moneda500 = new Moneda500();
        assertEquals(500, moneda500.getValor());
    }

    @Test
    @DisplayName("Test valor de monedas de 1000")
    public void getValorMonedas1000() throws Exception{
        System.out.println("ComprobarValorDeMonedasDe1000");
        Moneda moneda1000 = new Moneda1000();
        assertEquals(1000, moneda1000.getValor());
    }

    @Test
    @DisplayName("Test valor de monedas de 1500")
    public void getValorMonedas1500() throws Exception{
        System.out.println("ComprobarValorDeMonedasDe1500");
        Moneda moneda1500 = new Moneda1500();
        assertEquals(1500, moneda1500.getValor());
    }

}