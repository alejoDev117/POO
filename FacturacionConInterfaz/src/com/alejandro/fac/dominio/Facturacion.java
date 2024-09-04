package com.alejandro.fac.dominio;
import com.alejandro.fac.dominio.FacturaVencida;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.alejandro.fac.dominio.Factura;

public class Facturacion {
    private List<Factura> facturas;
    private FacturaVencida facturaVencidaCasoParticular;

    public Facturacion() {
        this.facturas = new ArrayList<>();
    }

    public void crearFactura(int tipoDeFactura, long valor, Persona persona) {
        Factura factura = null;
        switch (tipoDeFactura) {
            case 0:
                factura = new FacturaSinIva(valor, persona);
                facturas.add(factura);
                break;
            case 1:
                factura = new FacturaConIva(valor, persona);
                facturas.add(factura);
                break;
            case 2:
                factura = new FacturaConDescuento(valor, persona);
                facturas.add(factura);
                break;
            case 3:
                FacturaVencida facturaVencida = new FacturaVencida(valor,persona);
                facturas.add(facturaVencida);
                facturaVencidaCasoParticular = facturaVencida;
                break;
            }

        }

    public Factura mostrarFactura(String codigo){
        for (Factura show: facturas) {
            if(show.numeroFactura.equals(codigo)){
                return show;
            }
        }
        return null;
    }

    public boolean pagarFactura(long valorPago,String codigoFactura){
        for (Factura facturaPago: facturas){
         if(facturaPago.numeroFactura.equals(codigoFactura) && facturaPago.valor <= valorPago){
             facturas.remove(facturaPago);
             return true;
         }
        }
        return false;
    }

    public List<String> codigosFacturas(){
        List<String> codigos = new ArrayList<>();
        for (Factura facturasActuales: facturas) {
            codigos.add(facturasActuales.numeroFactura);
        }
        return codigos;
    }

    public List<String> topeNumeroMes(int añoElegido){
        List<String> meses = new ArrayList<>();
        if(añoElegido<facturaVencidaCasoParticular.fecha.getYear()){
            for (int i = 1; i <=12 ; i++) {
                meses.add(String.valueOf(i));
            }
            return meses;
        }else if(añoElegido == facturaVencidaCasoParticular.fecha.getYear()){
                for (int i = 1; i <=facturaVencidaCasoParticular.fecha.getMonthValue(); i++) {
                    meses.add(String.valueOf(i));
                }
                return meses;
        }
        return null;
    }

    public List<String> topeNumeroDias(int mesElegido, int añoElegido){
        List<String> dias = new ArrayList<>();
        if(mesElegido  == facturaVencidaCasoParticular.fecha.getMonthValue() && añoElegido == facturaVencidaCasoParticular.fecha.getYear() ){
            for (int i = 0; i <facturaVencidaCasoParticular.fecha.getDayOfMonth() ; i++) {
                dias.add(String.valueOf(i));
            }
            return dias;
        }
        if(mesElegido == 1 || mesElegido == 3 || mesElegido == 5 || mesElegido == 7 || mesElegido == 8 || mesElegido == 10 || mesElegido == 12){
            for (int i = 1; i <=31 ; i++) {
                dias.add(String.valueOf(i));
            }
            return dias;
        } else if (mesElegido == 2) {
            for (int i = 0; i <=28 ; i++) {
                dias.add(String.valueOf(i));
            }
            return dias;
        }else {
            for (int i = 0; i <=30 ; i++) {
                dias.add(String.valueOf(i));
            }
            return dias;
        }

    }


    public List<String> topeNumeroAños(){
        List<String> años = new ArrayList<>();
        for (int i = 2000; i <= facturaVencidaCasoParticular.fecha.getYear() ; i++) {
            años.add(String.valueOf(i));
        }
        return años;
    }


    public List<Factura> getFacturas() {
        return facturas;
    }



    public FacturaVencida getFacturaVencidaCasoParticular() {
        return facturaVencidaCasoParticular;
    }
}
