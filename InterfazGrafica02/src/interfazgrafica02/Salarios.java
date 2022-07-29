/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazgrafica02;

/**
 *
 * @author ALEX
 */
public class Salarios {
    int numHoras;
    double valorHoras;

    public Salarios(int numHoras, double valorHoras) {
        this.numHoras = numHoras;
        this.valorHoras = valorHoras;
    }
    
    public String calcular(){
        return Double.toString(numHoras*valorHoras);
       
    }
    
}
