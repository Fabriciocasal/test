/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

/**
 *
 * @author chori
 */
public class Botones {
    
    private static FRMformulario Formulario;
    private static Personas persona[];
    private static int contador;
    
    public static void main(String[] args) {
        
        Formulario = new FRMformulario();
        persona = new Personas[100];
        
        for (int i = 0; i < 100; i++) {
            
            persona[i]=new Personas();
            
        }
        contador=0;
        
        Formulario.setVisible(true);
    }
    public static void guardar (String n, String a, String c, int cel){
       
        persona[contador].setNombre(n);
        persona[contador].setApellido(a);
        persona[contador].setCorreo(c);
        persona[contador].setCelular(cel);
        
        contador++;
    }
            
    public static void buscar(String bus){
        
        for (int j = 0; j < persona.length; j++) {
            if(persona[j].getNombre().equals(bus)){
                Formulario.cargardatos(persona[j]);
            }
        }
    }
    
}
