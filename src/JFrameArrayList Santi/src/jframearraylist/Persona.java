
package jframearraylist;

import java.util.ArrayList;


public abstract class Persona {
//Agregamos sus atributos 
    
ArrayList Nombre;
ArrayList Apellido;
ArrayList Edad;
//ArrayList dni;

//INSERTE CONSTRUCTOR 

    public Persona(ArrayList Nombre, ArrayList Edad , ArrayList Apellido) {
        
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Apellido = Apellido;
       // this.dni=dni;
        
    }

//INSERTAMOS getter and setter

    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getEdad() {
        return Edad;
    }

    public void setEdad(ArrayList Edad) {
        this.Edad = Edad;
    }

    public void setApellido(ArrayList Apellido) {
        this.Apellido = Apellido;
    }

    public ArrayList getApellido() {
        return Apellido;
    }

    /*public ArrayList getDni() {
        return dni;
    }

    public void setDni(ArrayList dni) {
        this.dni = dni;
    }*/
    
    
    
    
    
    //INGRESE LOS METODOS QUE VOY A UTILIZAR
    
    //INGRESO
    public abstract void IngresarNombre(String nombres);
    public abstract void IngresarApellido(String apellido);
    public abstract void IngresarEdad(int edad);

    
    //ELIMINAR
    public abstract void EliminarNombre(String nombres);
    public abstract void EliminarApellido(String apellido);
    public abstract void EliminarEdad(int edad);

            
    
    //BUSCAR
    //SE LE PASA AL PULIC ABSTRACT EL VALOR DEL TIPO DE DATO
    public abstract String BuscarNombre(String nombre);
    public abstract String BuscarApellido(String apellido);
    public abstract int BuscarEdad(int edad);


    
}
