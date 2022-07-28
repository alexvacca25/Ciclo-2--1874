/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso02;

import facturacion.Cliente;
import facturacion.GestionClientes;
import facturacion.Minoristas;
import java.util.ArrayList;


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
       ArrayList<Cliente> clientes = new ArrayList<Cliente>();
       ArrayList<Minoristas> listaMinoristas = new ArrayList<Minoristas>();
        
        Cliente c1= new Cliente();
        c1.mensaje();
        c1.setCodigo(1001);
        c1.setNombre("Pedro Perez");
        c1.mensaje();
               
       
        clientes.add(c1);
        System.out.println(clientes.size());
        
        GestionClientes.mensaje(1001,"Alex Vacca",1065);
        
        Minoristas m1 = new Minoristas(0.1, 1050, "Juan Perez");
        listaMinoristas.add(m1);
        
        m1.mensaje();
        
        
        
        
        
        
        
        
        
    }
    
}
