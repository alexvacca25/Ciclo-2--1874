/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import models.CuerpoDeAgua;

/**
 *
 * @author ALEX
 */
public class GestionAnalisis {
    
    public static ArrayList<CuerpoDeAgua> listaCuerpos = new ArrayList<>();
    
    public static CuerpoDeAgua capturarDatos(String tipoCuerpo, String tipoAgua, 
            double irca, String nombre, int idCuerpo, String municipio){
        
        CuerpoDeAgua ncuerpo = new CuerpoDeAgua(tipoCuerpo, tipoAgua, irca, nombre, idCuerpo, municipio);
        
        return ncuerpo;
    }
    
}
