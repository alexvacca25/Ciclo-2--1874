/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces02;

/**
 *
 * @author ALEX
 */
public class Taxi extends Autos implements Vehiculo{
      
    int velocidad=0;
  
 
    public Taxi(String placa, String tipo) {
        super(placa, tipo);
    }

    public Taxi() {
    }
    
    @Override
    public void apagar(){
        velocidad=0;
    }
    
    
    
    @Override
    public String frenar(int cuanto){
       
       velocidad-=cuanto;
        
        return velocidad + "Km/h";
    }
    
    @Override
    public String acelerar(int cuanto){
        String cad="";
        velocidad +=cuanto;
        
        if(velocidad>VELOCIDAD_MAXIMA)
            cad="Exceso de Velocidad";
        
        cad += " Velocidad: " + velocidad + "Km/h";
        return cad;
    }
    
}
