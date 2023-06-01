package org.example;


/**
 * Desigan y relaciona un 'sabor' con la eleccion numerica del consumidor
 * */
enum sabores {
    COCACOLA(1),
    SPRITE(2),
    SNICKERS(3),
    SUPER8(4);

    private final int ref;
    /** Constructor que guarda el valor numero de un determinado sabor*/
    sabores(int ref) {
        this.ref= ref;
    }

    public int getRef() {
        return ref;
    }
}