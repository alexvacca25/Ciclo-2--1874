/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores;

/**
 *
 * @author ALEX
 */
public class Metodos {
    
    public static String nombreEstudiante="Soy un Atributo Static";
    
    public static String abc[]={"A", "E","I","O","U"};
    
    public static void Menu(){
        
        System.out.println("Menu Principal");
        System.out.println("1. Clientes");
        System.out.println("2. Productos");
        System.out.println("3. Ventas");
        System.out.println("4. Salir");
    }
    
    public static double Definitiva(double n1, double n2, double n3){
        return n1*0.3+n2*0.3+n3*0.4;
    }
    
    public static void CrearNotas(){
        
        String nombre="Alex";
        double n1=3.0;
        double n2=4.0;
        double n3=5.0;
        
        Calificacion E1 = new Calificacion();
        
        System.out.println("Definitiva = "+ E1.NotaDefinitiva());
        
                
        E1.setNombre(nombre);
        E1.setN1(n1);
        E1.setN2(n2);
        E1.setN3(n3);
        
        System.out.println("Definitiva = "+ E1.NotaDefinitiva());
               
        System.out.println(E1.getNombre());
        System.out.println(E1.getN1());
        System.out.println(E1.getN2());
        System.out.println(E1.getN3());
    }
    
    
    
}
