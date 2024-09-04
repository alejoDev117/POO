package com.alejandro.fac.dominio;
import com.alejandro.fac.dominio.Factura;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class FacturaVencida extends Factura{
    private LocalDate fechaVencimiento;
    private long diasVencidos;
    private static final int VALOR_DIA_RECARGO = 55;

    public FacturaVencida(long valor, Persona persona) {
        super(valor, persona);
        tipoFactura = "Factura Vencida";
        calcularValorApagar();
    }
    public void cantidadDiasRecargo(int dia, int mes, int año){
        fechaVencimiento = LocalDate.of(año,mes,dia);
        diasVencidos = DAYS.between(fechaVencimiento,fecha);
    }
    @Override
    public void calcularValorApagar() {
        super.valor += (diasVencidos * VALOR_DIA_RECARGO);
    }


}
