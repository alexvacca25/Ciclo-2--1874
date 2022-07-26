/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo02;

/**
 *
 * @author ALEX
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacioneMat op1 = new Sumar(4,5);
        op1.operaciones();
        op1.informe();
        
       OperacioneMat op2 = new Operar(2,5,"/");
       op2.operaciones();
       op2.informe();
        
        
    }
    
}
