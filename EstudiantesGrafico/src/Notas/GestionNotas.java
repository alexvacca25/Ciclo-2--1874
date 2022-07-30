/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

import java.util.ArrayList;

/**
 *
 * @author ALEX
 */
public class GestionNotas {
    
    public static ArrayList<Nota> notas = new ArrayList<Nota>();
    
    public static void crearEstudiantes(int codigo, String nombre, double n1, double n2, double n3 ){
               
        notas.add(new Nota(n1, n2, n3, codigo, nombre));
     }
    
    public static ArrayList<String> resultados(){
         ArrayList<String> listar = new ArrayList<String>();
         
         for(int i=0; i<notas.size();i++){
             listar.add("Definitiva: " + notas.get(i).definitiva());
         }
        
        return listar;
    }
            
            
    
    
}
