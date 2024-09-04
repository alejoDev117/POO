package com.alejandro;

import java.util.UUID;

public class Estado {
    private UUID identificador;
    private String nombre;
    private EstadoNombre estado;

    protected Estado(UUID identificador, String nombre, EstadoNombre estado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.estado = estado;
    }

    protected UUID getIdentificador() {
        return identificador;
    }

    protected void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoNombre getEstado() {
        return estado;
    }

    public void setEstado(EstadoNombre estado) {
        this.estado = estado;
    }
}
