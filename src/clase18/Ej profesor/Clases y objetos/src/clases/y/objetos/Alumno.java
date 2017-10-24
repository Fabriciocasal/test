/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.y.objetos;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    int legajo;
    String nombre;
    int nota;
    
    void estudiarMateria(String materia)
    {
        System.out.println("Estoy estudiando: " + materia);
    }
    
    void mostrarAlumno()
    {
          System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nombre: " + this.nombre + "\n");
        sb.append("Nota: " + this.nota + "\n");
        sb.append("Legajo: " + this.legajo + "\n");
        
        return sb.toString();
    }
    
    
    
}