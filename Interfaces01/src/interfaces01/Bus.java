/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces01;

/**
 *
 * @author ALEX
 */
public class Bus extends Autos implements Pasajeros {

    public Bus(String placa, String tipo) {
        super(placa, tipo);
    }
    
    @Override
    public String valorPasaje(String ciudad){
        String cadena;
       
        switch (ciudad) {
            case "Bogota":
                cadena="Valor Pasaje 150.000";
                break;
            case "Cali":
                cadena="Valor Pasaje 250.000";
                break;
             case "Barranquilla":
                cadena="Valor Pasaje 350.000";
                break;   
            default:
                cadena="Ciudad no Encontrada";
        }
      
        return cadena;
    }
    
}
