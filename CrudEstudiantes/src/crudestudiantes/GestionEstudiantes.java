/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudestudiantes;

import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public class GestionEstudiantes {
    
    public static Estudiante[] estudiantes = new Estudiante[100];
    
    public static void CrearEstudiantes(){
        Scanner leer = new Scanner(System.in);
        
        int num;
        int codigo;
        String nombre;
        double nota1;
        double nota2;
        double nota3;
        
        System.out.println("Numero de Estudiantes a Ingresar");
        num=leer.nextInt();
        
        for (int i=0; i<num;i++){
        System.out.println("Datos del Estudiante Numero: " + (i+1));
        
        System.out.print("Ingrese el Codigo: ");
        codigo=leer.nextInt();
        System.out.print("Ingrese el Nombre: ");
        nombre=leer.next();
        System.out.print("Ingrese la Nota 1: ");
        nota1=leer.nextDouble();
        System.out.print("Ingrese la Nota 2: ");
        nota2=leer.nextDouble();
        System.out.print("Ingrese la Nota 3: ");
        nota3=leer.nextDouble();
        
        estudiantes[i] = new Estudiante(codigo,nombre,nota1,nota2,nota3);
        
        
        }
        
        
    }
    
    public static void ListarEstudiantes(){
        
    }
    
    public static void ModificarEstudiantes(){
        
    }
    
    public static void EliminarEstudiantes(){
        
    }
}
        
    

