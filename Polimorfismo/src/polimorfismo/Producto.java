/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author ALEX
 */
public abstract class Producto {
    private int codigo;
    private String Nombre;

    public Producto(int codigo, String Nombre) {
        this.codigo = codigo;
        this.Nombre = Nombre;
    }
    
    public abstract boolean solicitar();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
            
    
}
