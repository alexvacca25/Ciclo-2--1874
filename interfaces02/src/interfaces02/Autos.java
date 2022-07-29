/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces02;

/**
 *
 * @author ALEX
 */
public class Autos {
    private String placa;
    private String tipo;
    private int numPasajeros;

    public Autos(String placa, String tipo, int numPasajeros) {
        this.placa = placa;
        this.tipo = tipo;
        this.numPasajeros = numPasajeros;
    }
    
    

    public Autos(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public Autos() {
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    
    
    
}
