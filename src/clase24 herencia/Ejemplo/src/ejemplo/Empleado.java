/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author alumno
 */
public class Empleado extends Persona {
    
    protected double sueldo;
    protected ePuesto puesto;
    
    public Empleado(String nombre, int edad, double sueldo, ePuesto puesto) {
        super(nombre, edad);
        this.puesto=puesto;
        this.sueldo=sueldo;
    }    
    
    @Override 
    public void hablar()
    {
        System.out.println("Trabajo como: " + this.puesto);
    }
    
    @Override
    public String mostrarDatos()
    {
        
       StringBuilder sb = new StringBuilder();
        sb.append(super.mostrarDatos());
        sb.append("Puesto: " + this.puesto + "\n");       
        sb.append("Sueldo: " + this.sueldo);
        return sb.toString();
    }
    
    public void trabajar()
    {
        System.out.println("Estoy trabajando");
    }
    
}
