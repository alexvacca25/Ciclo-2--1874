/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in);
        
        String numero="1234";
        
        int numero2=Integer.parseInt(numero)*5;
        double numero3=Double.parseDouble(numero);
        System.out.println("Op: "+ numero2);
        System.out.println("Op: "+ numero3);
       
         //int op = leer.nextInt();
         boolean valido=false;
       
         do{
         
        try {
            System.out.println("Ingrese un numero: ");    
         
        String numero4 = leer.nextLine();    
        int op = Integer.parseInt(numero4);
        
                
         valido=true;
        } catch (Exception e) {
            
            System.out.println("Ingrese un tipo de dato correcto");    
   
        }
         }while(!valido);
        
    }
    
}
