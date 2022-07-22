/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

/**
 *
 * @author ALEX
 */
public class CuerpoDeAgua {
    
    private String nombreC;
    private int idCuerpoAgua;
    private String municipio;
    private double irca;

    public CuerpoDeAgua(String nombreC, int idCuerpoAgua, String municipio, double irca) {
        this.nombreC = nombreC;
        this.idCuerpoAgua = idCuerpoAgua;
        this.municipio = municipio;
        this.irca = irca;
    }
    
    // Metodo nivel
    
    public String nivel(){
     String riesgo="";   
    if(irca >= 0 && irca <= 5){
        riesgo="SIN RIESGO";}
    if(irca > 5 && irca <= 14){
        riesgo="BAJO"; }
    if(irca > 14 && irca <= 35){
        riesgo= "MEDIO"; }
    if(irca > 35 && irca <= 80){
        riesgo="ALTO";}
    if(irca > 80 && irca <= 100){
        riesgo="INVIABLE SANITARIAMENTE"; }
    
    return riesgo;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getIdCuerpoAgua() {
        return idCuerpoAgua;
    }

    public void setIdCuerpoAgua(int idCuerpoAgua) {
        this.idCuerpoAgua = idCuerpoAgua;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public double getIrca() {
        return irca;
    }

    public void setIrca(double irca) {
        this.irca = irca;
    }
    
    
    
    
}
