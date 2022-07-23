/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author ALEX
 */
public class Prendas extends Producto {
    private String talla;
    private boolean planchado;

    public Prendas(String talla, boolean planchado, int codigo, String Nombre) {
        super(codigo, Nombre);
        this.talla = talla;
        this.planchado = planchado;
    }
    
    @Override
    public boolean solicitar(){
        System.out.println("Desde Prendas");
        return false;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isPlanchado() {
        return planchado;
    }

    public void setPlanchado(boolean planchado) {
        this.planchado = planchado;
    }
    
    
    
}
