package com.alejandro.EstructurasDeDatos;

import java.util.*;

public class Listas {
    public static void main(String[] args) {
        List<Integer>numerosEnteros = new ArrayList<>();
        LinkedList<Integer> numerosDinamicos = new LinkedList<>();

        for (int i = 0; i <3 ; i++) {
            int numeroRandom = (int) (Math.random() *(10+1));
            numerosEnteros.add(numeroRandom);
        }

        numerosEnteros.add(1,12);
        System.out.println(numerosEnteros);
        numerosEnteros.set(2,23);
        System.out.println(numerosEnteros);

        Stack<Integer> pilaDeNumeros = new Stack<>();



    }
}
