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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];
        int i;
       
        ManejarVectores.cargarVectores(vector1, vector2, 5);
        
        ManejarVectores.cargarVector3(vector1, vector2, vector3, 5);
        
        ManejarVectores.mostrarVectores(vector1, vector2, vector3, 5);
        
    }
    
}
