/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouno;

/**
 *
 * @author alumno
 */
public class repaso {
    
    public static void main(String[] args) {
        
       // Calculadora.Sumar(12, 23);
        
        int numero;
        String palabra;
        Calculadora MiCalculadora;
        MiCalculadora=new Calculadora();//se crea el objeto con el constructor
        
        MiCalculadora.Primernumero=33;
        MiCalculadora.Segundonumero=0;
       
        int resultado;
        resultado=MiCalculadora.Sumar();
        MiCalculadora.Sumar();
        //System.out.println("resultado: "+resultado);
        
        float resultadoFloat=MiCalculadora.dividir();
        System.out.println("resultado float "+resultadoFloat);
               
        
        
    }
}
