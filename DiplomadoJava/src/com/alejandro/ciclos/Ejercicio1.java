package com.alejandro.ciclos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String palabraPalindroma = "OjoRojo";
        StringBuilder aux = new StringBuilder(palabraPalindroma);
        if(aux.reverse().toString().toLowerCase().equals(palabraPalindroma.toLowerCase())){
            System.out.println("Son palindromas");
        }else{
            System.out.println("Nop");
        }
        int numero[] = new int[10];
        String p[] = new String[3];
        System.out.println(numero[2]);
        System.out.println(p[1]);
        int randomBoolean;
        for (int i = 0; i <10 ; i++) {
            randomBoolean = (int) (Math.random() * (2 - 1 + 1) + 1);
            System.out.println(randomBoolean);
        }
    }
}
