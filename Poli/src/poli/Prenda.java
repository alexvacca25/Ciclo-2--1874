/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poli;

/**
 *
 * @author ALEX
 */
public class Prenda extends Producto {
    private String talla;
    private boolean planchado;

    public Prenda(String talla, boolean planchado, int codigo, String nombre) {
        super(codigo, nombre);
        this.talla = talla;
        this.planchado = planchado;
    }
    
    @Override
    public boolean solicitar(){
        System.out.println("Lista de Prendras");
        return true;
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
