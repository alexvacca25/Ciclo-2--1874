/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases04;

/**
 *
 * @author ALEX
 */
public class Estudiante {
    
    // Definifion de Atributos Privados
    private int codigo;
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

   
    public Estudiante(int codigo, String nombre, double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Metodo Para Calcular la Definitiva Nota1*30% + Nota2*30% + Nota3*40%
    
    public double definitiva(){
    return nota1*0.30+nota2*0.30+nota3*0.40;
    }
    
    //Metodo Para Calcular si Aprobo o Reprobo la Materia definitiva>3.0
    
    public boolean resultado(){
       return definitiva()>3.0;
    }
    
    
    // Setter y Getter
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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    
    
    
    
    
}
