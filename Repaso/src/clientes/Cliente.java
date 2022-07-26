/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

/**
 *
 * @author ALEX
 */
public class Cliente {
   private int id;
   protected String nombre;

    public Cliente() {
    }

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
   
    public void mensaje (){
        System.out.println(4*5);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


   
    
    
}
