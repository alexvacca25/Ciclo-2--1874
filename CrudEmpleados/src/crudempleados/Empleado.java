/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudempleados;

/**
 *
 * @author ALEX
 */
public class Empleado {
    private int codigo;
    private String nombre;
    private String cargo;
    private int horasT;
    private int valorHt;

    public Empleado(int codigo, String nombre, String cargo, int horasT, int valorHt) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargo = cargo;
        this.horasT = horasT;
        this.valorHt = valorHt;
    }
    
    // Calcular el Salario
    
    public double salario(){
        return horasT*valorHt;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public int getValorHt() {
        return valorHt;
    }

    public void setValorHt(int valorHt) {
        this.valorHt = valorHt;
    }
    
    
    
}
