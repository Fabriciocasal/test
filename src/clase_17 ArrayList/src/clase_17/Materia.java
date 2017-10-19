
package clase_17;

import java.util.ArrayList;


public class Materia {
    
    public String nombre;
    
    ArrayList <Persona> alumnos; 
    
   
    public Materia (String nombre){
       
        this.alumnos=new ArrayList <Persona>();
       
        this.nombre=nombre;
       
   }
    
    public void mostrar(){
        
        for(Persona p: alumnos) {
            
            System.out.println(p.mostrar());      
        }
       
    }
   
    
    
    
    
    
    
    
    
    
}
