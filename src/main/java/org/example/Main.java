package org.example;
/**
 * Una maquina expendedora de bebidas y dulces
 * @author Sebastian Andres Rosas Urra
 * @author Juan Ignacio Carvajal Ramirez
 * @version 31 de mayo de 2023
 */
public class Main {
    /**
     * Metodo que prueba el codigo agregando productos al expendedor, precio a los productos, e intenta comprarlos. Se prueba si arroja alguna excepcion y la atrapa con un mensaje de salida corrrespondiente
     */

    public static void main(String[] args) {
        Expendedor exp = new Expendedor(1);
        Moneda m = null;
        Comprador c = null;

        try {
            m = new Moneda1500();
            c = new Comprador(m, 1, exp);
            System.out.println("Producto: " + c.queBebiste() + ", vuelto: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 2, exp);
            System.out.println("Producto: " + c.queBebiste() + ", vuelto: " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, 3, exp);
            System.out.println("Producto: " + c.queBebiste() + ", vuelto: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 4, exp);
            System.out.println("Producto: " + c.queBebiste() + ", vuelto: " + c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m, 2, exp);
            System.out.println("Producto: " + c.queBebiste() + ", vuelto: " + c.cuantoVuelto());
        } catch (PagoIncorrectoException pinc) {
            System.out.println("Pago Invalido");
        } catch (PagoInsuficienteException pins) {
            int devolucion = m.getValor();
            System.out.println("Pago Insuficiente" + ", devolucion: " + devolucion);
        } catch (NoHayProductoException nhpe) {
            int devolucion = m.getValor();
            System.out.println("No hay producto seleccionado" + ", devolucion: " + devolucion);
        }

    }
}