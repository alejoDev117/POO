package com.alejandro.condicionales;

import java.util.Scanner;

public class PracticaDiplomadoModulo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quieres cafe?\n");
        String decisionQuererCafe = input.nextLine();
        if(decisionQuererCafe.equals("si")){
            System.out.println("Necesitas comprarlo?\n");
            String decisionComprar = input.nextLine();
            if(decisionComprar.equals("si")){
                System.out.println("Comprando....\n");
                System.out.println("Bebiendo..... :)");
            }else {
                System.out.println("Preparando.....\n");
                System.out.println("Bebiendo..... :)");
            }
        }else {
            System.out.println("sigue estudiandoXd\n");
        }

    }
}