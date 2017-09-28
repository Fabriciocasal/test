
package vectores;

import java.util.Scanner;



public class Gestion {
  
    public static void cargarVector(int[] v, int t)
    {
        int i;
          Scanner lector = new Scanner(System.in);
        for(i=0; i<t; i++)
        {
            System.out.println("Ingrese un numero: ");
            v[i] = lector.nextInt();
        }
    }
    
    public static void mostrarVector(int[] v, int t)
    {
         for(int i=0; i<t; i++)
        {
            System.out.println(v[i]);
        }
    }
    public static void mostrarNegativos(int[] v, int t)
    {
         for(int i=0; i<t; i++)
        {
            if(v[i]<0)
            {
                System.out.println(v[i]);
            }
            
        }
    }
    public static void mostrarPositivos(int[] v)
    {
         for(int i=0; i<v.length; i++)
        {
            if(v[i]>0)
            {
                System.out.println(v[i]);
            }
            
        }
    }
    
    public static void ordenarVector(int[] v, int t)
    {
        int auxInt;
         for(int i=0; i<t-1; i++)
        {
            for(int j=i+1; j<t; j++)
            {
                if(v[i]>v[j])
                {
                   auxInt = v [i];
                   v [i] = v [j];
                   v  [j] = auxInt;
                }
            }
        }
    }
    

}
