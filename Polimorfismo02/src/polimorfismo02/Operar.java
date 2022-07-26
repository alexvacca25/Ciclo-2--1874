/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo02;

/**
 *
 * @author ALEX
 */
public class Operar extends OperacioneMat {

    public Operar(int num1, int num2, String operador) {
        super(num1, num2, operador);
    }

  @Override
  public void operaciones(){
   
      switch (operador) {
          case "+":
              resultado=num1+num2;
              break;
          case "-":
              resultado=num1-num2;
              break;
          case "x":
              resultado=num1*num2;
              break;
           case "/":
              resultado=(double)num1/(double)num2;
              break;    
          default:
              resultado=0;
      }
    
}
}