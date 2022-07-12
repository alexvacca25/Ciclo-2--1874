/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

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
        int M[][];
        System.out.println("Fila?");
        int fila=leer.nextInt();
        System.out.println("Columna?");
        int col= leer.nextInt();
        M = new int[fila][col];
        
        for(int i=0; i<fila; i++){
            for (int j=0; j<col; j++){
                System.out.print("["+i+","+j+"]=> ");
                M[i][j]=leer.nextInt();
            }
        }
        
        String verfila;
        
        for(int i=0; i<fila; i++){
            verfila="";
            for (int j=0; j<col; j++){
                
                verfila=verfila+M[i][j]+ " ";
               
            }
            System.out.println(verfila);
        }
        
        
        
        
        
    }
    
}
