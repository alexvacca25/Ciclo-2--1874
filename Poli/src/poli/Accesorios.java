/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poli;

/**
 *
 * @author ALEX
 */
public class Accesorios extends Producto {
    private String Tipo;

    public Accesorios(String Tipo, int codigo, String nombre) {
        super(codigo, nombre);
        this.Tipo = Tipo;
    }
    
    @Override
    public boolean solicitar(){
        System.out.println("Lista de Accesorios");
        return false;
    }
    
    

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    

   
    
    
}
