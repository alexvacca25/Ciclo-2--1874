/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases01;

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
        
        
        System.out.println("Codigo del Articulo: ");
        int cod=leer.nextInt();
        System.out.println("Precio de Compra: ");
        int precio=leer.nextInt();
        System.out.println("Cantidad en Bodega: ");
        int cantBod=leer.nextInt();
        System.out.println("Cantidad Minima Requerida: ");
        int cantReq=leer.nextInt();
        
        Producto p1 = new Producto(cod,precio,cantBod,cantReq);
        
        if(p1.solicitar()){
            System.out.println("!!!ALERTA!!!Solicitar Mercancia al Provedor");
        }else{
            System.out.println("Suficiente Merca");
        }     
        
                
        
        
        
        
    }
    
}
