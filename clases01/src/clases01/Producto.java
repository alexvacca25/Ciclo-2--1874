/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases01;

/**
 *
 * @author ALEX
 */
public class Producto {
    
    // Atributos
    int codigo;
    int precioCompra;
    int cantBodega;
    int cantMinReq;

    public Producto(int codigo, int precioCompra, int cantBodega) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.cantBodega = cantBodega;
        this.cantMinReq=50;
    }
       
    
    // Constructor
   //codigop=cod, precioComprap=precio
    public Producto(int codigop, int precioComprap, int cantBodega, int cantMinReq) {
        this.codigo = codigop;
        this.precioCompra = precioComprap;
        this.cantBodega = cantBodega;
        this.cantMinReq = cantMinReq;
    }
    
    // Cuando se debe Solicitar Producto al Provedor (Bodega <= Minimo Requerido)
    
    public boolean solicitar(){
    
        //     100 <= 50 = false
        //     10 <=50  = true
        return cantBodega<=cantMinReq;
        
        /*
        if(cantBodega<=cantMinReq){
            return "Solicitar";
        }else{
            return "No Solicitar";
        }
    
*/
    }
    

  
  
    
    
    
}
