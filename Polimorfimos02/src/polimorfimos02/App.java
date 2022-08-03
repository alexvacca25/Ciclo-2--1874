/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfimos02;

import java.util.ArrayList;

/**
 *
 * @author ALEX
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<OpMatematicas> operaciones = new ArrayList<OpMatematicas>();
        
        OpMatematicas op1 = new Suma(5, 10);
        OpMatematicas op2 = new Suma(4, 8);
        OpMatematicas op3 = new Resta(4, 8);
        OpMatematicas op4 = new Operaciones(4, 10, "x");
        
      
        
        operaciones.add(op1);
        operaciones.add(op2);
        operaciones.add(op3);
        operaciones.add(op4);
        
        for(OpMatematicas item: operaciones){
            item.calcular();
            item.informe();
        }
        
        
        
    }
    
}
