/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

/**
 *
 * @author ALEX
 */
public class Nacionales extends Persona {
    private int cedula;

    public Nacionales(int cedula, int codigo, String nombre, String apellido) {
        super(codigo, nombre, apellido);
        this.cedula = cedula;
    }
    
    public void modicarCodigo(){
        System.out.println("CO"+codigo);
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
    
    
    
}
