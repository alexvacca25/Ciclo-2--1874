/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia01;

/**
 *
 * @author ALEX
 */
public class PrendaVestir extends Producto{
    private String talla;
    private boolean planchado;

    public PrendaVestir(String talla, boolean planchado, int codigo, String descripcion, double precioCompra, double precioVenta, int cantBodega, int cantMinReq, int cantMaxPer, double porcentaje) {
        super(codigo, descripcion, precioCompra, precioVenta, cantBodega, cantMinReq, cantMaxPer, porcentaje);
        this.talla = talla;
        this.planchado = planchado;
    }
    
    @Override
    public double totalApagar(int unidCompra){
        return (precioCompra*unidCompra-1000);
    }
    
    public boolean isPlanchado() {
        return planchado;
    }

    public void setPlanchado(boolean planchado) {
        this.planchado = planchado;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

     

   
    
    
}
