/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces01;

/**
 *
 * @author ALEX
 */
public class Taxi extends Autos implements Vehiculo,Pasajeros {
    
    int velocidad=0;

    public Taxi(String placa, String tipo) {
        super(placa, tipo);
    }
    
     @Override
    public String valorPasaje(String ciudad){
        String cadena;
       
        switch (ciudad) {
            case "Manaure":
                cadena="Valor Pasaje 40.000";
                break;
            case "Mecitas":
                cadena="Valor Pasaje 50.000";
                break;
             case "Anapoima":
                cadena="Valor Pasaje 35.000";
                break;   
            default:
                cadena="Ciudad no Encontrada";
        }
      
        return cadena;
    }
           
    @Override
    public String frenar(int cuanto){
        velocidad -= cuanto;
        return velocidad + " Km/h";
    }
    
    @Override
    public String acelerar(int cuanto){
        String cadena="";
        velocidad += cuanto;
        
        if(velocidad>VELOCIDAD_MAXIMA)
            cadena="Exceso de VELOCIDAD";
        
        cadena = cadena + " la Velocidad del taxi es: "+ velocidad + "Km/h";
        
        return cadena;
    }
    
}
