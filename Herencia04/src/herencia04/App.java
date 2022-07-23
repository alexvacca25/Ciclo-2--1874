/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia04;
import facturacion.Nacionales;
import  facturacion.Persona;
import facturacion.Extranjeros;
import nomina.Empleados;



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
        Persona alex = new Persona();
        
        System.out.println(alex.getNombre());
        System.out.println(alex.getEdad());
        
        Persona henry = new Persona(1001,"Henry","Diaz");
        
        System.out.println(henry.getNombre());
        System.out.println(henry.getEdad());
        
        henry.setEdad(25);
        
        System.out.println(henry.getNombre());
        System.out.println(henry.getEdad());
        
        Nacionales pedro = new Nacionales(1065, 1001, "Pedro", "Diaz");
        
        System.out.println(pedro.getNombre());
        System.out.println(pedro.getEdad());
        
        pedro.setEdad(30);
        
        pedro.modicarCodigo();
        pedro.facturar();
         
               
        System.out.println(pedro.getCedula());
        System.out.println(pedro.getNombre());
        System.out.println(pedro.getEdad());
        
        Extranjeros jhon = new Extranjeros(true, 1002, "Jhon", "Clinton", 25);
        
        jhon.facturar();
        System.out.println(jhon.isPasaporte());
        System.out.println(jhon.getNombre());
        System.out.println(jhon.getEdad());
        
        
        Empleados maria = new Empleados(1200, 1010, "Maria", "Diaz", 40);
       
        System.out.println(maria.getNombre());
        System.out.println(maria.getEdad());
        maria.codigosEmpleados();
        
        
    }
    
}
