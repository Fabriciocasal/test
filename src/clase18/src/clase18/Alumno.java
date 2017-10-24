/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase18;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    String nombre;
    String apellido;
    int edad;
    
    void estaCursando (String materia)
    {
        
        System.out.println("este esta cursado: "+ materia);
        
    }
    
    void mostrarInfo ()
    {
        
        System.out.println(this.nombre + " " + this.apellido + " " + this.edad);
        
    }
    
}
