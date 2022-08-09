/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto4;
import java.sql.ResultSet;

/**
 *
 * @author ALEX
 */
public class crud {
    
    public static void insertar(String tipoCuerpo, 
            String tipoAgua, double irca, String nombre, 
            int idCuerpo, String municipio){
        
        //Creacion del objeto cuerpo de Agua
        CuerpoDeAgua nc = new CuerpoDeAgua(
                tipoCuerpo, 
                tipoAgua, 
                irca, 
                nombre, 
                idCuerpo, 
                municipio);
        
        //Establecer la conexion con la base de datos
        Conexion conectar = new Conexion();
        
        // Definir la consulta para insertar registros a la BD
        String sql;
        sql=String.format("INSERT INTO cuerpoagua(id_cuerpo,nombre_cuerpo,municipio,tipo_cuerpo,tipo_agua,irca)"+
            "VALUES('%s','%s','%s','%s','%s','%s')",
                nc.getIdCuerpo(),
                nc.getNombre(),
                nc.getMunicipio(),
                nc.getTipoCuerpo(),
                nc.getTipoAgua(),
                nc.getIrca()
        );
        
        
        //Se ejecuta el metodo de la clase conexion mediante el obtejo conectar
        
        conectar.ejecutarSQL(sql);
        
        
    }
    
    public static ResultSet listar(){
        Conexion conectar = new Conexion();
        ResultSet respuesta=null;
        try {
             respuesta=conectar.consultaSQL("SELECT *FROM cuerpoagua");
         } catch (Exception e) {
            System.out.println("Listar: "+e);
        }
        
        return respuesta;
    }
    
    public static ResultSet buscarID(int idbusqueda){
         Conexion conectar = new Conexion();
         ResultSet respuesta=null;
         try {
             respuesta=conectar.consultaSQL(
                     "SELECT *FROM cuerpoagua where id_cuerpo='"+idbusqueda+"'");
         } catch (Exception e) {
            System.out.println("Cons. Individual: "+e);
        }
        
         return respuesta;
        
    }
    
    
     public static int modificar(String tipoCuerpo, 
            String tipoAgua, double irca, String nombre, 
            int idCuerpo, String municipio){
         
         Conexion conectar = new Conexion();
         //Creacion del objeto cuerpo de Agua
        CuerpoDeAgua mc = new CuerpoDeAgua(
                tipoCuerpo, 
                tipoAgua, 
                irca, 
                nombre, 
                idCuerpo, 
                municipio);
        
         try {
             String sql;
             sql=String.format("UPDATE cuerpoagua "
                     + "SET nombre_cuerpo='%s',"
                     + "municipio='%s',"
                     + "tipo_cuerpo='%s',"
                     + "tipo_agua='%s',"
                     + "irca='%s'"
                     + "WHERE id_cuerpo='%s'", 
                     mc.getNombre(),
                     mc.getMunicipio(),
                     mc.getTipoCuerpo(),
                     mc.getTipoAgua(),
                     mc.getIrca(),
                     mc.getIdCuerpo());
             
             conectar.ejecutarSQL(sql);
            return 1; 
         } catch (Exception e) {
            System.out.println("Cons. Individual: "+e);
            return 0;
        }
        
                
    }
     
     
      public static int eliminar(int idbusqueda){
         Conexion conectar = new Conexion();
        
         try {
             conectar.ejecutarSQL(
                     "DELETE FROM cuerpoagua where id_cuerpo='"+idbusqueda+"'");
             return 1;
         } catch (Exception e) {
            System.out.println("Cons. Individual: "+e);
            return 0;
        }
        
                 
    }
    
    
    
}
