package com.alejandro.fac.dominio;

import com.alejandro.fac.dominio.Factura;

public class FacturaConIva extends Factura {
    private static final double IVA_19 = 0.19;

    public FacturaConIva(long valor, Persona persona) {
        super(valor, persona);
        tipoFactura = "Factura con Iva";
        calcularValorApagar();
    }

    @Override
    public void calcularValorApagar() {
     super.valor += this.calcularIva();
    }

    public long calcularIva() {
        return (long) (super.valor * IVA_19);
    }
    public long getValor() {
        return valor;
    }
}
