/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores01;

/**
 *
 * @author ALEX
 */
public class Nota {
    
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public Nota() {
        this.nombre="Sin Datos";
        this.nota1=1.0;        
        this.nota2=1.0;        
        this.nota3=1.0;        
    }

    public Nota(String nombre) {
        this.nombre = nombre;
    }

    public Nota(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    
    public double definitiva(){
        return nota1*0.30+nota2*0.30+nota3*0.40;
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
