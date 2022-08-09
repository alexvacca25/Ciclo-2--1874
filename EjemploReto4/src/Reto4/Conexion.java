/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AyudasReto3;

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
    String conexionDB="jdbc:sqlite:reto4.s3db";
    Connection conn=null;
    
    //Constructor Establece la conexion con la base de datos
    public Conexion(){
        try {
        Class.forName("org.sqlite.JDBC");
        conn=DriverManager.getConnection(conexionDB);
            System.out.println("Conexion Exitosa...");
            
        } catch (Exception e) {
            System.out.println("Conexion: "+e);
        }
    }
    
    //Metodo para ejecutar sentencias sin retorno //INSERT
    public int ejecutarSQL(String setenciaSQL){
        
        try {
            PreparedStatement pst=conn.prepareStatement(setenciaSQL);
            pst.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println("Sentencias: " + e);
            return 0;
        }
                
    }
    
     //Metodo para ejecutar sentencias que espera por un resultados // SELECT
    public ResultSet consultaSQL(String setenciaSQL){
        try {
            PreparedStatement pst=conn.prepareStatement(setenciaSQL);
            ResultSet response = pst.executeQuery();
            return response;
        } catch (SQLException e) {
            System.out.println("Consultas: "+e);
            return null;
        }
    }
    
}
