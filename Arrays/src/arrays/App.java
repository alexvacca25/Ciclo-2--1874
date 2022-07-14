/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Arrays;



/**
 *
 * @author ALEX
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       String vector[];
       String datos="1 2 3 4 5";
       vector=datos.split(" ");

      
       
       for(String item: vector){
           System.out.println(item);
       }
        

       int vect[]={1,2,4,8,0,3,9,5};

       Arrays.sort(vect);
              
    }
    
}
