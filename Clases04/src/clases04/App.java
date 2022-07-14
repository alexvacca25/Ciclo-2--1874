/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases04;

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
        System.out.println("Codigo: ");
        int cod=leer.nextInt();
        System.out.println("Nombre: ");
        String nom=leer.next();
        System.out.println("Nota1 : ");
        double n1=leer.nextDouble();
        System.out.println("Nota2 : ");
        double n2=leer.nextDouble();
        System.out.println("Nota3 : ");
        double n3=leer.nextDouble();
        
        Estudiante e1 = new Estudiante(cod,nom,n1,n2,n3);
        
        System.out.println("Estudiante: "+ e1.getNombre());
        System.out.println("Definitiva: "+ e1.definitiva());
        if(e1.resultado()){
            System.out.println("Definitiva: Aprobado");
        }else{
            System.out.println("Definitiva: Reprobado");
        }
    }
    
}
