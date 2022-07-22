/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
        
       ArrayList<PrendaVestir> prendas = new ArrayList<PrendaVestir>();
       ArrayList<Calzado> calzados = new ArrayList<Calzado>();
       
       PrendaVestir p1 = new PrendaVestir("M", true, 1001, "Camisa", 12000, 20000, 5, 10, 200, 0.1);
       
        System.out.println(p1.solicitar());
        System.out.println(p1.totalApagar(50));
        p1.setCantBodega(p1.getCantBodega()+50);
        System.out.println(p1.getCantBodega());
        
        prendas.add(p1);
        
        Calzado c1= new Calzado(38, 1002, "Tennis", 0, 0, 0, 0, 0, 0);
        
        calzados.add(c1);
        
        Calzado c2 = new Calzado(40, 1003, "Convers", 0, 0, 0, 0, 0, 0);
        
        System.out.println(c2.isPlanchado());
        
        System.out.println(prendas.size()+calzados.size());
        
        Producto prod1 = new Producto(0, "Nombre", 0, 0, 0, 0, 0, 0);
        
        
        
        
        
        
        
        
    }
    
}
