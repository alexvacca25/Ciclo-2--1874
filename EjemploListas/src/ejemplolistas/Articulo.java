/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplolistas;

/**
 *
 * @author ALEX
 */
public class Articulo {
    private String codigo;
    private String detalle;
    private double valorU;

    public Articulo(String codigo, String detalle, double valorU) {
        this.codigo = codigo;
        this.detalle = detalle;
        this.valorU = valorU;
    }
    
    // Calcular el Valor de la Compra
    
    public double facturaCompra(int unidades){
        return valorU*unidades;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getValorU() {
        return valorU;
    }

    public void setValorU(double valorU) {
        this.valorU = valorU;
    }
    
    
    
}
