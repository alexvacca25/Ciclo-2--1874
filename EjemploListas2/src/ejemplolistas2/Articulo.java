/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplolistas2;

/**
 *
 * @author ALEX
 */
public class Articulo {
    
   //Atributos 
    private int codigo;
    private String descripcion;
    private double valor;

  //Constructor  
    public Articulo(int codigo, String descripcion, double valor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.valor = valor;
    }
    
    //Metodo para Facturar
    
    public double facturar(int unidades){
        return valor*unidades;
    }

    
    // Metodos GET y SET
    public int getCodigo() {
        return codigo;
    }

    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
