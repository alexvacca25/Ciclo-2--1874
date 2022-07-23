/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

/**
 *
 * @author ALEX
 */
public class Extranjeros extends Persona{
    private boolean pasaporte;

    public Extranjeros(boolean pasaporte, int codigo, String nombre, String apellido, int edad) {
        super(codigo, nombre, apellido, edad);
        this.pasaporte = pasaporte;
    }
    
    
    @Override
     public void facturar(){
        super.facturar();
        System.out.println("Facturacion Persona + Impuesto");
    }

    public boolean isPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(boolean pasaporte) {
        this.pasaporte = pasaporte;
    }

    
    
    
}
