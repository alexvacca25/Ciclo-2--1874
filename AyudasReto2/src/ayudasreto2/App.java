/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayudasreto2;

import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public class App {  //OJO DEBE LLAMARSE reto2

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        // define cuantos datos se capturan
        int n=Integer.parseInt(leer.nextLine());
        CuerpoDeAgua[] cuerpos = new CuerpoDeAgua[n];
        
        // Captura de los datos
        for(int i=0; i<n; i++){
            String [] datos = leer.nextLine().split(" ");
           
            cuerpos[i]=new CuerpoDeAgua(datos[0], Integer.parseInt(datos[1]), datos[2], Float.parseFloat(datos[3]));
        }
        
        leer.close();
        
        
       //Nivel de Riesgo por cada Cuerpo de Agua
        for(CuerpoDeAgua elem: cuerpos){
            System.out.println(elem.nivel());
        }
        //Contar los cuerpos de agua con Riego Medio o Inferior
        int cont=0;
        
        for (int i=0; i<n; i++){    

            //    Indicar cuántos cuerpos de agua tienen un nivel de riesgo MEDIO o inferior.
            String nivel = cuerpos[i].nivel();
            if (nivel == "SIN RIESGO" || nivel == "BAJO" || nivel == "MEDIO" )
            {
                cont = cont + 1;
            }
        }
        System.out.println(cont);
        
    }
    
}
