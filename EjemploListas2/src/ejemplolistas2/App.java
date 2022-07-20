/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplolistas2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
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
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        
        Articulo a1= new Articulo(100,"Camisa",120000);
        articulos.add(a1);
        Articulo a2= new Articulo(101,"Jeans",200000);
        articulos.add(a2);
        Articulo a3= new Articulo(102,"Medias",12000);
        articulos.add(a3);
        Articulo a4= new Articulo(103,"CamiSueter",140000);
        articulos.add(a4);
        Articulo a5= new Articulo(104,"Pantalonetas",20000);
        articulos.add(a5);
        
        System.out.println(articulos.size());
        
        // Recorrer la lista y calculo del subtotal
        int unidades;
        for(int i=0; i<articulos.size();i++){
            System.out.println("Articulo: "+articulos.get(i).getDescripcion());
            System.out.print("Cantidad: ");
            unidades=leer.nextInt();
            System.out.println("Articulo: "+articulos.get(i).getDescripcion() + " Subtotal: " + articulos.get(i).facturar(unidades));
                    }
       
        
        //Busqueda y Modificacion de acuerdo al codigo
        
        System.out.println("Ingrese el Codigo a Modificar: ");
        int codigo=leer.nextInt();
        for(int i=0; i<articulos.size();i++){
            if(articulos.get(i).getCodigo()==codigo){
                System.out.println("Ingrese el Nuevo Nombre");
                articulos.get(i).setDescripcion(leer.next());
                
            }
                    }
        
        //Busqueda y Eliminacion
        System.out.println("Ingrese el Codigo a Eliminar: ");
        codigo=leer.nextInt();
        for(int i=0; i<articulos.size();i++){
            if(articulos.get(i).getCodigo()==codigo){
                articulos.remove(i);
                
            }
                    }
        
       
        // Ver el listado General de Articulos
        for(int i=0; i<articulos.size();i++){
           System.out.println("Codigo: " + articulos.get(i).getCodigo() + " Articulo: "+articulos.get(i).getDescripcion() + " Valor: " + articulos.get(i).getValor());
                    }
       
        
        
    }
    
}
