/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces01;

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
        Taxi spark = new Taxi("ABC123","Taxis");
        System.out.println(spark.frenar(30));
        System.out.println(spark.acelerar(155));
        
        System.out.println(spark.valorPasaje("Anapoima"));
        
        Bus mercedes = new Bus("CDE456","Buses");
        System.out.println(mercedes.valorPasaje("Cali"));
        
    }
    
}
