
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public class reto1 {

           
       public static void niveles(double num){
        if(num >= 0 && num <= 5){System.out.println("SIN RIESGO");}
        if(num > 5 && num <= 14){System.out.println("BAJO"); }
        if(num > 14 && num <= 35){System.out.println("MEDIO"); }
        if(num > 35 && num <= 80){System.out.println("ALTO");}
        if(num > 80 && num <= 100){System.out.println("INVIABLE SANITARIAMENTE"); }
        }
    
    public static void main(String args[]) {        
       
        int num;
        double promedio;
        double suma = 0;
        
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        double datos[] = new double[num];
        
        for(int i = 0; i< num; i++){
            datos[i] = leer.nextDouble();
            suma += datos[i];
        }
        
        Arrays.sort(datos);
        promedio = suma/num;
              
        
        niveles(promedio);
        niveles(datos[num-1]);
        niveles(datos[0]);
    }
    }
    

