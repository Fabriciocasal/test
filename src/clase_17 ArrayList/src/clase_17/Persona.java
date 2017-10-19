/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_17;


 
public class Persona {
    
    public String nombre;
    public String apellido;
    public int legajo;
    
    
    public Persona (String nombre){
        
        this.nombre=nombre;
    }
    public Persona (int legajo){
        
        this.legajo=legajo;
    }

    
    public Persona (String nombre, int legajo, String apellido){
        //se tienen que declarar por separado, sino no sabe a que String llama
        
        this.nombre=nombre;
        this.legajo=legajo;
        this.apellido=apellido;
    }
    
         public String mostrar() {
        return nombre + ", " + apellido + ", " + legajo ;
  
    }
}
