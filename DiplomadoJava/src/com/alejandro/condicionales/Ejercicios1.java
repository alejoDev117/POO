package com.alejandro.condicionales;

public class Ejercicios1 {
    public static void main(String[] args) {
        //ejercicio1//////////
        for (int i = 0; i <= 10; i++) {
            int numeroAleatorio = (int) (Math.random() * (100 + 1));
            if (numeroAleatorio < 50) {
                System.out.println("El numero: " + numeroAleatorio + " es menor a 50");
            } else {
                System.out.println("El numero: " + numeroAleatorio + " es mayor a 50");
            }
        }
        System.out.println("\n");
        //ejercio2//////////
        for (int i = 0; i <=3 ; i++) {
            int numero1 = (int) (Math.random() *(10 + 1));
            int numero2 = (int) (Math.random() * (10 + 1));
            if(numero1 > numero2){
            System.out.println("numero1 : "+numero1+" numero2 :  "+numero2+" -- "+ (int) Math.pow(numero1, numero2));
            }else if(numero2 > numero1){
                System.out.println("numero1 : "+numero1+" numero2 :  "+numero2+" -- "+ (int) Math.pow(numero2, numero1));
            }
        }
    }

}
