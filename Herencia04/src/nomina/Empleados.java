/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomina;

import facturacion.Persona;

/**
 *
 * @author ALEX
 */
public class Empleados extends Persona {
    private double salarios;

    public Empleados(double salarios, int codigo, String nombre, String apellido, int edad) {
        super(codigo, nombre, apellido, edad);
        this.salarios = salarios;
    }
    
    public void codigosEmpleados(){
        System.out.println("EM"+codigo);
    }

    public double getSalarios() {
        return salarios;
    }

    public void setSalarios(double salarios) {
        this.salarios = salarios;
    }
    
    
    
    
    
    
}
