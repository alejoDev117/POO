package com.alejandro.EstructurasDeDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRegistroTeclado {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Scanner inputScanner = new Scanner(System.in);

        int numero = Integer.parseInt(input.readLine());
        System.out.println("Entre ambos");
        String algo = input.readLine();
        System.out.println(algo);

    }
}
