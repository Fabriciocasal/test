/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ManejarVectores {
    
    public static void cargarVectores(int[] v1, int[] v2, int tam)
    {
        Scanner lector = new Scanner(System.in);
        int i;
        
        for(i=0; i<tam; i++)
        {
            System.out.println("Ingrese un numero para Vector 1: ");
            v1[i] = lector.nextInt();
            System.out.println("Ingrese un numero para Vector 2: ");
            v2[i] = lector.nextInt();
        } 
    }
    
    public static void cargarVector3(int[] v1, int[] v2, int[] v3, int tam)
    {
        int i;
        for(i=0; i<5; i++)
        {
            if(v1[i]>v2[i])
            {
                v3[i]=v1[i];
            }
            else
            {
                 v3[i]=v2[i];
            }
        }
    }
    
    public static void mostrarVectores(int[] v1, int[] v2, int[] v3, int tam)
    {
        System.out.println("Vector 1\tVector2\tVector3\n");
        int i;
             
        for(i=0; i<5; i++)
        {
            System.out.println(v1[i] + "\t\t" + v2[i]+ "\t\t" + v3[i]);
        }
    }
            
    
}
