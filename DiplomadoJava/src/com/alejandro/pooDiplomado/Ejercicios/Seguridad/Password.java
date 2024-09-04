package com.alejandro.pooDiplomado.Ejercicios.Seguridad;


import java.util.ArrayList;
import java.util.List;

public class Password {
    private String contenido;
    private int longitud;
    private List<String> francia;

    public Password(int longitud) {
        francia = new ArrayList<>();
        this.contenido = "";
        this.longitud = longitud;
    }
    public Password(){
        this.contenido = "";
        this.longitud = 10;
    }


    public void generar(){
        if(validarLongitud()){
            for (int i = 1; i <=10 ; i++) {
                contenido+=caracter(mayusculasRandom());
            }
        }else {
        for (int i = 1; i <=longitud ; i++) {
            contenido+=caracter(mayusculasRandom());
        }
        }
        System.out.println(contenido);
    }

    private boolean validarLongitud(){
        if(longitud == 10){
            return true;
        }else {
            return false;
        }
    }

    private int mayusculasRandom(){
        return (int) (Math.random() * (3-1+1)+1);
    }
    private char caracter(int control){
        char caracter;
        switch (control){
            case 1:{
                caracter = (char) ((int)(Math.random()*(122-91+1)+91));
                return caracter;
            }
            case 2:{
                caracter = (char) ((int)(Math.random()*(90-65+1)+65));
                return caracter;
            }
            case 3:{
                caracter = (char) ((int)(Math.random()*(57-48+1)+48));
                return caracter;
            }
        }
        return ' ';
    }


    public void validarSeguridad(){
        int minuscula = 0,mayuscula = 0,numeros = 0;
        for (char c:contenido.toCharArray()) {
            if(Character.isDigit(c)){
                numeros++;
            }else if(Character.isUpperCase(c)){
                mayuscula++;
            } else if (Character.isLowerCase(c)) {
                minuscula++;
            }
        }
        if(numeros >= 5 && minuscula >= 1 && mayuscula >=2){
            System.out.println("Es segura");
        }else {
            System.out.println("No es segura");
        }
    }


    public String getContenido() {
        return contenido;
    }


    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public List<String> getFrancia(){
        return francia;
    }
}
