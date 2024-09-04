package com.alejandro.pooDiplomado;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    public String nombre;
    public String paisDeOrigen;
    private int edad;
    private List<Integer> numeros;
    public  List<Integer> copia;

    public Persona(String nombre)
    {
        this.numeros = new ArrayList<>();
        this.nombre = nombre;
    }
    public Persona(int edad){
        this.numeros = new ArrayList<>();
        this.edad = edad;
    }

    public Persona(String nombre, int edad){
        nombre = nombre;
        edad = edad;
    }
    public Persona(String nombre, int edad, String paisDeOrigen){
        nombre = nombre;
        edad = edad;
        paisDeOrigen = paisDeOrigen;
    }


    public void saludar(String saludo, int fecha ){

        System.out.println(saludo+" el dia "+fecha);
    }

    public void llenarLista(){
        for (int i = 0; i <5 ; i++) {
            numeros.add(i);
        }
        copia = numeros;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public int getEdad() {
        return edad;
    }
}
