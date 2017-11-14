/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase23;

/**
 *
 * @author alumno
 */
public class FormulaUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carrera NuevaCarrera = new Carrera();
        
        NuevaCarrera.CorrerCarrera(5);
        
        Auto Ganador = NuevaCarrera.DameElGanador();
        
        Ganador.Mostrar();
    }
    
}
