/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores;

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
        
        int v[]=new int[100];
        int z[];
        
        System.out.println("Ingrese el Numero de Estudiantes");
        int est=leer.nextInt();
        z=new int[est];
        
        /*
        System.out.println("Ingrese el Numero de Estudiantes: ");
        int n=leer.nextInt();
        // <  0 1 2 3 4
        // <= 0 1 2 3 4 5
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el Codigo del Estudiante #:("+(i+1)+") =>");
            v[i]=leer.nextInt();
        }
        
        for(int j=0; j<n; j++){
            System.out.println("Estudiante ("+(j+1)+") =>"+ v[j]);
        }
        
        System.out.println("Ingrese el Codigo a Buscar: ");
        int codBuscar=leer.nextInt();
        
        boolean encontrar=false;
        
        for(int j=0; j<n; j++){
          if(v[j]==codBuscar){
              encontrar=true;
          }
        }
        
        if (encontrar){
            System.out.println("Estudiante Encontrado");
        }else{
            System.out.println("Estudiante no Existe");
        }
        
        */
        
    }
    
}
