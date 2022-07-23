/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author ALEX
 */
public class Calzado extends Producto{
    private int talla;

    public Calzado(int talla, int codigo, String Nombre) {
        super(codigo, Nombre);
        this.talla = talla;
    }
    
    @Override
    public boolean solicitar(){
        System.out.println("Solicitar desde Calzado");
       return false;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    
}
