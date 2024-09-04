package com.alejandro.fac.dominio;
import com.alejandro.fac.dominio.Factura;

public class FacturaConDescuento extends Factura {
    private static final double DESCUENTO_PROFESOR = 0.15;
    private static final double DESCUENTO_ESTUDIANTE = 0.20;
    private static final double DESCUENTO_VINCULADO = 0.25;
    private static final double DESCUENTO_NOVINCULADO = 0.10;
    private static final double DESCUENTO_INDEPENDIENTE = 0.30;

    public FacturaConDescuento(long valor, Persona persona) {
        super(valor, persona);
        tipoFactura = "Factura con Descuento";
        calcularValorApagar();
    }

    private int aplicarDescuento() {
        switch (persona.getOcupacion().toLowerCase()) {
            case "profesor": {
                return (int) (super.valor * DESCUENTO_PROFESOR);
            }
            case "estudiante": {
                return (int) (super.valor * DESCUENTO_ESTUDIANTE);

            }
            case "vinculado": {
                return (int) (super.valor * DESCUENTO_VINCULADO);

            }
            case "no vinculado": {
                return (int) (super.valor * DESCUENTO_NOVINCULADO);
            }
            case "independiente": {
                return (int) (super.valor * DESCUENTO_INDEPENDIENTE);
            }
        }
        return 0;
    }

    @Override
    public void calcularValorApagar() {
        super.valor -= aplicarDescuento();
    }

}
