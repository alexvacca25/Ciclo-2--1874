/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces02;

/**
 *
 * @author ALEX
 */
public class Bus extends Autos implements Vehiculo, Pasajes {

    int vel=0;
    
    public Bus(String placa, String tipo, int numPasajeros) {
        super(placa, tipo, numPasajeros);
    }
    
    @Override
    public void apagar()
    {
        vel=100;
     }
    
    @Override
    public String frenar(int cuanto){
        vel--;
        
        return vel+" Km/h";
    }
    
    @Override
    public String acelerar(int cuanto){
        vel++;
        return vel + "Km/h";
    }
    
    
    @Override
    public double calcularValor(String ciudad){
        double valor=0;
        
        switch (ciudad) {
            case "Bogota":
                valor=120000;
                break;
            case "Cali":
                valor=180000;
                break;    
            case "Barranquilla":
                valor=250000;
                break;        
            default:
                valor=0;
        }
        
        return valor;
        
               
    }
    
}
