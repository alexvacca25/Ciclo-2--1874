/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelos.Empleados;
import java.util.ArrayList;

/**
 *
 * @author ALEX
 */
public class GestionEmpleados {
    
    public static ArrayList<Empleados> listaEmpleados = new ArrayList<>();
    
    public static void capturarDatos(int id, String nombre, double salario){
     listaEmpleados.add(new Empleados(id,nombre,salario));
        System.out.println("Datos Almacenados");
    }
    
    public static void modificarDatos(int id, String nombre, double salario){
     
        for(Empleados item: listaEmpleados){
            
            if(item.getId()==id){
                item.setNombre(nombre);
                item.setSalario(salario);
            }
        }
        
        
    }
    
    
}
