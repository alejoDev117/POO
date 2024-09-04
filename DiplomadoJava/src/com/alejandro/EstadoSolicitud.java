package com.alejandro;

import java.util.UUID;

public class EstadoSolicitud extends Estado{
    protected EstadoSolicitud(UUID identificador, String nombre, EstadoNombre estado) {
        super(identificador, nombre, estado);
    }

    @Override
    public String toString() {
        return "";
    }

    public static void main(String[] args) {
        EstadoSolicitud nuevo = new EstadoSolicitud(UUID.randomUUID(),"Aprovada",EstadoNombre.Solicitud);
        System.out.println(nuevo);

    }
}
