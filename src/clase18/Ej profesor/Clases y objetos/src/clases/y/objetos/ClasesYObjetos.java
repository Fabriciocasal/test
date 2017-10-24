/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.y.objetos;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class ClasesYObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       ArrayList<Alumno> listaAlumnos = new ArrayList<>();
       
       
        
        
        
        
        Alumno miAlumno = new Alumno();
        
        miAlumno.legajo = 987;
        miAlumno.nombre = "Juan";
        miAlumno.nota = 8;
        
        Alumno miAlumno2 = new Alumno();
               
        miAlumno2.legajo = 1000;
        miAlumno2.nombre = "maria";
        miAlumno2.nota = 10;
        
        listaAlumnos.add(miAlumno);
        listaAlumnos.add(miAlumno2);
        
        /*for (Alumno alumnito : listaAlumnos) {
            alumnito.mostrarAlumno();
            alumnito.estudiarMateria("matematica");
        }*/
        
        
        for(int i=0; i<listaAlumnos.size(); i++)
        {
            Alumno a;
            a=listaAlumnos.get(i);
            
            a.mostrarAlumno();
            a.estudiarMateria("Literatura");
            
        }
   
        
        
        
        
        
    }
    
}
