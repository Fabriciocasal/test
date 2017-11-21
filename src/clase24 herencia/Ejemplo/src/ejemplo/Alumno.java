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
public class Alumno extends Persona {

    protected int nota;
    public Alumno(String nombre, int edad, int nota) {
        super(nombre, edad);
        this.nota=nota;
    }

    @Override
    public void hablar() {
        System.out.println("Estoy estudiando, no molesten");
    }
    
    @Override
    public String mostrarDatos()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mostrarDatos());
        sb.append("Nota: " + this.nota + "\n");       
     
        return sb.toString();
    }
    
    public void estudiar()
    {
        System.out.println("Estoy estudiando");
    }
    
}
