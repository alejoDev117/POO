package com.alejandro.fac.dominio;
import com.alejandro.fac.dominio.Factura;

public class FacturaSinIva extends Factura {
    public FacturaSinIva(long valor, Persona persona) {
        super(valor, persona);
        tipoFactura = "Factura sin Iva";
        calcularValorApagar();

    }

    @Override
    public void calcularValorApagar() {
    }

    public long getValor() {
        return valor;
    }
}