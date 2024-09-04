package com.alejandro.pooDiplomado.Ejercicios.Seguridad;

public class FrontEnd {
    public static void main(String[] args) {
        Password discord = new Password(20);
        Password facebook = new Password();
        discord.generar();
        facebook.generar();
        discord.validarSeguridad();
        facebook.validarSeguridad();
    }
}
