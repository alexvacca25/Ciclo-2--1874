/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases03;

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
        
        System.out.println("Ingrese el Codigo del Empleado: ");
        int cod=leer.nextInt();
        System.out.println("Ingrese el Nombre del Empleado: ");
        String nom=leer.next();
        System.out.println("Ingrese las Horas Trabajadas del Empleado: ");
        int horasT=leer.nextInt();
        System.out.println("Ingrese el Valor de la Hora del Empleado: ");
        int valorH=leer.nextInt();
        
        Empleado e1 = new Empleado(cod,nom,horasT,valorH);
        
        /*
        if(e1.bonificar()){
            System.out.println("Gano Bonificacion");
        }else{
            System.out.println("NO Gano Bonificacion");
        
         }
         */   

        e1.mensaje();
            
        
        
        
        
    }
    
}
