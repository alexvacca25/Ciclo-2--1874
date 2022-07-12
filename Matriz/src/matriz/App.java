/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

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
        Scanner leerDatos = new Scanner(System.in);
        int m[][];
        System.out.println("Filas?: ");
        int filas=leerDatos.nextInt();
        System.out.println("Columna?: ");
        int col=leerDatos.nextInt();
        //    0 1 2
        //  0 1 2 3
        //  1 4 5 6 
        //  2 7 8 9 
        
        // Capturar la Informacion y Almacenar
        m=new int[filas][col];
        
        for (int i=0; i<filas; i++){
            
            for(int j=0; j<col; j++){
                System.out.println("Ingrese la Cantidad [ "+i+" , "+ j+" ]=>");
                m[i][j]=leerDatos.nextInt();
            }
            
        }
        
        // Visualizar la Informacion de la Matriz
        String verFila;
        for (int i=0; i<filas; i++){
            verFila="";
            for(int j=0; j<col; j++){
                verFila=verFila+m[i][j]+ " ";
            }
            System.out.println(verFila);
        }
        
        //Busqueda de informacion
        System.out.println("Buscar Informacion : ");
        int buscar=leerDatos.nextInt();
        boolean verificar=false;
        for (int i=0; i<filas; i++){
             for(int j=0; j<col; j++){
               if(m[i][j]==buscar){
                   verificar=true;
                   System.out.println("Informacion Encontrada en la Posicion ["+i+","+j+"]");
               }
            }
            
                    
        }
        
        if(verificar==false){
             System.out.println("Informacion no Encontrada");
         }    
        
    }
    
}
