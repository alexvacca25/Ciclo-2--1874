/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import models.Apunte;

/**
 *
 * @author ALEX
 */
public class GestionApuntes {
    
    public static ArrayList<Apunte> listaApuntes = new ArrayList<Apunte>();
    
    public static String cargarDatos(int id, String detalle){
        String respuesta="Informacion Incorrecta";
        if(id>=0 && detalle !=""){
        listaApuntes.add(new Apunte(id,detalle));
        respuesta="Datos Almacenados Exitosamente";
        }
        
        return respuesta;
    }
    
    public static String modificarDatos(int id, String detalle){
        String respuesta="Informacion Incorrecta";
        if(id>=0 && detalle !=""){
       
            for(Apunte item: listaApuntes){
                if(item.getId()==id){
                    item.setDetalle(detalle);
                    respuesta="Datos Modificados Exitosamente";
                }
            }
            
        
        }
        
        return respuesta;
    }
    
    
    
}
