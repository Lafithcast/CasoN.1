/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado.n.pkg1;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author lcast
 */
public class Calculo {
    public static int calcularPuntos(Factura factura) {
        int puntos = 0;
        if (factura.getProductosElectricos() > 0 && factura.getProductosAutomotrices() > 0 && factura.getProductosConstruccion() > 0 && factura.getMonto() > 50000) { puntos = puntos + 3;
        }
        if (factura.getProductosElectricos() >= 1) {
            puntos = puntos + 1;
        }
        if (factura.getProductosAutomotrices() >= 1) {
            puntos = puntos + 1;
        }
        if (factura.getProductosConstruccion() >= 1) {
            puntos = puntos + 2;
        }
        if (factura.getMonto() > 50000) {
            puntos = puntos + 1;
        }

        return puntos;
    }
    public static double calcularComisionesTotales(Factura[] facturas, int cantidad) {
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            total = total + facturas[i].calcularBonoFactura();
        }
        return total;
    }
    public static double calcularTotalVendido(Factura[] facturas, int cantidad) {
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            total = total + facturas[i].getMonto();
        }
        return total;
    }
    public static int calcularPuntosTotales(Factura[] facturas, int cantidad) {
        int total = 0;
        for (int i = 0; i < cantidad; i++) {
            total = total + calcularPuntos(facturas[i]);
        }
        return total;
    }
    public static double CalculoPuntosExtra(double totalFacturas) {
        return totalFacturas * 0.30;
    }
    public static double calcularBonoExtra(double totalFacturas, int cantidadFacturas) {
    double bonoExtra = 0;
    if (cantidadFacturas > 3) {
        bonoExtra = 20000;
    }
    if (bonoExtra == 0 && totalFacturas > 300000) {
        bonoExtra = 20000;
    }
    return bonoExtra;
    }
}
