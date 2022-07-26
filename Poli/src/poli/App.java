/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poli;
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
        ArrayList<Producto>  productos = new ArrayList<Producto>();
        
        Producto a = new Calzado(38, 100, "Tenis Adidas");
        Producto b = new Prenda("M", true, 200, "Camisa manga Corta");
        Producto c = new Accesorios("Joyas", 300, "Aretes de Oro");
        
        productos.add(a);
        productos.add(b);
        productos.add(c);
        
        for(int i=0; i<productos.size();i++){
            System.out.println(productos.get(i).solicitar());
        }        
        
        for(Producto item:productos){
            System.out.println(item.solicitar());
        }
                
         }
    
}
