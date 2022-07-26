/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo02;

/**
 *
 * @author ALEX
 */
public abstract class OperacioneMat {
    protected int num1;
    protected int num2;
    protected String operador;
    protected double resultado;

    public OperacioneMat(int num1, int num2, String operador) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
    }
    
    

    public OperacioneMat(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void informe(){
        System.out.println(resultado);
        
    }
    
    public abstract void operaciones();

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
    
}
