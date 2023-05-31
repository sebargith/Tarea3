package org.example;

/**
 * Clase que entrega los productos y el vuelto al comprador
 * */
class Expendedor{
    /** Parametro para sacar el vuelto del deposito de vuelto */
    private DepositoVuelto dv;

    /** Parametro para sacar una bebida del deposito */
    private Deposito cocacola;

    /** Parametro para sacar una bebida del deposito */
    private Deposito sprite;

    /** Parametro para sacar un dulce del deposito */
    private Deposito snickers;

    /** Parametro para sacar un dulce del deposito */
    private Deposito super8;

    /** int del precio del producto */
    public int precioProducto;

    /** (opcional)Parametro para que el comprador pueda usar con Expendedor.COCA */
    public static final int  COCA=1;

    /** (opcional)Parametro para que el comprador pueda usar con Expendedor.SPRITE */
    public static final int  SPRITE=2;

    /** (opcional)Parametro para que el comprador pueda usar con Expendedor.SNICKERS*/
    public static final int  SNICKERS=3;

    /** (opcional)Parametro para que el comprador pueda usar con Expendedor.SUPER8 */
    public static final int  SUPER8=4;


    /** Constructor, crea productos y los envia al deposito */
    public Expendedor(int numProducto){

        this.precioProducto=precioProducto;
        dv = new DepositoVuelto();
        cocacola = new Deposito();
        sprite = new Deposito();
        snickers = new Deposito();
        super8 = new Deposito();

        for(int i=0; i<numProducto; i++){
            cocacola.addProducto(new CocaCola(100+i));
            sprite.addProducto(new Sprite(200 +i));
            snickers.addProducto(new Snickers(300 +i));
            super8.addProducto(new Super8(400 +i));
        }
    }


    /** Inicializa variables, comprueba la validez de la solicitud del comprador y saca productos y dinero de los depositos
     * @param m maneja las monedas (Moneda)
     * @param sabor maneja el tipo de producto (int)
     * @throws  NullPointerException  puede lanzar esta excepción si la moneda es null
     * @throws  NoHayProductoException  excepcion personalizada, puede lanzar si la seleccion de productos es invalida o no quedan productos
     * @throws  PagoInsuficienteException  excepcion personalizada, puede lanzar si no alcanza el dinero para comprar
     */
    public Producto comprarProducto(Moneda m, int sabor)throws NullPointerException, NoHayProductoException, PagoInsuficienteException{
        if (m == null) throw new PagoIncorrectoException("moneda es null");

        int vuelto = m.getValor();
        Bebida cocaColaBebida = null;
        Bebida spriteBebida = null;
        Dulce snickersDulce = null;
        Dulce super8Dulce = null;


        Precios precioProducto;

        switch (sabor) {
            case 1:
                precioProducto = Precios.COCACOLAPRECIO;
                break;
            case 2:
                precioProducto = Precios.SPRITEPRECIO;
                break;
            case 3:
                precioProducto = Precios.SNICKERSPRECIO;
                break;
            case 4:
                precioProducto = Precios.SUPER8PRECIO;
                break;
            default:
                throw new NoHayProductoException("Producto Invalido");
        }


        if (sabor == 1 && m.getValor() >= precioProducto.getRefe()) {
            cocaColaBebida = (Bebida) cocacola.getProducto();
            if (cocaColaBebida != null) {
                vuelto = m.getValor() - precioProducto.getRefe();
            } else if (cocaColaBebida == null) {
                throw new NoHayProductoException("No quedan bebidas");
            }
        } else if (sabor == 1 && m.getValor() < precioProducto.getRefe()) {
            vuelto = m.getValor();
            throw new PagoInsuficienteException("Pago Insuficiente");
        }

        if (sabor == 2 && m.getValor() >= precioProducto.getRefe()) {
            spriteBebida = (Bebida) sprite.getProducto();
            if (spriteBebida != null) {
                vuelto = m.getValor() - precioProducto.getRefe();
            } else if (spriteBebida == null) {
                throw new NoHayProductoException("No quedan bebidas");
            }
        } else if (sabor == 2 && m.getValor() < precioProducto.getRefe()) {
            vuelto = m.getValor();
            throw new PagoInsuficienteException("Pago Insuficiente");
        }

        if (sabor == 3 && m.getValor() >= precioProducto.getRefe()) {
            snickersDulce = (Dulce) snickers.getProducto();
            if (snickersDulce != null) {
                vuelto = m.getValor() - precioProducto.getRefe();
            } else if (snickersDulce == null) {
                throw new NoHayProductoException("No quedan dulces");
            }
        } else if (sabor == 3 && m.getValor() < precioProducto.getRefe()) {
            vuelto = m.getValor();
            throw new PagoInsuficienteException("Pago Insuficiente");
        }

        if (sabor == 4 && m.getValor() >= precioProducto.getRefe()) {
            super8Dulce = (Dulce) super8.getProducto();
            if (super8Dulce != null) {
                vuelto = m.getValor() - precioProducto.getRefe();
            } else if (super8Dulce == null) {
                throw new NoHayProductoException("No quedan dulces");
            }
        } else if (sabor == 4 && m.getValor() < precioProducto.getRefe()) {
            vuelto = m.getValor();
            throw new PagoInsuficienteException("Pago Insuficiente");
        }

        if (sabor < 1 || sabor > 4) {
            throw new NoHayProductoException("Producto Invalido");
        }


        while (vuelto > 0) {
            dv.addMoneda(new Moneda100());
            vuelto = vuelto - 100;
        }

        switch (sabor) {
            case 1:
                return cocaColaBebida;
            case 2:
                return spriteBebida;
            case 3:
                return snickersDulce;
            case 4:
                return super8Dulce;
            default:
                return null;
        }

    }

    /** Saca monedas del deposito de vuelto
     * @return retorna monedas del deposito de vuelto
     * */
    public Moneda getVuelto(){
        return (Moneda) dv.getMoneda();
    }
}