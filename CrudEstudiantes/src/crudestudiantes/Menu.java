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
public class Menu {
    
    public static void opciones(){
        
      
        
        int idMenu=0;
        boolean salir=false;
        
       
        
        do{
            
            switch(selectorMenu(textoMenu())){
                case 1:
                    GestionEstudiantes.CrearEstudiantes();
                    break;
                case 2:
                    GestionEstudiantes.ListarEstudiantes();
                    break;
                case 3:
                    GestionEstudiantes.ModificarEstudiantes();
                    break;
                case 4:
                    GestionEstudiantes.EliminarEstudiantes();
                    break;
                case 5:
                    GestionEstudiantes.AnalisisEstudiante();
                    break;    
                case 6:
                    salir=true;
                    break;
                default:
                    break;
        }
            
                       
        }while(!salir);
        
        
        
        
        
    }
    
   
    public static String textoMenu(){
        String textoMenu="Menu de Opciones \n";
        String[] listaMenu={"Crear Estudiante","Listar Estudiante","Modificar Estudiante","Eliminar Estudiante","Reporte de Resultado","Salir"};
        
        for(int i=0; i<listaMenu.length;i++){
            textoMenu=textoMenu+(i+1)+" => "+listaMenu[i] + "\n";
        }
        
        return textoMenu;
    }
    
    
    public static int selectorMenu(String textoMenu){
           Scanner leer = new Scanner(System.in);
            System.out.println(textoMenu);
            System.out.print("Seleccione una Opcion: ");
            return leer.nextInt();
    }
    
    
    
}
