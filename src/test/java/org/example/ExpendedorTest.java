package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {
    private Expendedor expendedor;

    @BeforeEach
    void setUp() {
        expendedor = new Expendedor(3);
    }

    @AfterEach
    void tearDown() {
    }

    //Test de Productos
    @Test
    @DisplayName("Test caso normal, dos productos")
    public void testCasoDosProductos() throws Exception {
        System.out.println("ComprarDosProductos");
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1500();

        Producto producto1 = expendedor.comprarProducto(m,1);
        assertNotNull(producto1);
        Producto producto2 = expendedor.comprarProducto(m,2);
        assertNotNull(producto2);
    }

    @Test
    @DisplayName("Test caso minimo, un producto")
    public void testCasoUnProducto() throws Exception {
        System.out.println("ComprarUnProducto");
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1500();

        Producto producto1 = expendedor.comprarProducto(m,1);
        assertNotNull(producto1);
    }

    @Test
    @DisplayName("Test Un Producto de cada uno")
    public void testComprarUnProducto() throws Exception {
        System.out.println("ComprarUnProductoDeCadaUno");
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1500();

        Producto producto1 = expendedor.comprarProducto(m,1);
        assertNotNull(producto1);
        Producto producto2 = expendedor.comprarProducto(m,2);
        assertNotNull(producto2);
        Producto producto3 = expendedor.comprarProducto(m,3);
        assertNotNull(producto3);
        Producto producto4 = expendedor.comprarProducto(m,4);
        assertNotNull(producto4);
    }

    @Test
    @DisplayName("Test caso maximo, tres Productos")
    public void testComprarTresProductos() throws Exception {
        System.out.println("ComprarTresProductos");
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1500();

        Producto producto1 = expendedor.comprarProducto(m,1);
        assertNotNull(producto1);
        Producto producto2 = expendedor.comprarProducto(m,1);
        assertNotNull(producto2);
        Producto producto3 = expendedor.comprarProducto(m,1);
        assertNotNull(producto3);
    }


    @Test
    @DisplayName("Test Producto No Existe")
    public void testComprarProductoNoExiste() throws Exception {
        System.out.println("ComprarProductoNoExiste");
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1500();

        Moneda finalM = m;
        Exception exception = assertThrows(NoHayProductoException.class,()-> {
            Producto producto1 = expendedor.comprarProducto(finalM, 6);
            assertNotNull(producto1);
        });
    }

    @Test
    @DisplayName("Test No Quedan Productos")
    public void testComprarCuatroProductos() throws Exception {
        System.out.println("ComprarCuatroProductos");

        Moneda m = null;
        Comprador c=null;
        m = new Moneda1500();
        Moneda finalM = m;
        Exception exception = assertThrows(NoHayProductoException.class,()-> {
            Producto producto1 = expendedor.comprarProducto(finalM, 1);
            assertNotNull(producto1);
            Producto producto2 = expendedor.comprarProducto(finalM, 1);
            assertNotNull(producto2);
            Producto producto3 = expendedor.comprarProducto(finalM, 1);
            assertNotNull(producto3);
            Producto producto4 = expendedor.comprarProducto(finalM, 1);
            assertNotNull(producto4);
        });
    }



    //Test de monedas

    @Test
    @DisplayName("Test caso normal, Monedas suficientes")
    public void testMonedasSuficientes() throws Exception {
        System.out.println("ComprarConMonedasSuficientes");
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1500();

        Producto producto1 = expendedor.comprarProducto(m,1);
        assertNotNull(producto1);
    }

    @Test
    @DisplayName("Test Monedas justas")
    public void testMonedasJustas() throws Exception {
        System.out.println("ComprarConMonedasJustas");
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1000();

        Producto producto1 = expendedor.comprarProducto(m,1);
        assertNotNull(producto1);
    }


    @Test
    @DisplayName("Test Moneda null")
    public void testMonedaNull() throws Exception {
        System.out.println("ComprarConMonedaNull");
        Moneda m = null;
        Comprador c=null;

        Moneda finalM = m;
        Exception exception = assertThrows(PagoIncorrectoException.class,()-> {
            Producto producto1 = expendedor.comprarProducto(finalM, 1);
            assertNotNull(producto1);
        });
    }

    @Test
    @DisplayName("Test Pago Insuficiente")
    public void testPagoInsuficiente() throws Exception {
        System.out.println("ComprarConMonedaInsuficiente");
        Moneda m = null;
        Comprador c=null;
        m = new Moneda500();

        Moneda finalM = m;
        Exception exception = assertThrows(PagoInsuficienteException.class,()-> {
            Producto producto1 = expendedor.comprarProducto(finalM, 1);
            assertNotNull(producto1);
        });
    }

}