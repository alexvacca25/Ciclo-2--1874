/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;

import java.sql.ResultSet;

/**
 *
 * @author ALEX
 */
public class services {
    
        
    public static void insertar(String tipoCuerpoAgua, String tipoAgua, float irca, String nombre, int idCuerpoDeAgua, String municipio){
        
       CuerpoDeAgua nc = new CuerpoDeAgua(tipoCuerpoAgua, 
                tipoAgua, 
                irca, 
                nombre, 
                idCuerpoDeAgua, 
                municipio);
       
       Conexion conectar = new Conexion();
       String sql;
       /*
       sql="INSERT INTO cuerpoagua(id_cuerpo,nombre_cuerpo,municipio,tipo_cuerpo,tipo_agua,irca)"+
           "VALUES(NULL,'A','A','A','A','50')";
       */
       sql = String.format("INSERT INTO "
                + "cuerpoagua(id_cuerpo, nombre_cuerpo, municipio, tipo_cuerpo, tipo_agua, irca)"
                + "VALUES(null,'%s','%s','%s','%s','%s')" ,
                nc.getNombre(),nc.getMunicipio(),
                nc.getTipoCuerpoAgua(), nc.getTipoAgua(),nc.getIrca());

       conectar.ejecutarSql(sql);
    }
    
    public static ResultSet listar(){
       
        Conexion conectar = new Conexion();
        ResultSet respuesta=null;
           try {
               respuesta= conectar.consultarSQL("SELECT *FROM cuerpoagua");
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
           System.out.println(respuesta);
        return respuesta;
        
    }
    
}
