/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;


public class persona{


private static int legajo;
private static String nombre;
private static String apellido;

 

  public static int getLegajo(){
     return legajo;      
   }
  public static void setLegajo (int legajo){
      
      persona.legajo=legajo;
  }
        
    
  
    public static String getnombre(){
        return nombre;
    }
    public static void setnombre(String nombre){
        
        persona.nombre=nombre;
    }
    
    
    
    public static String getapellido(){
        return apellido;
    }
    public static void setapellido (String apellido){
        persona.apellido=apellido;
    }
}
