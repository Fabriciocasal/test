/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21;

/**
 *
 * @author alumno
 */
public class Rectagulo {
    
    private float _ancho;
    private float _alto;

    float _perimetro;
    
    
    public Rectagulo(){
        
        _alto = 5;
        _ancho = 9;
     }
    
    public Rectagulo(float ancho,float alto){
        
        _alto = alto;
        _ancho = ancho;
     
    }
    
    public float CalcularPerimetro(){
        
        float per;
        per = 2* _alto + 2* _ancho;
        
        return per;
    }

    
    
}
