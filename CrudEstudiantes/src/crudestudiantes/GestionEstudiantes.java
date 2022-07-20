/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudestudiantes;

import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public class GestionEstudiantes {
    
    private static Estudiante[] estudiantes;
   
    
    public static void CrearEstudiantes(){
        Scanner leer = new Scanner(System.in);
        
        int num;
        int codigo;
        String nombre;
        double nota1;
        double nota2;
        double nota3;
        
        System.out.println("Numero de Estudiantes a Ingresar");
        num=leer.nextInt();
        estudiantes = new Estudiante[num];
        
        for (int i=0; i<num;i++){
        System.out.println("Datos del Estudiante Numero: " + (i+1));
        boolean existe=false;
        do{
        System.out.print("Ingrese el Codigo: ");
        codigo=leer.nextInt();
        existe=BuscarEstudiante(codigo);
        }while(!existe);
        
        System.out.print("Ingrese el Nombre: ");
        nombre=leer.next();
        System.out.print("Ingrese la Nota 1: ");
        nota1=leer.nextDouble();
        System.out.print("Ingrese la Nota 2: ");
        nota2=leer.nextDouble();
        System.out.print("Ingrese la Nota 3: ");
        nota3=leer.nextDouble();
        
        estudiantes[i] = new Estudiante(codigo,nombre,nota1,nota2,nota3);
        
        
        }
        
        
    }
    
    public static void ListarEstudiantes(){
        
        if(estudiantes != null){
            System.out.println("-----------------------------");
            System.out.println("Lista General de estudiantes");
            System.out.println("-----------------------------");
        
        for(int i=0; i<GestionEstudiantes.estudiantes.length; i++)
        {
         if(estudiantes[i] !=null){   
         System.out.println((i+1)+ " => " + estudiantes[i].getCodigo()+ "  " + estudiantes[i].getNombre() +" "+ estudiantes[i].getNota1() +" "+estudiantes[i].getNota2()+" "+estudiantes[i].getNota3()+ " = "+ estudiantes[i].definitiva()  );
         }
        }
        }else{
            System.out.println("No hay Estudiantes ...2");
        }
    }
    
    public static void ModificarEstudiantes(){
        
        Scanner leer = new Scanner(System.in);
        ListarEstudiantes();
        
        System.out.println("Ingrese el Codigo de Estudiante a Modificar");
        int codigo=leer.nextInt();
        boolean busqueda=false;
        
        for(int i=0; i<estudiantes.length; i++){
            if(estudiantes[i] !=null){
            if (estudiantes[i].getCodigo()==codigo){
                System.out.println("Ingrese la Nueva Nota 1: ");
                estudiantes[i].setNota1(leer.nextDouble());
                 System.out.println("Ingrese la Nueva Nota 2: ");
                estudiantes[i].setNota2(leer.nextDouble());
                 System.out.println("Ingrese la Nueva Nota 3: ");
                estudiantes[i].setNota3(leer.nextDouble());
            }
            }else{
                busqueda=true;
            }
        }
        
        if(busqueda){
            System.out.println("CODIGO NO EXISTE");
        }
        
        
    }
    
    public static void EliminarEstudiantes(){
       Scanner leer = new Scanner(System.in);
        ListarEstudiantes();
        Estudiante[] estudiantesEliminar= new Estudiante[estudiantes.length];
        
        System.out.println("Ingrese el Codigo a Eliminar: ");
        int codigo=leer.nextInt();
        boolean busqueda=false;
        int j=0;
        for (int i=0; i<estudiantes.length;i++)
        {
            if(estudiantes[i].getCodigo()==codigo){
                
            }else{
                estudiantesEliminar[j]=estudiantes[i];
                j++;        
            }
        }
        
        estudiantes=estudiantesEliminar;
        
        
    }
    
    public static void AnalisisEstudiante(){
         System.out.println("-----------------------------");
            System.out.println("Resultado de estudiantes");
            System.out.println("-----------------------------");
        
        for(int i=0; i<GestionEstudiantes.estudiantes.length; i++)
        {
         System.out.println((i+1)+ " => " + estudiantes[i].getCodigo()+ "  " + estudiantes[i].getNombre() +" "+ estudiantes[i].analisis()  );
        }
    }
    
    public static boolean BuscarEstudiante(int codigo){
        
               
        boolean encontrado=true; 
        
        if(estudiantes != null){
                    
        for(int i=0; i<GestionEstudiantes.estudiantes.length; i++)
        {
        if(estudiantes[i] != null){
            
         if(estudiantes[i].getCodigo()==codigo){
             encontrado=false;
         } else{
             encontrado=true;
         }
         
        }else{
            encontrado=true;
        }
            
        }
        
        } else{
            encontrado=true;
        }
        
        return encontrado;
}
    
}

        
    

