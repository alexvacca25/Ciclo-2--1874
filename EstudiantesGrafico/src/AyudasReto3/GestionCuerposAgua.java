/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AyudasReto3;

import Notas.Nota;
import java.util.ArrayList;

/**
 *
 * @author ALEX
 */
public class GestionCuerposAgua {
     public static ArrayList<CuerpoDeAgua> cuerpos = new ArrayList<CuerpoDeAgua>();
    
    public static void crearCuerposAgua(String tipoCuerpo, 
            String tipoAgua, double irca, String nombre, 
            int idCuerpo, String municipio){
               
        cuerpos.add(new CuerpoDeAgua(tipoCuerpo,tipoAgua,irca,nombre,idCuerpo,municipio));
     }
    
    public static ArrayList<String> calculoNivel(){
         ArrayList<String> listar = new ArrayList<String>();
         int cont=0;
         for(int i=0; i<cuerpos.size();i++){
             
             listar.add(cuerpos.get(i).nivel());
             
             if (cuerpos.get(i).nivel() == "SIN RIESGO" || 
                     cuerpos.get(i).nivel() == "BAJO" || 
                     cuerpos.get(i).nivel() == "MEDIO" )
            {
                cont = cont + 1;
            }
         }
         
                   
       listar.add(Integer.toString(cont));
         
       boolean encontro = false;
        for(int i=0; i<cuerpos.size();i++){
                                     
             if (cuerpos.get(i).nivel() == "MEDIO" )
            {
              listar.add(cuerpos.get(i).getNombre());
              encontro=true;
            }
         }
        
        if(encontro==false)
            listar.add("NA");
       
       
        
        //Indicar el nombre del cuerpo de agua con menor nivel de riesgo y su identificador
        double minor = cuerpos.get(0).getIrca();
        String name = cuerpos.get(0).getNombre();
        
        int id = cuerpos.get(0).getIdCuerpo();
        
        for(int i=0; i <cuerpos.size(); i++){
            
            if(cuerpos.get(i).getIrca()<minor){
                minor = cuerpos.get(i).getIrca();
                name = cuerpos.get(i).getNombre();
                id = cuerpos.get(i).getIdCuerpo();
            }
        }
        
        
        listar.add(name+" "+ id);
        
        //System.out.println("\n"+name+" "+id);
        
        
        
        
        
        
        
        
        
        return listar;
    }
            
    
}
