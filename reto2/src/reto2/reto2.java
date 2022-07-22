/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto2;

import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public class reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuerpoDeAgua[] cuerposAgua;
        Scanner leer= new Scanner(System.in);
        
        //Solicitar la cantidad de cuerpos de agua
        int n=Integer.parseInt(leer.nextLine());
        cuerposAgua= new CuerpoDeAgua[n];
         
      
        
        //Ingresar la informaicon de los cuerpos de agua
        for(int i=0; i<n; i++){
                 
         String[] captura= leer.nextLine().split(" ");
        
         System.out.println(captura.length);
         cuerposAgua[i]=new CuerpoDeAgua(captura[0],Integer.parseInt(captura[1]), captura[2],Double.parseDouble(captura[3]));
           
                  
        }
        
        leer.close();
        
        
         for(int i=0; i<n; i++){
             
             System.out.println(cuerposAgua[i].nivel());
             
         }
        
        
    }
    
}
