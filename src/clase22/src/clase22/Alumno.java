/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase22;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    String Nombre;
    String Apellido;
    int Legajo;
    private int nota1,nota2;
    private float notaFinal;
    
    
void estudiar(int n1, int n2){

this.nota1=n1;
this.nota2=n2;
}

void CalcularNotaFinal(){
    if(nota1>=4 && nota2>=4){
        
        Random R=new Random();
        notaFinal=R.nextInt();
    }

else{
   notaFinal=-1;
}
   
}
public void mostrarNota(){
        
    System.out.println(notaFinal);
        
    
    }
}