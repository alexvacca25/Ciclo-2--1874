/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;

/**
 *
 * @author ALEX
 */
public class CuerpoDeAgua extends ObjetoGeografico {
    private String tipoCuerpoAgua;
    private String tipoAgua;
    private float irca;

    public CuerpoDeAgua(String tipoCuerpoAgua, String tipoAgua, float irca, String nombre, int idCuerpoDeAgua, String municipio) {
        super(nombre, idCuerpoDeAgua, municipio);
        this.tipoCuerpoAgua = tipoCuerpoAgua;
        this.tipoAgua = tipoAgua;
        this.irca = irca;
    }
    
    public String nivel(){
        String nivel = "";
         if(getIrca() >= 0 && getIrca() <= 5){
              nivel = "SIN RIESGO";
         }else{
             if(getIrca() > 5 && getIrca() <= 14){
                 nivel = "BAJO";
             }else{
                 if(getIrca() > 14 && getIrca() <= 35){
                     nivel = "MEDIO";
                 }else{
                     if(getIrca() > 35 && getIrca() <= 80){
                         nivel = "ALTO";
                     }else{
                         if(getIrca() > 80 && getIrca() <= 100){
                            nivel = "INVIABLE SANITARIAMENTE"; 
                         }
                     }
                 }
             }
         }
         return nivel;
    }
    

    public String getTipoCuerpoAgua() {
        return tipoCuerpoAgua;
    }

    public void setTipoCuerpoAgua(String tipoCuerpoAgua) {
        this.tipoCuerpoAgua = tipoCuerpoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public float getIrca() {
        return irca;
    }

    public void setIrca(float irca) {
        this.irca = irca;
    }
    
    
    
    
    
}
