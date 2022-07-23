/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author ALEX
 */
public class Accesorios extends Producto {
    private String tipo;

    public Accesorios(String tipo, int codigo, String Nombre) {
        super(codigo, Nombre);
        this.tipo = tipo;
    }
    
    
    @Override
   public boolean solicitar(){
       System.out.println("Desde Accesorios");
       return true;
   } 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
   
    
}
