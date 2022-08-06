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
    String conexionDB="jdbc:sqlite:bdreto4.s3db";
    Connection conn=null;
    
    public Conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(conexionDB);
            System.out.println("Conexion Exitosa...");
        } catch (Exception e) {
            System.out.println("Conexion : "+e);
        }
    }
    
    public int ejecutarSQL(String setenciaSQL){
        try {
            PreparedStatement pst=conn.prepareStatement(setenciaSQL);
            pst.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println("Consulta 1 :"+e);
            return 0;
        }
    }
    
    public ResultSet consultaSQL(String setenciaSQL){
        
        try {
            PreparedStatement pst=conn.prepareStatement(setenciaSQL);
            ResultSet response=pst.executeQuery();
            return response;
        } catch (SQLException e) {
            System.out.println("Consulta 2: "+e);
            return null;
        }
        
        
    }
    
}
