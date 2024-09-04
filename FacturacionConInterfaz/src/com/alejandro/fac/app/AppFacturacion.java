package com.alejandro.fac.app;

import com.alejandro.fac.dominio.Factura;
import com.alejandro.fac.dominio.FacturaSinIva;
import com.alejandro.fac.dominio.Facturacion;
import com.alejandro.fac.dominio.Persona;

import javax.swing.*;
import java.io.IOException;

public class AppFacturacion {
    public static void main(String[] args) throws IOException {
        ImageIcon iconoFacturacion = new ImageIcon(AppFacturacion.class.getResourceAsStream("iconoFacturacion.png").readAllBytes());
        ImageIcon iconoCedula = new ImageIcon(AppFacturacion.class.getResourceAsStream("iconoCedula.png").readAllBytes());
        ImageIcon iconoDinero = new ImageIcon(AppFacturacion.class.getResourceAsStream("iconoDinero.jpg").readAllBytes());
        ImageIcon iconoExito = new ImageIcon(AppFacturacion.class.getResourceAsStream("iconoExito.png").readAllBytes());
        ImageIcon iconoFactura = new ImageIcon(AppFacturacion.class.getResourceAsStream("iconoFactura.jpg").readAllBytes());
        ImageIcon iconoPersona = new ImageIcon(AppFacturacion.class.getResourceAsStream("iconoPersona.jpg").readAllBytes());
        ImageIcon iconoOcupacion = new ImageIcon(AppFacturacion.class.getResourceAsStream("iconoOcupacion.jpg").readAllBytes());
        ImageIcon iconoCalendario = new ImageIcon(AppFacturacion.class.getResourceAsStream("iconoCalendario.png").readAllBytes());
        Facturacion sistemaFacturacion = new Facturacion();
        int decision = 0;
        while (decision != -1) {
            decision = JOptionPane.showOptionDialog(null, "Bienvenido al sistema de facturacion.\nQue desea hacer?", "Facturacion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, iconoFacturacion, new Object[]{"Crear factura", "Facturas pendientes", "Pagar factura"}, null);
            switch (decision) {
                case 0: {
                    int opcionFactura = JOptionPane.showOptionDialog(null, "Ingrese el tipo de factura", "Facturacion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, iconoFactura, new Object[]{"Factura sin iva", "Factura con iva", "Factura con descuento", "Factura vencida"}, null);
                    switch (opcionFactura) {
                        case 0: {
                            String nombre = (String) JOptionPane.showInputDialog(null, "Ingrese nombre", "Nombre", JOptionPane.INFORMATION_MESSAGE, iconoPersona, null, "Nombre");
                            long cedula = Long.parseLong((String) JOptionPane.showInputDialog(null, "Ingrese Cedula", "Cedula", JOptionPane.INFORMATION_MESSAGE, iconoCedula, null, 00000));
                            Persona pepito = new Persona(nombre, cedula);
                            long valorDeFactura = Long.parseLong((String) JOptionPane.showInputDialog(null, "Ingrese valor$$", "Valor", JOptionPane.INFORMATION_MESSAGE, iconoDinero, null, 0));
                            sistemaFacturacion.crearFactura(0, valorDeFactura, pepito);
                            JOptionPane.showMessageDialog(null, "Factura creada con exito!!", "Exito", JOptionPane.INFORMATION_MESSAGE, iconoExito);
                            break;
                        }
                        case 1: {
                            String nombre = (String) JOptionPane.showInputDialog(null, "Ingrese nombre", "Nombre", JOptionPane.INFORMATION_MESSAGE, iconoPersona, null, "Nombre");
                            long cedula = Long.parseLong((String) JOptionPane.showInputDialog(null, "Ingrese cedula", "Cedula", JOptionPane.INFORMATION_MESSAGE, iconoCedula, null, 0000));
                            Persona pepito = new Persona(nombre, cedula);
                            long valorDeFactura = Long.parseLong((String) JOptionPane.showInputDialog(null, "Ingrese valor$$", "Valor", JOptionPane.INFORMATION_MESSAGE, iconoDinero, null, 0));
                            sistemaFacturacion.crearFactura(1, valorDeFactura, pepito);
                            JOptionPane.showMessageDialog(null, "Factura creada con exito!!", "Exito", JOptionPane.INFORMATION_MESSAGE, iconoExito);
                            break;
                        }
                        case 2: {
                            String nombre = (String) JOptionPane.showInputDialog(null, "Ingrese nombre", "Nombre", JOptionPane.INFORMATION_MESSAGE, iconoPersona, null, "Nombre");
                            long cedula = Long.parseLong((String) JOptionPane.showInputDialog(null, "Ingrese cedula", "Cedula", JOptionPane.INFORMATION_MESSAGE, iconoCedula, null, 0000));
                            String ocupacion = (String) JOptionPane.showInputDialog(null, "Que ocupacion tiene?", "Ocupacion", JOptionPane.INFORMATION_MESSAGE, iconoOcupacion, new Object[]{"Profesor", "Estudiante", "Vinculado", "No vinculado"}, null);
                            Persona pepito = new Persona(nombre, cedula, ocupacion);
                            long valorDeFactura = Long.parseLong((String) JOptionPane.showInputDialog(null, "Ingrese valor$$", "Valor", JOptionPane.INFORMATION_MESSAGE, iconoDinero, null, 0));
                            sistemaFacturacion.crearFactura(2, valorDeFactura, pepito);
                            JOptionPane.showMessageDialog(null, "Factura creada con exito!!", "Exito", JOptionPane.INFORMATION_MESSAGE, iconoExito);
                            break;
                        }
                        case 3: {
                            String nombre = (String) JOptionPane.showInputDialog(null, "Ingrese nombre", "Nombre", JOptionPane.INFORMATION_MESSAGE, iconoPersona, null, "Nombre");
                            long cedula = Long.parseLong((String) JOptionPane.showInputDialog(null, "Ingrese Cedula", "Cedula", JOptionPane.INFORMATION_MESSAGE, iconoCedula, null, 00000));
                            Persona pepito = new Persona(nombre, cedula);
                            long valorDeFactura = Long.parseLong((String) JOptionPane.showInputDialog(null, "Ingrese valor$$", "Valor", JOptionPane.INFORMATION_MESSAGE, iconoDinero, null, 0));
                            sistemaFacturacion.crearFactura(3,valorDeFactura,pepito);
                            int añoVence = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Ingrese Año de vencimiento","Recuerde Fecha Actual: "+sistemaFacturacion.getFacturaVencidaCasoParticular().getFecha(),JOptionPane.INFORMATION_MESSAGE,iconoCalendario,sistemaFacturacion.topeNumeroAños().toArray(),null));
                            int mesVence = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Ingrese Mes de vencimiento","Recuerde Fecha Actual: "+sistemaFacturacion.getFacturaVencidaCasoParticular().getFecha(),JOptionPane.INFORMATION_MESSAGE,iconoCalendario,sistemaFacturacion.topeNumeroMes(añoVence).toArray(),null));
                            int diaVence = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Ingrese Dia de vencimiento","Recuerde Fecha Actual: "+sistemaFacturacion.getFacturaVencidaCasoParticular().getFecha(),JOptionPane.INFORMATION_MESSAGE,iconoCalendario,sistemaFacturacion.topeNumeroDias(mesVence,añoVence).toArray(),null));
                            sistemaFacturacion.getFacturaVencidaCasoParticular().cantidadDiasRecargo(diaVence,mesVence,añoVence);
                            sistemaFacturacion.getFacturaVencidaCasoParticular().calcularValorApagar();
                            JOptionPane.showMessageDialog(null, "Factura creada con exito!!", "Exito", JOptionPane.INFORMATION_MESSAGE, iconoExito);
                            break;
                        }
                    }
                    break;
                }
                case 1: {
                    String tabla = "";
                    for (Factura tablaMuestra : sistemaFacturacion.getFacturas()) {
                        tabla += tablaMuestra.getTipoFactura() + " C.I. " + tablaMuestra.getNumeroFactura() + " Valor..." + tablaMuestra.getValor() + "$\n";
                    }
                    JOptionPane.showMessageDialog(null, tabla, "Tabla de facturas pendientes", JOptionPane.INFORMATION_MESSAGE, iconoFactura);
                    break;
                }
                case 2: {
                    boolean cicloPago = true;
                    do {
                        String codigoPago = (String) JOptionPane.showInputDialog(null, "Que codigo desea pagar?", "Pago de facturas", JOptionPane.INFORMATION_MESSAGE, iconoDinero, sistemaFacturacion.codigosFacturas().toArray(), 0);
                        Factura muestraPantalla = sistemaFacturacion.mostrarFactura(codigoPago);
                        int opcionEnPago = JOptionPane.showConfirmDialog(null, muestraPantalla.getTipoFactura() + " C.I. " + muestraPantalla.getNumeroFactura() + "\nA nombre de " + muestraPantalla.getPersona().getNombre() + "\nC.c. " + muestraPantalla.getPersona().getCedula() + "\nFecha  " + muestraPantalla.getFecha() + "\nValor :" + muestraPantalla.getValor() + " $\nDesea pagar?", "Pago de Factura", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if (opcionEnPago == 0) {
                            long valorPago = Long.parseLong((String) JOptionPane.showInputDialog(null, "Ingrese dinero", "Pago", JOptionPane.INFORMATION_MESSAGE, iconoDinero, null, 0));
                            if (sistemaFacturacion.pagarFactura(valorPago, codigoPago)) {
                                JOptionPane.showMessageDialog(null, "Pago realizado con exito", "Pago Exitoso!!", JOptionPane.INFORMATION_MESSAGE, iconoExito);
                                cicloPago = false;
                            } else {
                                JOptionPane.showMessageDialog(null, "Lo sentimos saldo insuficiente", "Fallo en pago", JOptionPane.WARNING_MESSAGE);
                            }
                        } else if (opcionEnPago == 2) {
                            cicloPago = false;
                        }
                    } while (cicloPago);
                }
            }
        }
    }
}
