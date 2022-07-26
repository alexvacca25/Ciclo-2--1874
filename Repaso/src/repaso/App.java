/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import clientes.Cliente;
import clientes.Extranjero;
import clientes.Nacional;
import nomina.Empleado;

/**
 *
 * @author ALEX
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente nuevoC = new Cliente(1009, "Alex");
        nuevoC.mensaje();
        
        Nacional clienteNuevo = new Nacional(1065, 1010, "Juan");
        clienteNuevo.mensaje();
        
        Extranjero clienteNuevoE= new Extranjero("EU101201", 1011, "Jhony");
        clienteNuevoE.mensaje();
        
        Empleado empleadoNuevo = new Empleado("Director", 1020, "Juan Perez");
        
        empleadoNuevo.mensaje();
     
        
    }
    
}
