/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazgrafica02;

import java.util.ArrayList;

/**
 *
 * @author ALEX
 */
public class GestionSalario {
    
    public static ArrayList<Salarios> listasalarios = new ArrayList<Salarios>();
    
    public static void capturarDatos(int numHora, double valorHora){
        Salarios op = new Salarios(numHora,valorHora);
       listasalarios.add(op);            
    }
    
}
