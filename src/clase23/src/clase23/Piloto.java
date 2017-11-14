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
public class Piloto {
    
    private String Nombre;
    private String Apellido;
    
    public Piloto()
    {
        this.Nombre="natalia";
        this.Apellido="natalia";
    }

    public void setterNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setterApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    public String DameNombreCompletoMay()
    {
        String retorno="";
        
        retorno= this.Nombre+" "+this.Apellido;
        retorno= retorno.toUpperCase();
        
  
        return retorno;
    }
}
