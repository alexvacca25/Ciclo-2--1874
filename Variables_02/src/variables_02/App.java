/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables_02;

import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Comentario de Linea
        
        /*
        Comentar un 
        Bloque
        */
        
        /*
        int numero1=5;
        int numero2;
        numero2=10;
        String nombre="Alex Vacca";
        double salario=1000;
        
        System.out.println("Numero 1: "+numero1);
        System.out.println("Numero 2: "+numero2);
        System.out.println("Suma    : "+(numero1+numero2));
        System.out.println("Nombre  : "+nombre);
        System.out.println("Salario : "+salario);
        
        String numero3="25";
        int numConvertido=Integer.parseInt(numero3);
        System.out.println("Conversion : "+(numConvertido*2));
        
        System.out.println("25"+(numero3));
        
        String vrSalario="1200000";
        double vrSalarioFinal=Double.parseDouble(vrSalario);
        System.out.println("Salario : "+ vrSalarioFinal*1.10);
        
        int cantidad=55;
        String nombreCantidad=Integer.toString(cantidad);
        System.out.println("Conversion a String: "+ nombreCantidad);
        
        int a=5;
        int b=10;
        
        a=a+b;
        a=a*2;
        a=a+b;
        
        System.out.println("a: "+ a +" b: "+ b);
        
        */
        /*
        int num1=10;
        int num2=3;
        
        System.out.println("Suma  : "+ (num1+num2));
        System.out.println("Resta : "+ (num1-num2));
        System.out.println("Mul   : "+ (num1*num2));
        System.out.println("Div   : "+ (num1/num2));
        System.out.println("Div   : "+ ((double)num1/(double)num2));
        System.out.println("Modulo: "+ (num1%num2));
        System.out.println("Modulo: "+ Math.pow((double)num1,(double)num2));
        */
        
        Scanner leerDatos = new Scanner(System.in);
        
        
        
        /*
        System.out.print("Ingrese la Edad: ");
        int edad=leerDatos.nextInt();
        System.out.println("La edad Digita es: "+ edad);
        */
        
       /*
        System.out.print("Ingrese la Edad: ");
        int edad=leerDatos.nextInt();
        System.out.print("Ingrese el Salario: ");
        double salario=leerDatos.nextDouble();
                
        if(edad>=18){
            System.out.println("Mayor de Edad y Salario "+ salario);
        }else{
            System.out.println("Menor de Edad y Salario: "+ salario);
        }
        */
       
       /*
        System.out.print("Horas Trabajadas: ");
        int horasTrab=leerDatos.nextInt();
        System.out.print("Valor Horas Trabajadas: ");
        int vrhorasTrab=leerDatos.nextInt();
        
        
        if (horasTrab>10 && horasTrab<=20){
            
            System.out.println("Salario : " +((vrhorasTrab*horasTrab)+ (vrhorasTrab*horasTrab)*0.1));
        
        } else if(horasTrab>20 && horasTrab<=30){
            System.out.println("Salario : " + ((vrhorasTrab*horasTrab)+ (vrhorasTrab*horasTrab)*0.2));
        
        } else if(horasTrab>30 && horasTrab<=40){
            
            System.out.println("Salario : " + ((vrhorasTrab*horasTrab)+ (vrhorasTrab*horasTrab)*0.3));
        }else if(horasTrab>40 && horasTrab<=50){
            
            System.out.println("Salario : " + ((vrhorasTrab*horasTrab)+ (vrhorasTrab*horasTrab)*0.4));
        } else if(horasTrab>50) {
            
            System.out.println("Salario : " + ((vrhorasTrab*horasTrab)+ (vrhorasTrab*horasTrab)*0.5));
        }
        
        */
        
       /*
        int edad=25;
        boolean vacunado=false;
        
        if (edad>=18){
            
            if(vacunado==true){
                
                System.out.println("Acceso Permitido");
                
            }else{
                
                System.out.println("Acceso Denegado 2");
            }
            
            
        }else{
            System.out.println("Acceso Denegado 1");
        }
        
        */
       
       /*
       System.out.println("Ingrese una Opcion: ");
       int opMenu=leerDatos.nextInt();
       
       switch(opMenu){
           
           case 1 -> System.out.println("Inicio");
           case 2 -> System.out.println("Productos");
           case 3 -> {
               System.out.println("Clientes");
               System.out.println("Ver Clientes");
                       }
           case 4 -> System.out.println("Ventas");
           case 5 -> System.out.println("Salir");
           default -> System.out.println("Ingrese una Opcion Valida");
       }
       */
       
       int n;
       n=0;
       while(n<10){
           System.out.println(" While Numero : " + n);
           n++;
       }
       
       n=0;
       do{
           System.out.println("do While: Numero : " + n);
           n++;
           
       }while(n<10);
       
       System.out.println("Ingrese el Numero a Multiplicar: ");
       int mult=leerDatos.nextInt();
       for (int i=1; i<=9; i++){
           System.out.println(i +  " X " + mult + " = " + (mult*i));
           
       }
       
       
       
       
       
       
       
       
       
        
        
        
        
              
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
