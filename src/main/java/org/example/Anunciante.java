package org.example;

public class Anunciante extends Cliente{
    private int numAnuncios;

    public Anunciante() {
    }

    public Anunciante(String identificador, String contrasena, float descuento, int numAnuncios) {
        super(identificador, contrasena, descuento);
        this.numAnuncios = numAnuncios;
    }

    public int getNumAnuncios() {
        return numAnuncios;
    }

    public void setNumAnuncios(int numAnuncios) {
        this.numAnuncios = numAnuncios;
    }
}
