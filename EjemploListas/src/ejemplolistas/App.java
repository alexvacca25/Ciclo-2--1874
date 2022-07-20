/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplolistas;

import java.util.ArrayList;
import java.util.HashSet;
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
    ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
    
    Articulo a1 = new Articulo("1001","Papa",2500);
    Articulo a2 = new Articulo("1002","Yuca",3500);
    Articulo a3 = new Articulo("1003","Frijol",4500);
    Articulo a4 = new Articulo("1004","Plantano",5500);
    Articulo a5 = new Articulo("1005","Arroz",6500);
    
    listaArticulos.add(a1);
    listaArticulos.add(a2);
    listaArticulos.add(a3);
    listaArticulos.add(a4);
    listaArticulos.add(a5);
    
        System.out.println(listaArticulos.size());
    double facturaTotal=0;
    int unidades=0;
    for(int i=0; i<listaArticulos.size();i++){
        
        System.out.println("Articulo: "+ listaArticulos.get(i).getDetalle());
        System.out.print("Ingrese las Unidades: ");
        unidades=leer.nextInt();
        System.out.println("Articulo: "+ listaArticulos.get(i).getDetalle() + " Valor : " +listaArticulos.get(i).getValorU() + " Subtotal: " + listaArticulos.get(i).facturaCompra(unidades) );
        facturaTotal=facturaTotal+listaArticulos.get(i).facturaCompra(unidades);
    } 
    
        System.out.println("-----------------------");
        System.out.println("Total Factura: "+ facturaTotal);
        System.out.println("-----------------------");
        
 
     listaArticulos.remove(1);   
     listaArticulos.remove(3);   
        
     System.out.println(listaArticulos.get(1).getDetalle()); 
        
     listaArticulos.get(1).setDetalle("Lentejas");
     
     System.out.println(listaArticulos.get(1).getDetalle()); 
        
        
    }
    
}
