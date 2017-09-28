/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;



import java.io.IOException;
import java.util.Scanner;

/**
 *1.Cargar en un vector de enteros 10 numeros. Mostrarlo
 *2.Ordenarlos de menor a mayor. Mostrarlo.
 *3.Mostrar solo los positivos.
 *4.Mostrar solo los negativos.
 *5.Mostrar los negativos de manera creciente.
 *6.Mostrar los positivos de manera decreciente
 */
public class Vectores {

   
    static final int X = 5;
    public static void main(String[] args)  {
        
        
        
        int i, j, auxInt;
        //int[] vector = {5,-8,-7,3,6,-4,8,-10,5,-9};
        int[] numeros = new int[X];
       
       
               
        Gestion.cargarVector(numeros, X);
        System.out.println("Ingresados");
       
       
        Gestion.mostrarVector(numeros, X);
        System.out.println("Solo Positivos");
        
        
        Gestion.mostrarPositivos(numeros);
        System.out.println("Solo negativos");
        
        
        Gestion.mostrarNegativos(numeros, X);
        System.out.println("Ordenados");
        
        
        Gestion.ordenarVector(numeros, X);
        
        
        Gestion.mostrarVector(numeros, X);
        System.out.println("negativos crecientes");
        
        
        Gestion.mostrarNegativos(numeros, X);
        System.out.println("Positivos  decrecientes");
        
        for(i = numeros.length-1; i>=0; i--)
        {
            if(numeros[i]>0)
            {
                 System.out.println(numeros[i]);
            }
            else
            {
                break;
            }
        }
        
    }
    
}
