package org.example;

/**
 * Clase que recibe la solicitud del comprador
 * */
class Comprador{
    /** String que define el tipo de producto*/
    private String sabor;
    /** int que define el vuelto*/
    private int vuelto;
    /** Parametro que llama a metodos del Expendedor*/
    private Expendedor exp;

    /** Recibe la moneda del comprador, el tipo de producto y comprueba la validez de esta solicitud
     * @param m maneja las monedas (Moneda)
     * @param cual maneja la seleccion del comprador (int)
     * @param exp llama a metodos del Expendedor (Expendedor)
     * @throws  NoHayProductoException  excepcion personalizada, puede lanzar si la seleccion de productos es invalida o no quedan productos
     * @throws  PagoInsuficienteException  excepcion personalizada, puede lanzar si no alcanza el dinero para comprar
     */
    public Comprador(Moneda m, int cual, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException{
        this.exp=exp;

        if (exp.comprarProducto(m, cual) != null) {
            switch (cual) {
                case 1:
                    sabor = "cocacola";
                    break;
                case 2:
                    sabor = "sprite";
                    break;
                case 3:
                    sabor = "snickers";
                    break;
                case 4:
                    sabor = "super8";
                    break;
                default:
                    break;
            }
        }
        Moneda moneda = null;

        moneda = exp.getVuelto();
        while (moneda != null) {
            vuelto = vuelto + moneda.getValor();
            moneda = exp.getVuelto();
        }
    }

    /** Metodo que retorna el tipo de producto
     * @return retorna el tipo de producto
     * */
    public  String queBebiste(){
        return sabor;
    }

    /** Metodo que retorna el vuelto
     * @return retorna el vuelto
     * */
    public int cuantoVuelto() {
        return vuelto;
    }
}