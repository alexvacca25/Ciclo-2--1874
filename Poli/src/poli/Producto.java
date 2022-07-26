/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poli;

/**
 *
 * @author ALEX
 */
public abstract class Producto {
    private int codigo;
    private String nombre;

      

    public Producto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    //Metodo Astrabto - Si Tenemos metodos abstracto se deben implementar
    //Obligatoriamente en las clases hijas.
    public abstract boolean solicitar();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      
    
    
            
    
}
