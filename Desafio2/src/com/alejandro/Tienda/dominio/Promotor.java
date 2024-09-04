package com.alejandro.Tienda.dominio;

public class Promotor extends Empleado{

    private int volantesRepartidos;
    private long valorVolante;
    private int cantidadVentasConVolante;
    private final long VALOR_POR_VENTA = 15000;

    public Promotor(String nombre) {
        super(nombre);
    }

    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int cantidadVentasConVolante){
        this(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.cantidadVentasConVolante = cantidadVentasConVolante;

    }

    @Override
    protected long calcularSalario() {
        return (valorVolante * volantesRepartidos + cantidadVentasConVolante * VALOR_POR_VENTA);
    }
}
