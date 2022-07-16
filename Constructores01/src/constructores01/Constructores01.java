/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructores01;

import java.util.HashSet;

/**
 *
 * @author ALEX
 */
public class Constructores01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="Pedro Perez";
        String nombre1="Maria Diaz";
        double nota1=4.0;
        double nota2=3.5;
        double nota3=3.0;
        
        // Creacion del objeto con constructor vacio
        Nota est = new Nota();
        Nota est1 = new Nota(nombre1);
        
        // Ver los atributos del objecto mediante los mtodos GET
        System.out.println("Nombre : "+est.getNombre());
        System.out.println("Nota1  : "+est.getNota1());
        System.out.println("Nota2  : "+est.getNota2());
        System.out.println("Nota3  : "+est.getNota3());
        
        // Ver el objeto con constructor con un parametro
        
        System.out.println("Nombre : "+est1.getNombre());
        System.out.println("Nota1  : "+est1.getNota1());
        System.out.println("Nota2  : "+est1.getNota2());
        System.out.println("Nota3  : "+est1.getNota3());
        
        // Enviando los valores a las variables de instancia del objeto
        est.setNombre(nombre);
        est.setNota1(nota1);
        est.setNota2(nota2);
        est.setNota3(nota3);
        
        System.out.println("Nombre : "+est.getNombre());
        System.out.println("Nota1  : "+est.getNota1());
        System.out.println("Nota2  : "+est.getNota2());
        System.out.println("Nota3  : "+est.getNota3());
        
        // Actualizar Nota 1 a Estudiante 1
        
        est1.setNota1(4.8);
        System.out.println("Nombre : "+est1.getNombre());
        System.out.println("Nota1  : "+est1.getNota1());
        System.out.println("Nota2  : "+est1.getNota2());
        System.out.println("Nota3  : "+est1.getNota3());
        
        // Crear nuevo objeto con todos los parametros
        
        Nota est2 = new Nota("Leo Messi",4,3,5);
        System.out.println("Nombre : "+est2.getNombre());
        System.out.println("Nota1  : "+est2.getNota1());
        System.out.println("Nota2  : "+est2.getNota2());
        System.out.println("Nota3  : "+est2.getNota3());
        
        // Manejo de metodos estaticos
        
        System.out.println("Nota Definitiva desde la clase : " + Metodos.definitiva(5,4,5));
        System.out.println("Color: "+ Metodos.color);
        
        for(String elem: Metodos.vocales){
            System.out.println("Vocales : "+elem);
        }
        
        Nota est3 = new Nota("Alex Vacca",5,4,5);
        
        System.out.println("Nota desde el Objeto: "+ est3.definitiva());
        
        
        
    }
    
}
