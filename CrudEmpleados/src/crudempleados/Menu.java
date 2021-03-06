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
public class Menu {
    
    public static void opciones(){
        
        int idMenu=0;
        boolean salir=false;
        
        //String textoMenu=Menu.opcionesMenu();
        
        do{
            idMenu=selectorMenu(opcionesMenu());
            
            switch(idMenu){
                
                case 1:
                    GestionEmpleados.CrearEmpleados();
                    break;
                case 2:
                   GestionEmpleados.ListarEmpleados();
                    break;
                case 3:
                   GestionEmpleados.ModificarEmpleados();
                    break;
                case 4:
                   GestionEmpleados.EliminarEmpleados();
                    break;
                case 5:
                    GestionEmpleados.reporteSalarios();
                    break;
                case 6:
                    salir=true;
                    break;
            }
        }while(!salir);
        
        
    }
    
    private static int selectorMenu(String textoMenu){
        
        Scanner leer = new Scanner(System.in);
        System.out.println(textoMenu);
        System.out.print("Seleccione una Opcion del Menu: ");
        return leer.nextInt();
    }
    
    private static String opcionesMenu(){
        String textoMenu="Menu Principal \n";
        String[] listaMenu={"Crear Empleados","Listar Empleados","Modificar Empleados","Eliminar Empleados","Reporte Salarios","Salir"};
        for(int i=0; i<listaMenu.length; i++){
            textoMenu=textoMenu+ (i+1) + " => " + listaMenu[i] + "\n";
        }
        return textoMenu;
    }
}
