/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hereanciafacturacion;

import facturacion.Calzado;
import facturacion.Prendas;

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
        
        Prendas camisa = new Prendas("M", true, 1001, "Camisa Manga Corta", 1200, 2000, 20, 10, 50, 0.1);
        Calzado tennis = new Calzado(38, 1002, "Tennis Adidas", 800, 1500, 5, 5, 50, 0.2);
        
        System.out.println("Solicitar? " + camisa.solicitud());
        
        System.out.println("Solicitar? " + tennis.solicitud());
        
        System.out.println("Total a Pagar: "+ camisa.totalApagar(10));
        System.out.println("Total a Pagar: "+ tennis.totalApagar(5));
        
        
        System.out.println("Total Camisas: " + camisa.getCantBodega());
        System.out.println("Total Tennis : " + tennis.getCantBodega());
        
        camisa.setCantBodega(camisa.getCantBodega()+10);
        tennis.setCantBodega(tennis.getCantBodega()+5);
        
        System.out.println("Total Camisas: " + camisa.getCantBodega());
        System.out.println("Total Tennis : " + tennis.getCantBodega());
        
        
        
        
        
        
        
        
    }
    
}
