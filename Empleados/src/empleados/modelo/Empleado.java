/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados.modelo;

/**
 *
 * @author ALEX
 */
public class Empleado {
    private int id;
    private int codigo;
    private String nombre;
    private double horasT;
    private double valorHt;

    public Empleado() {
    }
    

    public Empleado(int id, int codigo, String nombre, double horasT, double valorHt) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasT = horasT;
        this.valorHt = valorHt;
    }

    public double getValorHt() {
        return valorHt;
    }

    public void setValorHt(double valorHt) {
        this.valorHt = valorHt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHorasT() {
        return horasT;
    }

    public void setHorasT(double horasT) {
        this.horasT = horasT;
    }
    
    
    
}
