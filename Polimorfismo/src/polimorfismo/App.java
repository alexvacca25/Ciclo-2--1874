/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

import java.util.ArrayList;

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
        ArrayList<Producto> productos = new ArrayList<Producto>();
        
        Producto a = new Accesorios("Aretes",1001,"Oro");
       // System.out.println(a.solicitar());
        
        Producto b = new Calzado(38, 1002, "Tennis");
      //  System.out.println(b.solicitar());
        
        Producto c = new Prendas("M", true, 1003, "Camisa");
        
        System.out.println(c.ge);
        
        productos.add(a);
        productos.add(b);
        productos.add(c);
        
        
        for(Producto item: productos){
            System.out.println(item.solicitar());
        }
        
        
        
    }
    
}
