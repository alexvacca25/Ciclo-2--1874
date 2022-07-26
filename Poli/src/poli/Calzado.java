/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poli;

/**
 *
 * @author ALEX
 */
public class Calzado extends Producto {
    private int talla;

    public Calzado(int talla, int codigo, String nombre) {
        super(codigo, nombre);
        this.talla = talla;
    }
    
    @Override
    public boolean solicitar(){
        System.out.println("Lista de Calzados");
        return false;
    }
    

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

   
    
    
    
}
