/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        
        ArrayList<Persona> miLista = new ArrayList<>();
        ArrayList<Persona> miLista2 = new ArrayList<>();
        
        File miFile = null;  
        
        ObjectOutputStream oos;
        ObjectInputStream ois; 
        
        
        miFile = new File("D:\\actualizar\\Personas.dat");
        
        oos = new ObjectOutputStream(new FileOutputStream(miFile));
        
       miLista.add(new Persona(23,"juan"));
        miLista.add(new Persona(21,"maria"));
        miLista.add(new Persona(45,"luis"));
        
        oos.writeObject(miLista);
        oos.close();
        
              
        ois = new ObjectInputStream(new FileInputStream(miFile));

        miLista2 = (ArrayList<Persona>) ois.readObject();

        ois.close();
        
       

       for (Persona persona : miLista2) {
            System.out.println(persona.toString());
        }
        
        
    }
    
}
