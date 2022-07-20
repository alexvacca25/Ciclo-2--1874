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
    
    private static Empleado[] empleados ;
    
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
      
        if(empleados==null){
            System.out.println("No Existen Datos Para Mostrar");
        }else{
        System.out.println("------------------------------------");
        System.out.println("Listado General de Empleados");
        System.out.println("------------------------------------");
      
        for (int i=0; i<empleados.length; i++){
           if(empleados[i]!=null){ 
           System.out.println((i+1)+" => "+ empleados[i].getCodigo()+" " + empleados[i].getNombre()+ " " + empleados[i].getCargo()+ " " +empleados[i].getHorasT()+" " + empleados[i].getValorHt() );   
           System.out.println("-----------------------------------");    
           }
        }
        }
    }
    
    public static void ModificarEmpleados(){
        
        if(empleados==null){
            System.out.println("No Existen Datos para Modificar...");
        }else{
            
        Scanner leer = new Scanner(System.in);
        ListarEmpleados();
        System.out.println("Ingrese el Codigo a Modificar: ");
        int codigo= leer.nextInt();
        boolean encontrar=false;
               
        
        for(int i=0;i<empleados.length; i++){
            if(empleados[i].getCodigo()==codigo){
                
                System.out.print("Nombre  : ");
                empleados[i].setNombre(leer.next());
                System.out.print("Cargo   : ");
                empleados[i].setCargo(leer.next());
                System.out.print("Horas T :");
                empleados[i].setHorasT(leer.nextInt());
                System.out.print("Valor Ht: ");
                empleados[i].setValorHt(leer.nextInt());
                
                System.out.println("Datos Modificados...");
                
            }else{
                encontrar=true;
            }
            
        }
        
        if(encontrar){
            System.out.println("Empleado No Existe");
        }
    
        }
        
    }
    
    public static void EliminarEmpleados(){
        Scanner leer= new Scanner(System.in);
        ListarEmpleados();
        System.out.println("Ingrese el Codigo a Eliminar: ");
        int codigo=leer.nextInt();
        Empleado[] eliminarEmpleados = new Empleado[empleados.length];
        
        int j=0;
        for(int i=0; i<empleados.length;i++){
            if(empleados[i]!=null){
            if(empleados[i].getCodigo()==codigo){
                
            }else
            {
                eliminarEmpleados[j]=empleados[i];
                j++;        
            }
            }
        }
                
        empleados=eliminarEmpleados;
        
       
    }
    
    public static void reporteSalarios(){
        
        double sumaTotal=0;
         if(empleados==null){
            System.out.println("No Existen Datos Para Mostrar");
        }else{
        System.out.println("------------------------------------");
        System.out.println("Listado General de Empleados");
        System.out.println("------------------------------------");
      
        for (int i=0; i<empleados.length; i++){
           if(empleados[i]!=null){ 
           System.out.println((i+1)+" => "+ empleados[i].getCodigo()+" " + empleados[i].getNombre()+ " " + empleados[i].salario());   
           System.out.println("-----------------------------------"); 
           sumaTotal=sumaTotal + empleados[i].salario();
           
           }
        }
             System.out.println("----------------------------");
             System.out.println("Nomina Total: "+ sumaTotal);
             System.out.println("----------------------------");
        }
        
    }
    
    
}
