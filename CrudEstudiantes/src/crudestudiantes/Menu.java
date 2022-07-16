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
        
        Scanner leer = new Scanner(System.in);
        
        int idMenu=0;
        boolean salir=false;
        
        String textoMenu="Menu de Opciones \n";
        String[] listaMenu={"Crear Estudiante","Listar Estudiante","Modificar Estudiante","Eliminar Estudiante","Salir"};
        
        for(int i=0; i<listaMenu.length;i++){
            textoMenu=textoMenu+(i+1)+" => "+listaMenu[i] + "\n";
        }
        
        do{
            System.out.println(textoMenu);
            System.out.print("Seleccione una Opcion: ");
            idMenu=leer.nextInt();
            
            switch(idMenu){
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
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    break;
        }
            
                       
        }while(!salir);
        
        
        
        
        
    }
    
}
