/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;
import java.util.Random;

/**
 *
 * @author alumno
 */
public class Aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Random r=new Random();
     int i;//r.nextDouble()*100 +1)
        for(i=0; i<10; i++)
        {
           System.out.println(Math.floor(Math.random()*10 +1)); 
        }
        
     
        
    }
    
}
