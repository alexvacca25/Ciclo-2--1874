/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

/**
 *
 * @author ALEX
 */
public class Calzado extends Producto {
    
    private int talla;

    public Calzado(int talla, int codigo, String descripcion, double precioCompra, double precioVenta, int cantBodega, int cantMinReq, int cantMaxPer, double porcentaje) {
        super(codigo, descripcion, precioCompra, precioVenta, cantBodega, cantMinReq, cantMaxPer, porcentaje);
        this.talla = talla;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

       
    
    
}
