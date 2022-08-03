/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author ALEX
 */
public class utilidades {
    
    public static int validarEnteros(String campo){
        int resultado;
        try {
            resultado=Integer.parseInt(campo);
        } catch (Exception e) {
            resultado=-1;
        }
        
        return resultado;
    }
    
}
