/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfimos02;

/**
 *
 * @author ALEX
 */
public class Suma extends OpMatematicas {

    public Suma(int num1, int num2) {
        super(num1, num2);
    }
    
   @Override
   public void calcular(){
       result=num1+num2;
   } 
    
}
