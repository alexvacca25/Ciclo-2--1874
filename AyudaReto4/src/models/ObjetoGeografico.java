/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ALEX
 */
public class ObjetoGeografico {
    private String nombre;
    private int idCuerpo;
    private String municipio;

    public ObjetoGeografico(String nombre, int idCuerpo, String municipio) 
    {
        this.nombre = nombre;
        this.idCuerpo = idCuerpo;
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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

    
}
