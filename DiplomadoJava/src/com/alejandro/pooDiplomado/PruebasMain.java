package com.alejandro.pooDiplomado;

public class PruebasMain {
    public static void main(String[] args) {
        Persona pepiño = new Persona("Nola");
        pepiño.llenarLista();
        System.out.println(pepiño.getNumeros());
        pepiño.getNumeros().add(5);
        System.out.println(pepiño.getNumeros());


    }

}
