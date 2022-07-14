/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases03;

/**
 *
 * @author ALEX
 */
public class Empleado {
    
    // Atributos
    int codigo;
    String nombre;
    int horasTrab;
    int valorHora;

    //Constructor    codigo=cod, nombre=nom

    public Empleado(int codigo, String nombre, int horasTrab, int valorHora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
    }
    
    // Metodo Para Validar las horas Trabajadas
    
  public boolean bonificar(){
      
        return horasTrab>80;
      
  }
  
  public void mensaje(){
      
        if(bonificar()){
            System.out.println("Bonificacion OK");    
        }else{
            System.out.println("Sin Bonificacion");
        }
      
  }

  
    
    
    
}
