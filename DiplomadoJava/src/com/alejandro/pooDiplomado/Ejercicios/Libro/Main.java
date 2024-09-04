package com.alejandro.pooDiplomado.Ejercicios.Libro;

import com.alejandro.pooDiplomado.Persona;

public class Main {
    public static void main(String[] args) {
        Persona sonia = new Persona("Sonia hermosa");
        Persona alejo = new Persona("Alejandro");
        Libro libro1 = new Libro(sonia,"Mil noches con alfredo",432);
        Libro libro2 = new Libro(alejo,"Hola bb que mas",323);
        System.out.println(libro1.mostrarInfoLibro());
        System.out.println(libro2.mostrarInfoLibro());
        System.out.println(libro2.libroMasLargo(libro1));
    }
}
