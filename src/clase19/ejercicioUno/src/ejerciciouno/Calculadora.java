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
public class Calculadora {
    
    public int Primernumero;
    public int Segundonumero;
    
    Calculadora(){
        
        this.Primernumero=10;
        this.Segundonumero=10;
    }
    
    /**
     * 
     * @param numeroUno primer numero
     * @param numeroDos segundo numero
     */

//    public static void Sumar(int numeroUno, int numeroDos) 
//    {
//        int suma=numeroUno+numeroDos;
//        System.out.println("la suma es "+suma);
//    
//    }
   
    
    /**
    * de instancia o de objeto por eso no va el static
    */
    public int Sumar(){
       
       int suma=this.Primernumero+this.Segundonumero;
        //System.out.println("la suma es "+suma);
        return suma;
   }
   
    public float dividir(){
        float resultado=0;
        
//        if(this.Segundonumero==0)
//        {
//        }
//        else
//        {
//            resultado= (float)this.Primernumero/(float)this.Segundonumero;
//        }
        
        if(this.SePuedeDividir())
        {
            resultado= (float)this.Primernumero/(float)this.Segundonumero;
        }
        return resultado;
    }
    
    /**
     * retorna true si el segundo numero es distinto de 0
     * @return 
     */
    private boolean SePuedeDividir(){
        boolean retorno=false;
        if(this.Segundonumero!=0)
        {
            retorno= true;
        }
        return retorno;
    }
    
}
