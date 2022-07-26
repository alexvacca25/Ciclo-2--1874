/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomina;

import clientes.Cliente;

/**
 *
 * @author ALEX
 */
public class Empleado extends Cliente {
    private String cargo;

    public Empleado(String cargo, int id, String nombre) {
        super(id, nombre);
        this.cargo = cargo;
    }
    
    @Override
    public void mensaje (){
        System.out.println("Nombre Empleado: "+ nombre);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
}
