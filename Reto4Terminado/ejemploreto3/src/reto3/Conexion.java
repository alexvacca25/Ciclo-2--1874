/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author ALEX
 */
public class Conexion {
         String conexionDb="jdbc:sqlite:reto4.s3db";
         Connection conn=null;
    
    public Conexion(){
         
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(conexionDb);
            System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
            
    }
    
    public int ejecutarSql(String sentenciaSql){
        
        try {
            PreparedStatement pst = conn.prepareStatement(sentenciaSql);
            pst.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println("Consulta"+e);
            return 0;
        }
        
    }
    
    //Metodo para Realizar Consultas
    
    public ResultSet consultarSQL(String sentenciaSql){
        try {
            
            PreparedStatement pst = conn.prepareStatement(sentenciaSql);
            ResultSet response = pst.executeQuery();
            return response;
                        
        } catch (Exception e) {
            System.out.println(e);
            return null;
            
            
        }
    }
    
}
