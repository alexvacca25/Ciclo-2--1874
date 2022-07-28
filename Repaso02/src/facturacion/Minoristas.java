/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

/**
 *
 * @author ALEX
 */
public class Minoristas extends Cliente {
    
    private double descuento;

    public Minoristas(double descuento, int codigo, String nombre) {
        super(codigo, nombre);
        this.descuento = descuento;
    }
    
    @Override
     public void mensaje(){
        super.mensaje();
        System.out.println("Soy un Cliente"+ codigo +" "+ nombre + " " + descuento);
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
    
}
