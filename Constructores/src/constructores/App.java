/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructores;



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
        
        Metodos.Menu();
        
        String nombre="Alex";
        double n1=3.0;
        double n2=4.0;
        double n3=5.0;
        
        System.out.println("Definitiva = "+ Metodos.Definitiva(n1, n2, n3));
        
        Metodos.CrearNotas();
        
        System.out.println(Metodos.nombreEstudiante);
        
       for(String elem: Metodos.abc){
           System.out.println("Vocales "+ elem);
       }
        
        
    }
    
}
