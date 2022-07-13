/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases02;

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
        Producto[] productos = new Producto[100];
        
        System.out.println("# de Productos a Ingresar: ");
        int n=leer.nextInt();
        
        for (int i=0; i<n; i++){
            System.out.println("Codigo    : ");
            int cod=leer.nextInt();
            System.out.println("Precio    : ");
            int precio=leer.nextInt();
            System.out.println("Cantidad  : ");
            int cant=leer.nextInt();
            System.out.println("Requerido : ");
            int req=leer.nextInt();
            
            productos[i]= new Producto(cod,precio,cant,req);
        }
        
        for (int i=0; i<n; i++){
            
            if(productos[i].solicitar()){
                System.out.println("El Codigo: "+ productos[i].getCodigo()+ "Cant:("+productos[i].getCantB() +")"+ " SOLICITAR");
            }else{
                System.out.println("El Codigo: "+ productos[i].getCodigo()+ "Cant:("+productos[i].getCantB() +")"+ " NORMAL");
            }
            
            
        }
        
        
    }
    
}
