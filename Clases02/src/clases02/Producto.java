/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases02;

/**
 *
 * @author ALEX
 */
public class Producto {
    private int codigo;
    private int precioC;
    private int cantB;
    private int cantR;

    public Producto(int codigo, int precioC, int cantB, int cantR) {
        this.codigo = codigo;
        this.precioC = precioC;
        this.cantB = cantB;
        this.cantR = cantR;
    }

public boolean solicitar(){
    return cantB<=cantR;
}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioC() {
        return precioC;
    }

    public void setPrecioC(int precioC) {
        this.precioC = precioC;
    }

    public int getCantB() {
        return cantB;
    }

    public void setCantB(int cantB) {
        this.cantB = cantB;
    }

    public int getCantR() {
        return cantR;
    }

    public void setCantR(int cantR) {
        this.cantR = cantR;
    }




    
    
    
}
