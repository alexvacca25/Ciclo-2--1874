/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo02;

/**
 *
 * @author ALEX
 */
public class Sumar extends OperacioneMat {

    public Sumar(int num1, int num2) {
        super(num1, num2);
    }
    
    @Override
  public void operaciones(){
      resultado=num1+num2;
  }  
    
}
