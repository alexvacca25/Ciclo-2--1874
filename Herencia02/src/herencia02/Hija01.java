/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia02;

/**
 *
 * @author ALEX
 */
public class Hija01 extends Padre {
    
    private String genero;

    public Hija01(String genero, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.genero = genero;
    }
    
    // Metodo clase hija 
    
    @Override
     public void mensaje(){
        
        System.out.println("Soy la hija");
    }
     
     public void calculoEdad(){
         System.out.println(edad+5);
     }
    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
    
    
}
