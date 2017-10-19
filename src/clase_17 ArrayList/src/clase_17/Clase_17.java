/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_17;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Clase_17 {

   
    public static void main(String[] args) {
       // Persona p1 = new Persona("juan");
        
      //  System.out.println(p1.nombre);
        
        
        
      //  Persona p2 = new Persona (213123);
        
        //   System.out.println(p2.legajo);
        
      
         //Persona p3 = new Persona ("juan", 123123, "perez");  
           
           //System.out.println(p3.nombre+" "+p3.apellido+" "+p3.legajo);
           
           
           Materia java = new Materia ("java");
          
           
           java.alumnos.add(new Persona ("juan", 123123, "perez"));
           
           java.alumnos.add(new Persona ("ariel", 34234, "lopez"));
          
           java.alumnos.add(new Persona ("carlos", 234234, "pepa"));
           
           java.alumnos.add(new Persona ("fabricio", 3423423, "pepon"));
           
           java.alumnos.add(new Persona ("marta", 234324, "minga"));
           
           java.mostrar();
           
           
           
           
           
       /* ArrayList lista;
        
        lista = new ArrayList();
        
        //lista.add(1);
        
        lista.add("juan");
        
        lista.add("pepe");
        
        lista.add("lalala");
        
       // lista.add(10);
        
        
        for (Object F : lista) {
        
            //System.out.println(F.toString());
            System.out.println(((String)F).toUpperCase());
            
        }*/
        
       
       
       
       /* ArrayList <String> lista = new ArrayList <String>();
         
        lista.add("asdsad");
        
       
        
        for(String O : lista){
            
            System.out.println(O.toUpperCase());
        }*/
          
    }
   
}

/*class persona{
    
    public String nombre;
    public String apellido;
    public String legajo;
    
    public persona(){
        
        System.out.println("constructor");
    }
    
}*/
