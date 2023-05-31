package org.example;

enum Precios {
    COCACOLAPRECIO(1000),
    SPRITEPRECIO(700),
    SNICKERSPRECIO(1000),
    SUPER8PRECIO(1500);

    private final int refe;

    Precios(int refe) {
        this.refe= refe;
    }

    public int getRefe() {
        return refe;
    }
}