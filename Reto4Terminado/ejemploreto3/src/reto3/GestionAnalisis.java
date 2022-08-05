/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ALEX
 */
public class GestionAnalisis {
    
    public static ArrayList<CuerpoDeAgua> cuerpos = new ArrayList<CuerpoDeAgua>();
    
    public static void capturarDatos(
            String tipoCuerpoAgua, 
            String tipoAgua, 
            String irca, 
            String nombre, 
            String idCuerpoDeAgua, 
            String municipio){
        
        services.insertar(tipoCuerpoAgua, 
                tipoAgua, 
                Float.parseFloat(irca), 
                nombre, 
                Integer.parseInt(idCuerpoDeAgua), 
                municipio);
        
        
        
       /* cuerpos.add(new CuerpoDeAgua(
                tipoCuerpoAgua, 
                tipoAgua, 
                Float.parseFloat(irca), 
                nombre, 
                Integer.parseInt(idCuerpoDeAgua), 
                municipio));
        */
    }
    
    public static ArrayList<String> listaCuerpos(){
        ArrayList<String> listaAdicionar = new ArrayList<String>();
        ResultSet respuesta=services.listar();
        listaAdicionar.clear();
        cuerpos.clear();
         if (respuesta != null){
           try {
                 while (respuesta.next()) {

                     
                listaAdicionar.add(respuesta.getString("id_cuerpo")+" "
                        +respuesta.getString("nombre_cuerpo")+" "
                        +respuesta.getString("municipio") +" "
                        +respuesta.getString("tipo_cuerpo") +" "
                        +respuesta.getString("tipo_agua")+ " "
                        +respuesta.getString("irca")+ " "
                    );
                
                cuerpos.add(
                new CuerpoDeAgua(
                respuesta.getString("tipo_cuerpo"),
                respuesta.getString("tipo_agua"),
                respuesta.getFloat("irca"),
                respuesta.getString("nombre_cuerpo"),
                respuesta.getInt("id_cuerpo"),
                respuesta.getString("municipio")
                              
               )
                );
                              
            }
           } catch (SQLException e) {
           }
         }   
         System.out.println(listaAdicionar);
           return listaAdicionar;
         
    }
    
    public static ArrayList<String> Analisis(){
        ArrayList<String> resultados = new ArrayList<String>();
        resultados.clear();
        int cont=0;
        //Analisis de Riesgo por Cada cuerpo de Agua
        for(int i=0; i<cuerpos.size();i++){
            resultados.add(cuerpos.get(i).nivel());
            
        // Contar los niveles inferriores o iguales a medio
        
        if(cuerpos.get(i).nivel()=="MEDIO" || 
           cuerpos.get(i).nivel()=="BAJO" || 
           cuerpos.get(i).nivel()=="SIN RIESGO")
           cont++; 
        }
        
        resultados.add(Integer.toString(cont));
        
        boolean encontro=false;
        for(int i=0; i<cuerpos.size();i++){
                    
        if(cuerpos.get(i).nivel()=="MEDIO"){
            encontro=true;
            resultados.add(cuerpos.get(i).getNombre());
        }
        
        }
        
        if(encontro==false)
            resultados.add("NA");
               
        
        double menor;
        int pos = 0;
        menor = cuerpos.get(0).getIrca();
        for (int i = 1; i < cuerpos.size(); i++) {
            if (cuerpos.get(i).getIrca() < menor) {
                menor = cuerpos.get(i).getIrca();
                pos = i;
            }
        }
           
      resultados.add(cuerpos.get(pos).getNombre()+" " +cuerpos.get(pos).getIdCuerpoDeAgua());
        
        return resultados;
    }
    
    
    
    
}
