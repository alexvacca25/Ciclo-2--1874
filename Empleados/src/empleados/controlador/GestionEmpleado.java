/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados.controlador;
import empleados.modelo.Empleado;
import java.sql.ResultSet;

/**
 *
 * @author ALEX
 */
public class GestionEmpleado {
    
    public static Empleado capturarDatos(int id, int codigo,String nombre,double horas,double valorh){
        
        Empleado nuevoEmpleado = new Empleado(id,codigo,nombre,horas,valorh);
        
        return nuevoEmpleado;
    }
    
     public static ResultSet listarDatos(){
        
          Conexion conectar = new Conexion();
          
          ResultSet respuesta=null;
          
           try {
            
               respuesta= conectar.consultarSQL("SELECT *FROM Empleados");
           
                                
        } catch (Exception e) {
            System.out.println("Error: "+ e);
            
        }
        
        
        return respuesta;
    }
    
}
