package com.alejandro.pooDiplomado.Ejercicios.Ciudad;

public class AppMain {
    public static void main(String[] args) {
        Ciudad rionegro = new Ciudad("Rionegro",1245345,"Colombia","Petro");
        System.out.println("En "+rionegro.getNombre()+"->"+rionegro.getPais()+" gobernada por "+rionegro.getPresidente()+" hay "+rionegro.getPoblacion()+" habitantes");

    }
}
