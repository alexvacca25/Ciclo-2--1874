/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfimos02;

/**
 *
 * @author ALEX
 */
public abstract class OpMatematicas {
    protected int num1;
    protected int num2;
    protected String operador;
    protected double result;

    public OpMatematicas(int num1, int num2, String operador) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
    }

    
    
    public OpMatematicas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void informe(){
        System.out.println("Resultado : "+ result);
    }
    
    public abstract void calcular();

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

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    
    
    
}
