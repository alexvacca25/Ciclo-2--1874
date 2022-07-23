/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

/**
 *
 * @author ALEX
 */
public class Prendas extends Producto {
        private String Talla;
        private boolean planchado;

    public Prendas(String Talla, boolean planchado, int codigo, String descripcion, double precioCompra, double precioVenta, int cantBodega, int cantMinReq, int cantMaxPer, double porcentaje) {
        super(codigo, descripcion, precioCompra, precioVenta, cantBodega, cantMinReq, cantMaxPer, porcentaje);
        this.Talla = Talla;
        this.planchado = planchado;
    }
    
    
     @Override
     public double totalApagar(int unidades){
         System.out.println("Total sin Descuento: "+ super.totalApagar(unidades));
         
       return (precioCompra*unidades)-((precioCompra*unidades)*porcentaje);
   }
    
    

    public boolean isPlanchado() {
        return planchado;
    }

    public void setPlanchado(boolean planchado) {
        this.planchado = planchado;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }
    
    
        
        
}
