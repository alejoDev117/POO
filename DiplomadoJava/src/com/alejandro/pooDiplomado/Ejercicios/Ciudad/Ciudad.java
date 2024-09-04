package com.alejandro.pooDiplomado.Ejercicios.Ciudad;

public class Ciudad {
    private String nombre;
    private long poblacion;
    private String pais;
    private String presidente;

    public Ciudad(){

    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad(String nombre, long poblacion, String pais, String presidente) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.presidente = presidente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
}
