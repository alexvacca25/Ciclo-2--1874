/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;

/**
 *
 * @author ALEX
 */
public class Crud {
    
    public static void insertar(String tipoCuerpoAgua, 
            String tipoAgua, float irca, String nombre, 
            int idCuerpoDeAgua, String municipio){
        
        CuerpoDeAgua nc = new CuerpoDeAgua(
                tipoCuerpoAgua, 
                tipoAgua, 
                irca, 
                nombre, 
                idCuerpoDeAgua, 
                municipio);
        
        Conexion conectar = new Conexion();
        
        String sql;
        sql=String.format("INSERT INTO cuerpoagua"
                + "(id_cuerpo,nombre_cuerpo,municipio,tipo_cuerpo,tipo_agua,irca)"
                + "VALUES('%s','%s','%s','%s','%s','%s')", 
                 nc.getIdCuerpoDeAgua(),
                 nc.getNombre(),
                 nc.getMunicipio(),
                 nc.getTipoCuerpoAgua(),
                 nc.getTipoAgua(),
                 nc.getIrca());
        
          conectar.ejecutarSQL(sql);
    }
    
}
