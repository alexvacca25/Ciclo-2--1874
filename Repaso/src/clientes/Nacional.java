/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

/**
 *
 * @author ALEX
 */
public class Nacional extends Cliente {
    
    private int cedula;

     
    
    public Nacional(int cedula, int id, String nombre) {
        super(id, nombre);
        this.cedula = cedula;
    }
    
    
    @Override
    public void mensaje (){
        System.out.println((4*5)-1);
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
}
