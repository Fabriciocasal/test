
package clase18;

import java.util.ArrayList;


public class Clase18 {

    
    public static void main(String[] args) {
      
        ArrayList <Alumno>lala=new ArrayList <Alumno>();
      
        Alumno lector = new Alumno();
        
       // lector.nombre = "juan";
        //lector.apellido = "gonzalez";
       // lector.edad = 30;
          
       // lala.add(lector);
        
        lala.add(new Alumno("juan" , "asdasd" , 23));  //corregir
        
        for (Alumno minga : lala) {
            
            minga.mostrarInfo();
            minga.estaCursando("asdasd");
        }
        
        
    }
    
}
