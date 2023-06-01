package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {

    private Expendedor exp;
    private Moneda m;
    private Comprador c;


    @BeforeEach
    void setUp() throws NoHayProductoException, PagoInsuficienteException {
        exp = new Expendedor(3);
        m = new Moneda1500();
    }


    @Test
    @DisplayName("Test para ver si el sabor es correcto, cocacola")
    public void testCheckSaborCoca() throws Exception{
        System.out.println("TestdeCheckeoDeSaborCoca");
        c = new Comprador(m, 1, exp);
        assertEquals(sabores.COCACOLA.name(), c.queBebiste());
    }

    @Test
    @DisplayName("Test para ver si el sabor es correcto, sprite")
    public void testCheckSaborSprite() throws Exception{
        System.out.println("TestdeCheckeoDeSaborSprite");
        c = new Comprador(m, 2, exp);
        assertEquals(sabores.SPRITE.name(), c.queBebiste());
    }

    @Test
    @DisplayName("Test para ver si el sabor es correcto, snickers")
    public void testCheckSaborSnickers() throws Exception{
        System.out.println("TestdeCheckeoDeSnickers");
        c = new Comprador(m, 3, exp);
        assertEquals(sabores.SNICKERS.name(), c.queBebiste());
    }

    @Test
    @DisplayName("Test para ver si el sabor es correcto, super8")
    public void testCheckSaborSuper8() throws Exception{
        System.out.println("TestdeCheckeoDeSaborSuper8");
        c = new Comprador(m, 4, exp);
        assertEquals(sabores.SUPER8.name(), c.queBebiste());
    }

    @Test
    @DisplayName("Test para ver si entrega el vuelto correcto (caso vuelto > 0)")
    public void testVueltoAlgo() throws Exception{
        System.out.println("TestdeVueltoAlgo");
        c = new Comprador(m, 2, exp);
        assertEquals(m.getValor()-Precios.SPRITEPRECIO.getRefe(), c.cuantoVuelto());
    }

    @Test
    @DisplayName("Test para ver si entrega el vuelto correcto (caso vuelto = 0)")
    public void testVueltoCero() throws Exception {
        System.out.println("TestdeVueltoCero");
        Comprador c1 = new Comprador(m, 4, exp);
        assertEquals(m.getValor() - Precios.SUPER8PRECIO.getRefe(), c1.cuantoVuelto());
    }

    @Test
    @DisplayName("Test Producto Invalido")
    public void testProductoInvalido() throws Exception {
        System.out.println("ComprarUnProductoInvalido");
        Exception exception = assertThrows(NoHayProductoException.class,()-> {
            c = new Comprador(m,7,exp);
        });
    }

    @Test
    @DisplayName("Test no quedan productos")
    public void testNoQuedanProductos() throws Exception {
        System.out.println("NoQuedanProductos");
        Exception exception = assertThrows(NoHayProductoException.class,()-> {
            Expendedor exp2 = new Expendedor(0);
            c = new Comprador(m,2,exp2);
        });
    }

}