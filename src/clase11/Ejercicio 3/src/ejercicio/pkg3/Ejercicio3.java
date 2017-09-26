/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] preguntas = new String[5];
        String[] respuestas = new String[5];
        String[] respuestasUsuario = new String[5];
        int[] puntuacion = new int[5];
        int i;
        int acum = 0;
        int opcion;
        Scanner lector = new Scanner(System.in);
        Scanner lector2 = new Scanner(System.in);
        
        for(i=0; i<5; i++)
        {
            puntuacion[i] = 0;
        }
        
        do
        {
            System.out.println("1. Cargar Preguntas\n2. Jugar\n3. Mostrar Puntaje.\n4. Salir\nElija una opcion: ");
            opcion = lector.nextInt();
            switch(opcion)
            {
                case 1:
                    for(i=0; i<3; i++)
                    {
                        System.out.println("Ingrese su pregunta: ");
                        preguntas[i] = lector2.nextLine();
                      
                        System.out.println("Ingrese la respuesta correcta: ");
                        respuestas[i] = lector2.nextLine();
                    }
                    break;
                case 2:
                     for(i=0; i<3; i++)
                    {
                        System.out.println(preguntas[i] + "?: ");
                       
                       
                        respuestasUsuario[i] = lector2.nextLine();
                    }
                    
                    break;
                case 3:
                    
                    
                    for(i=0; i<3; i++)
                    {
                        if(respuestas[i].equals(respuestasUsuario[i]))
                        {
                            puntuacion[i]=10;
                        }
                        
                    }
                    
                    System.out.println("Pregunta\t\tRespuesta\t\tUd Respondio\t\tPuntaje\n");
                    for(i=0; i<3; i++)
                    {
                        System.out.println(preguntas[i]+"\t\t"+respuestas[i]+"\t\t"+respuestasUsuario[i]+"\t\t"+puntuacion[i]+"\n");
                    }
                    
                    for(i=0; i<3; i++)
                    {
                        acum = acum + puntuacion[i];
                    }
                    
                    System.out.println("Ud Sumo " + acum + " puntos");
                    
                    break;
            }
            
        }while(opcion!=4);
        
    }
    
}
