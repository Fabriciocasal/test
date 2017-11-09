
package jframearraylist;

import java.util.ArrayList;



public abstract class Programacion extends Persona{
    //Extendi la clase persona 
    
    public Programacion(ArrayList nombre, ArrayList edad , ArrayList apellido) {
        
        super(nombre, edad , apellido);
    }

    //INGRESOS 
    public void IngresarNombre(String nombres) {
        super.Nombre.add(nombres);
    }
 
    public void IngresarApellido(String apellidos){
        
        super.Apellido.add(apellidos);
    }
    
    public void IngresarEdad(int edad) {
        super.Edad.add(edad);
    }


    /*public void IngresarDni(int dni) {
       super.dni.add(dni);
    }*/
    
    
    //ELIMINAR 
   
    public void EliminarNombre(String nombre) {
      //INDEXOF OBTIENE LA UBICACION DEL ELEMENTO Y CON REMOVE ELIMINAMOS     
       super.Nombre.remove(super.Nombre.indexOf(nombre));
    }
    
    public void EliminarApellido(String apellidos){
        
        super.Apellido.remove(super.Apellido.indexOf(apellidos));
    }  
      
  
    public void EliminarEdad(int edad) {
      
        super.Nombre.remove(super.Edad.indexOf(edad));
    }
    
    /*public void EliminarDni( int dni){
        
        super.dni.remove(super.dni.indexOf(dni));
    }*/
  
    //BUSCAR 
    public  String BuscarNombre(String nombre) {
        
       String buscarnombre="";//DECLARE UNA VARIABLE 
       
       if(super.Nombre.contains(nombre)==true)//si exxiste el nombre es verdadero 
            {  
               buscarnombre=super.Nombre.get(super.Nombre.indexOf(nombre)).toString();
               //busca el nombre, lo identifica y lo convierte a texto 
            }
       else
            {
                buscarnombre="No existe nombre";
            }
             return buscarnombre;
    }
    
    public String BuscarApellido(String apellido){
      
        String buscarapellido="";
        
           if(super.Apellido.contains(apellido)==true)//si exxiste el nombre es verdadero 
            {  
               buscarapellido=super.Apellido.get(super.Apellido.indexOf(apellido)).toString();
               //busca el nombre, lo identifica y lo convierte a texto 
            }
       else
            {
                buscarapellido="No existe nombre";
            }
             return buscarapellido;
    }
    
        
  
    public int BuscarEdad(int edad) {
        
        int buscaredad=0;
        if(super.Edad.contains(edad)==true)
            {
                buscaredad=Integer.parseInt(super.Edad.get(super.Edad.indexOf(edad)).toString());
            }
        else
            {
                buscaredad=0;
            }
        return buscaredad;
       
    }

     
    /*public int BuscarDni(int dni) {
        
        int buscardni=0;
        if(super.Edad.contains(dni)==true)
            {
                buscardni=Integer.parseInt(super.Edad.get(super.Edad.indexOf(dni)).toString());
            }
        else
            {
                buscardni=0;
            }
        return buscardni;
       
    }*/

  


       
    
}
