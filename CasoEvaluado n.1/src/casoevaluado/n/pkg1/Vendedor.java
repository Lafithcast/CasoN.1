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
public class Vendedor {
    private String nombre;
    private String apellido;
    private String cedula;
    private String codigo;
    private String sucursal;
    private String empresa;
    private boolean tieneCarro;
    
    public Vendedor(String nombre,String apellido,String cedula,String codigo,String sucursal,String empresa,boolean tieneCarro){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.codigo = codigo;
        this.empresa = empresa;
        this.sucursal = sucursal;
        this.tieneCarro = tieneCarro;
        
        
    }

    Vendedor(String nombre, String apellidos, String cedula, String codigo, String sucursal, String empresa, String carro) {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getSucursal() {
        return sucursal;
    }
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public boolean isTieneCarro() {
        return tieneCarro;
    }
    public void setTieneCarro(boolean tieneCarro) {
        this.tieneCarro = tieneCarro;
    }
        String getApellidos() { 
        return apellido;
    }
    public void mostrarInfo(){
        String info = "Vendedor: " + nombre + " " + apellido +
                      "\nCédula: " + cedula +
                      "\nCódigo: " + codigo +
                      "\nSucursal: " + sucursal +
                      "\nEmpresa: " + empresa +
                      "\nTiene vehículo propio: " + (tieneCarro ? "Sí" : "No");
        JOptionPane.showMessageDialog(null, info);
    }
}
