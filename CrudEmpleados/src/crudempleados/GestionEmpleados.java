/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudempleados;

import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public class GestionEmpleados {
    
    public static Empleado[] empleados ;
    
    public static void CrearEmpleados(){
        Scanner leer = new Scanner(System.in);
        int num;
        int codigo;
        String nombre;
        String cargo;
        int horasT;
        int valorHt;
        
        System.out.println("Cuantos Empleados Desea Adicionar: ");
        num=leer.nextInt();
        empleados=new Empleado[num];
        
        for(int i=0; i<num; i++){
            System.out.println("Ingrese el Empleado Numero: => "+(i+1));
            System.out.println("------------------------------------");
            System.out.print("Codigo  : ");
            codigo=leer.nextInt();
            System.out.print("Nombre  : ");
            nombre=leer.next();
            System.out.print("Cargo   : ");
            cargo=leer.next();
            System.out.print("Horas T.: ");
            horasT=leer.nextInt();
            System.out.print("Valor H.: ");
            valorHt=leer.nextInt();
            
            empleados[i]= new Empleado(codigo,nombre,cargo,horasT,valorHt);
                        
        }
        
        
    }
    
    public static void ListarEmpleados(){
        
        System.out.println("-----------------------------");
        System.out.println("Listado General de Empleados");
        System.out.println("-----------------------------");
        
        for (int i=0; i<empleados.length; i++){
           System.out.println((i+1)+" => "+ GestionEmpleados.empleados[i].getNombre()+ " " + GestionEmpleados.empleados[i].getCargo() );   
           System.out.println("---------------------------");    
        }
        
    }
    
    public static void ModificarEmpleados(){
        
    }
    
    public static void EliminarEmpleados(){
        
    }
    
    
}
