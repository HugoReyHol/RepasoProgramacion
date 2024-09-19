package org.example;

public class Usuario extends Cliente {
    private boolean premium;

    public Usuario() {
    }

    public Usuario(String identificador, String contrasena, float descuento, boolean premium) {
        super(identificador, contrasena, descuento);
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
