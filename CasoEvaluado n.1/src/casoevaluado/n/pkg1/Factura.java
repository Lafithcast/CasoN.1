/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado.n.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author lcast
 */
public class Factura {
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double monto;
    private int mes; 
    private int productosElectricos;
    private int productosAutomotrices;
    private int productosConstruccion;
    private String estadoFactura;
    private int puntos;
    private double bono;
    
    public Factura(String nombreCliente, String cedulaCliente, String codigoFactura, double monto,int mes, int productosElectricos, int productosAutomotrices, int productosConstruccion,String estadoFactura) {
    this.nombreCliente = nombreCliente;
    this.cedulaCliente = cedulaCliente;
    this.codigoFactura = codigoFactura;
    this.monto = monto;
    this.mes = mes;
    this.productosElectricos = productosElectricos;
    this.productosAutomotrices = productosAutomotrices;
    this.productosConstruccion = productosConstruccion;
    this.estadoFactura = estadoFactura;
    this.bono = 0;
    this.puntos = 0;
    }
    public String NumeroDeMes(){
        switch (mes){
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Setiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "Mes inválido";
        }
    }
        public double Error() {
        return monto * 0.01;
        }
        public void CalcularPuntosYBonos(){
        bono = 0;
        puntos = 0;
        if (productosElectricos > 0 && productosAutomotrices > 0 && productosConstruccion > 0 && monto > 50000) {
            bono += monto * 0.10;
            puntos += 3;
        }
        if (productosElectricos >= 3) {
            bono += monto * 0.04;
        } else {
            bono += monto * 0.02;
        }
        puntos += 1;
        bono += Error();
        if (productosAutomotrices > 4) {
            bono += monto * 0.04;
        } else {
            bono += monto * 0.02;
        }
        puntos += 1;
        if (productosConstruccion > 0) {
            bono += monto * 0.08;
            puntos += 2;
        }
        if (monto > 50000) {
            bono += monto * 0.05;
            puntos += 1;
    }
   }
        public void Factura(){
        String info = "Factura del cliente: " + nombreCliente + "\nCédula: " + cedulaCliente + "\nCódigo: " + codigoFactura + "\nMonto en colones: " + monto + "\nMes: " + NumeroDeMes()+ "\nBonos obtenidos en colones: " + bono + "\nPuntos generados: " + puntos + "\nEstado: " + estadoFactura;
        JOptionPane.showMessageDialog(null, info);
        }

public int getProductosElectricos() {
    return productosElectricos;
}

public int getProductosAutomotrices() {
    return productosAutomotrices;
}

public int getProductosConstruccion() {
    return productosConstruccion;
}

public double getMonto() {
    return monto;
}

public double calcularBonoFactura() {
    double bono = 0;
    if (productosElectricos > 0 && productosAutomotrices > 0 && productosConstruccion > 0 && monto > 50000) {
        bono = bono + (monto * 0.10);
    }
    if (productosElectricos >= 3) {
        bono = bono + (monto * 0.04);
    } else {
        bono = bono + (monto * 0.02);
    }
    if (productosAutomotrices > 4) {
        bono = bono + (monto * 0.04);
    } else {
        bono = bono + (monto * 0.02);
    }
    if (productosConstruccion > 0) {
        bono = bono + (monto * 0.08);
    }
    if (monto > 50000) {
        bono = bono + (monto * 0.05);
    }
    bono = bono + calculaErroneo();

    return bono;
}
public double calculaErroneo() {
    return monto * 0.01;
}
}
