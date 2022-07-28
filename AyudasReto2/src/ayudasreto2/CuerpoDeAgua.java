/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayudasreto2;

/**
 *
 * @author ALEX
 */
public class CuerpoDeAgua {
    private String nombre;
    private int idCuerpo;
    private String Municipio;
    private float irca;

    public CuerpoDeAgua(String nombre, int idCuerpo, String Municipio, float irca) {
        this.nombre = nombre;
        this.idCuerpo = idCuerpo;
        this.Municipio = Municipio;
        this.irca = irca;
    }
    
    
    public String nivel() {
        String riesgo = "";
        if (irca >= 0 && irca <= 5) {
            riesgo = "SIN RIESGO";
        }
        if (irca > 5 && irca <= 14) {
            riesgo = "BAJO";
        }
        if (irca > 14 && irca <= 35) {
            riesgo = "MEDIO";
        }
        if (irca > 35 && irca <= 80) {
            riesgo = "ALTO";
        }
        if (irca > 80 && irca <= 100) {
            riesgo = "INVIABLE SANITARIAMENTE";
        }
        return riesgo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCuerpo() {
        return idCuerpo;
    }

    public void setIdCuerpo(int idCuerpo) {
        this.idCuerpo = idCuerpo;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public float getIrca() {
        return irca;
    }

    public void setIrca(float irca) {
        this.irca = irca;
    }
    
    
    
}
