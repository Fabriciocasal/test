/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriesnumeroespeciales;

import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Series {
    
   public static void MostrarDel1al100(){
       
       
       }
       
       public static void MostrarParesDel1al100(){
       
       for(int numero = 0; numero < 100; numero++)
       { 
           if(numero%2==0){//mostrar de a pares
               System.out.println("el numero es "+numero);
           }  
       }    
       }
       /**
        * mostrar los numero del 1 al 100
        * si el numero es multiplo de 3, reemplazamos el numero por UTN
        * si el numero es multiplo de 5, reemplazamos el numero por FRA
        * si el numero es multiplo de 3 y 5, reemplazamos el numero por UTN-FRA
        */
       public static void MostrarSerieUTNFRA(){
           
           for(int numero = 1; numero < 101; numero++)
       { 
           if(numero%3==0){
               
              System.out.println("UTN");
           }
           else if(numero%5==0)
           {
               System.out.println("FRA");
           }
           if (numero%3==0 || numero%5==0)//arreglar
           {
               System.out.println("UTN-FRA");
           }
           System.out.println("el numero es "+numero);
       }
       }
       
       public static void MostrarNumerosPrimosEntreRangos(int min, int max){
    
           for(int numero = min; numero < max; numero++)
       
           if(Numeros.EsPrimo(numero)==true)
       { 
           System.out.println("el numero es "+numero);
       }
           
       }
}
       
       
   
    

