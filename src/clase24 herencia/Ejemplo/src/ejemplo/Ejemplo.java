/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
     
        ArrayList<Persona> miLista = new ArrayList<>();
        
        Empleado e1 = new Empleado("Juan", 25, 15000, ePuesto.operario);
        Empleado e2 = new Empleado("luis", 39, 36000, ePuesto.gerente);
        Alumno a1 = new Alumno("Maria",19,4);
        miLista.add(e1);
        miLista.add(e2);
        miLista.add(a1);
        
        for (Persona p : miLista) {
            System.out.println(p.mostrarDatos());
            
            if(p instanceof Empleado)
            {
                ((Empleado)p).trabajar();
            }
            else
            {
               ((Alumno)p).estudiar();
            }
        }
    }
    
}
