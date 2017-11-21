package ejemplo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public abstract class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String mostrarDatos()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: " + this.nombre + "\n");
        sb.append("Edad: " + this.edad + "\n");       
        return sb.toString();
    }
     
  
    public abstract void hablar();
   
    
}
