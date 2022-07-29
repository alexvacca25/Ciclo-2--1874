/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces02;

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
        Taxi t1 = new Taxi();
        System.out.println(t1.acelerar(100));
        System.out.println(t1.frenar(20));
        System.out.println(t1.acelerar(130));
        System.out.println("----------------------------------");
        Taxi t2 = new Taxi("ABC123", "InterMunicipal");
        t2.apagar();
        System.out.println(t2.acelerar(20));
        System.out.println(t2.frenar(50));
        System.out.println(t2.acelerar(80));
        
        System.out.println("------------------------------------");
        Bus b1 = new Bus("CDE", "Doble Piso", 40);
        b1.apagar();
        System.out.println(b1.acelerar(0));
        System.out.println(b1.frenar(0));
        System.out.println("Valor Pasaje => "+ b1.calcularValor("Cali"));
        System.out.println("Valor Pasaje => "+ b1.calcularValor("Barranquilla"));
        
        
        
    }
    
}
