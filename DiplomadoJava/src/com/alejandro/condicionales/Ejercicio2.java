package com.alejandro.condicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Ejercicio1///////////////////////////
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese edad de la persona\n");
        int edad = input.nextInt();
        if(edad >= 0 && edad<= 5){
            System.out.println("Infante ->"+edad);
        } else if (edad > 5 && edad <= 10) {
            System.out.println("Niño ->"+edad);
        } else if (edad > 10 && edad <= 15) {
            System.out.println("Pre adolescente ->"+edad);
        } else if (edad > 15 && edad <= 20) {
            System.out.println("Adolescente ->"+edad);
        } else if (edad >20 && edad <= 25) {
            System.out.println("Vejeztorio ->"+edad);
        }else {
            System.out.println("Error rango fuera\n");
        }
    }
}
