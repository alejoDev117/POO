package com.alejandro.fac.dominio;

import com.alejandro.fac.dominio.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public abstract class Factura {
    protected String numeroFactura;
    protected LocalDate fecha;
    protected long valor;
    protected Persona persona;
    protected String tipoFactura;

    public Factura(long valor, Persona persona) {
        this.valor = valor;
        this.persona = persona;
        this.fecha = LocalDate.now();
        this.numeroFactura = generarNumero();
    }

    public abstract void calcularValorApagar();
    public String generarNumero(){
        String caracteres= "abcdevwxyz123456789RSTUVWXYZ";
        String numerofactura ="";
        for (int i = 0; i <8; i++) {
            numerofactura += caracteres.charAt((int)(Math.random()*caracteres.length()));
        }
        return numerofactura;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public String getNumeroFactura() {

        return numeroFactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public long getValor() {

        return valor;
    }

    public Persona getPersona() {

        return persona;
    }

}
