package com.alejandro.fac.dominio;

public class Persona {
    private String nombre;
    private long cedula;
    private String ocupacion;

    public Persona(String nombre, long cedula, String ocupacion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ocupacion = ocupacion;
    }

    public Persona(String nombre, long cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {

        return nombre;
    }

    public long getCedula() {

        return cedula;
    }
    public String getOcupacion(){
        return ocupacion;
    }
}
