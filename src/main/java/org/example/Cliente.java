package org.example;

public abstract class Cliente {
    private String identificador;
    private String contrasena;
    private float descuento;

    public Cliente() {
    }

    public Cliente(String identificador, String contrasena, float descuento) {
        this.identificador = identificador;
        this.contrasena = contrasena;
        this.descuento = descuento;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
}
