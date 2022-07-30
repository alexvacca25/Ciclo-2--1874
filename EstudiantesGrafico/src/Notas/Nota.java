/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

/**
 *
 * @author ALEX
 */
public class Nota extends Estudiante {
    private double n1;
    private double n2;
    private double n3;

    public Nota(double n1, double n2, double n3, int codigo, String nombre) {
        super(codigo, nombre);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    
    public double definitiva(){
        return n1*0.30+n2*0.30+n3*0.40;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    
    
    
    
    

    
}
