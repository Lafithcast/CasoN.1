/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado.n.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author lcast
 */
public class CasoEvaluadoN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Digite el nombre del vendedor: ");
        String apellidos = JOptionPane.showInputDialog("Digite los apellidos del vendedor: ");
        String cedula = JOptionPane.showInputDialog("Digite la cédula: ");
        String codigo = JOptionPane.showInputDialog("Digite el código del vendedor: ");
        String sucursal = JOptionPane.showInputDialog("Digite la sucursal: ");
        String empresa = JOptionPane.showInputDialog("Digite el nombre de la empresa: ");
        String respuestaCarro = JOptionPane.showInputDialog("¿El vendedor tiene carro? (si / no): ");
        boolean tieneCarro = false;

        if (respuestaCarro == "si") {
            tieneCarro = true;
        }
        Vendedor vendedor = new Vendedor(nombre, apellidos, cedula, codigo, sucursal, empresa, tieneCarro);
        double totalVendido = 0;
        double totalComisiones = 0;
        int totalPuntos = 0;
        int cantidadFacturas = 0;
        String continuar = "si";

        while (continuar == "si") {
            String nombreCliente = JOptionPane.showInputDialog("Nombre del cliente:v");
            String cedulaCliente = JOptionPane.showInputDialog("Cédula del cliente:v");
            String codigoFactura = JOptionPane.showInputDialog("Código de factura:v");
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Monto de la factura en colones: "));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Número del mes (1 al 12): "));
            while (mes > 12) {
                mes = Integer.parseInt(JOptionPane.showInputDialog("Este mes no existe, Ingrese de 1 al 12: "));
            }
            int productosElectricos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos eléctricos: "));
            int productosAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos automotrices: "));
            int productosConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos de construcción: "));
            String estado = JOptionPane.showInputDialog("Estado de la factura: ");
            Factura factura = new Factura(nombreCliente, cedulaCliente, codigoFactura, monto, mes, productosElectricos, productosAutomotrices, productosConstruccion, estado);
            totalVendido = totalVendido + factura.getMonto();
            totalComisiones = totalComisiones + factura.calcularBonoFactura();
            totalPuntos = totalPuntos + Calculo.calcularPuntos(factura);
            cantidadFacturas = cantidadFacturas + 1;
            continuar = JOptionPane.showInputDialog("¿Desea ingresar otra factura? (si o no):");

            if (continuar == "no") {
                break;
            }
        }

        double bonoExtra = Calculo.calcularBonoExtra(totalVendido, cantidadFacturas);
        double puntosExtra = Calculo.CalculoPuntosExtra(totalVendido);
        double totalFinal = totalComisiones + bonoExtra;

        String Imprimir = "Resumen---\n"
                + "\nNombre: " + vendedor.getNombre() + " " + vendedor.getApellidos()
                + "\nCódigo: " + vendedor.getCodigo()
                + "\nSucursal: " + vendedor.getSucursal()
                + "\nEmpresa: " + vendedor.getEmpresa()
                + "\nTiene carro: " + (vendedor.isTieneCarro() ? "Sí" : "No")
                + "\nFacturas registradas: " + cantidadFacturas
                + "\nTotal vendido: " + totalVendido
                + "\nTotal comisiones: " + totalComisiones
                + "\nBono extra: " + bonoExtra
                + "\nTotal final: " + totalFinal
                + "\nPuntos obtenidos: " + totalPuntos
                + "\nPuntos extra: " + puntosExtra;
        JOptionPane.showMessageDialog(null, Imprimir);
    }
}
