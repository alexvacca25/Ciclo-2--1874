/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces02;

/**
 *
 * @author ALEX
 */
public interface Vehiculo {
    public final int VELOCIDAD_MAXIMA=120;
    public abstract String frenar(int cuanto);
    public abstract String acelerar(int cuanto);
    public void apagar();
    
}
