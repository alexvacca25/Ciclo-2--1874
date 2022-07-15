/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores;

/**
 *
 * @author ALEX
 */
public class Calificacion {
    private String nombre;
    private double n1;
    private double n2;
    private double n3;

    public Calificacion() {
        this.nombre="Sin Nombre";
        this.n1=1.0;
        this.n2=2.0;
        this.n3=3.0;
    }

   public double NotaDefinitiva(){
       return n1*0.30+n2*0.30+n3*0.40;
   }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
