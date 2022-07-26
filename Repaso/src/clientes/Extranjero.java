/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

/**
 *
 * @author ALEX
 */
public class Extranjero extends Cliente {
    
    private String pasaporte;

    public Extranjero(String pasaporte, int id, String nombre) {
        super(id, nombre);
        this.pasaporte = pasaporte;
    }
    
  @Override
    public void mensaje (){
        System.out.println((4*5)+1);
    }
    
    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }
    
    
    
    
}
