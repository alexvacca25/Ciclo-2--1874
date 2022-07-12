/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opmatriz;

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
        
        // Definir una Instancia de tipo Scanner que permite capturar informacion desde el teclado
        
        Scanner leer = new Scanner(System.in);
        
        int cant[][];
        int valorUnitario[][];
        
        int valorTotal[][];
        
        String nomProd[];
        String nomAlm[];
        
        // Definimos el Tamaño de las matrices
        System.out.println("Productos? : ");
        int filas=leer.nextInt();
        System.out.println("Almacenes? : ");
        int col=leer.nextInt();
        cant=new int[filas][col];
        valorUnitario=new int[filas][col];
        valorTotal=new int[filas][col];
        
        nomProd= new String[filas];
        nomAlm= new String[col];
        
        for (int c=0; c<filas; c++){
           
            System.out.print("Ingrese el Nombre del Producto: ");
            nomProd[c]=leer.next();
            
            System.out.print("Ingrese el Nombre del Almacen: ");
            nomAlm[c]=leer.next();
           
           
        }
        
        
        // Capturar la informacion - Ingresar datos a las Matrices
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<col;j++){
                System.out.print("Ingrese la Cantidad del Producto: "+ nomProd[i] + " del Almacen: "+ nomAlm[j] +": ");
                cant[i][j]=leer.nextInt();
                System.out.print("Ingrese el Vr Unitario del Producto: " + nomProd[i] + " del Almacen: " + nomAlm[j] + ": ");
                valorUnitario[i][j]=leer.nextInt();
                
            }
            
        }
        
        //Multiplicamos las Matrices
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<col;j++){
                valorTotal[i][j]=cant[i][j]*valorUnitario[i][j];
            }
            
        }
        
        //Ver el Resultado
        String verfila;
        for(int i=0; i<filas; i++){
            verfila="";
            for(int j=0; j<col;j++){
                verfila=verfila+valorTotal[i][j]+ " ";
            }
            System.out.println(verfila);  
            
          }
        
        
        
    }
    
}
