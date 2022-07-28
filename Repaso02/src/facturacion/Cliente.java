/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

/**
 *
 * @author ALEX
 */
public class Cliente {
    
    protected int codigo;
    protected String nombre;

    public Cliente() {
    }

    public Cliente(int codigo) {
        this.codigo = codigo;
    }

    public Cliente(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void mensaje(){
        System.out.println("Soy un Cliente"+ codigo +" "+ nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
    
        
}
