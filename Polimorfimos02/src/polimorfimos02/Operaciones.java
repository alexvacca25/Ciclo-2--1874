/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfimos02;

/**
 *
 * @author ALEX
 */
public class Operaciones extends OpMatematicas {

    public Operaciones(int num1, int num2, String operador) {
        super(num1, num2, operador);
    }
    
    @Override
    public void calcular(){
        
        switch (operador) {
            case "+" -> result=num1+num2;
            case "-" -> result=num1-num2;
            case "x" -> result=num1*num2;
            case "/" -> result=(double)num1/(double)num2;    
            
        }
        
    }
    
    
    
}
